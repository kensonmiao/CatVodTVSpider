package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import dalvik.system.DexClassLoader;

public class Init {

    public static Context CONTEXT;
    private static String ORIGIN_API_ID = "";

    public static String getOriginApiId() {
        return ORIGIN_API_ID;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public static void init(Context context) throws Exception {
        CONTEXT = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "cat_vod", 0);
        String configLink = sharedPreferences.getString("sss_api_config_id", "");
        ORIGIN_API_ID = configLink;
        String mySecretKey = "";
        String[] myConfigLinkToArr = configLink.split(";");
        if (myConfigLinkToArr.length == 3) {
            mySecretKey = myConfigLinkToArr[2];
            configLink = myConfigLinkToArr[0];
        }
        String myConfig = OkHttpUtil.string(configLink, null);
        String myRealConfig = decodeConfig(mySecretKey, myConfig);
        JSONObject configObj = new JSONObject(myRealConfig);
        JSONArray siteArr = configObj.getJSONArray("sites");
        List<String> existingJarFileNames = new ArrayList<>();
        for (int i = 0; i < siteArr.length(); i++) {
            try {
                JSONObject siteObj = siteArr.getJSONObject(i);
                if (siteObj.getString("api").equals("csp_Teleport")) {
                    SpiderDebug.log("Found: " + siteObj.getString("key"));
                    String encryptedExt = siteObj.getString("ext");
                    String decryptedExt = encryptedExt.startsWith("{") ? encryptedExt :
                            decryptTeleportConfig(encryptedExt);
                    if (!decryptedExt.isEmpty()) {
                        JSONObject extObj = new JSONObject(decryptedExt);
                        String teleportTo = extObj.getString("from");
                        String key = extObj.getString("key");
                        Teleport.TeleportModel model = null;
                        if (Teleport.JAR_MAPPER.containsKey(teleportTo)) {
                            model = Teleport.JAR_MAPPER.get(teleportTo);
                            JSONArray theSites = model.teleConfig.getJSONArray("sites");
                            JSONObject originalConfig = getMatchedSite(theSites, key);
                            model.originalSiteJson.put(key, originalConfig);
                        } else {
                            model = new Teleport.TeleportModel();
                            model.fromLink = teleportTo;
                            String secretKey = "";
                            String realTeleportLink = "";
                            String[] teleportToArr = teleportTo.split(";");
                            if (teleportToArr.length == 3) {
                                secretKey = teleportToArr[2];
                                realTeleportLink = teleportToArr[0];
                            }
                            String theConfig = OkHttpUtil.string(
                                    realTeleportLink.isEmpty() ? teleportTo : realTeleportLink, null);
                            String theRealConfig = decodeConfig(secretKey, theConfig);
                            if (theRealConfig.isEmpty())
                                continue;
                            JSONObject theRealConfigObj = new JSONObject(theRealConfig);
                            model.teleConfig = theRealConfigObj;
                            String jarLink = theRealConfigObj.getString("spider");
                            boolean isJarInImg = jarLink.startsWith("img+");
                            jarLink = jarLink.replace("img+", "");
                            String[] jarLinkArr = jarLink.split(";");
                            String jarFileName = "test.jar";
                            boolean fileExist = false;
                            if(jarLinkArr.length == 3) {
                                jarFileName = jarLinkArr[2] + ".jar";
                                File file = new File(Teleport.getAppJarDir(context),jarFileName);
                                fileExist = file.exists();
                                if(fileExist){
                                    model.jarName = jarFileName;
                                    SpiderDebug.log("Reloaded the Jar --------" + jarFileName);
                                }
                            }
                            if (!fileExist) {
                                String jar = OkHttpUtil.string(jarLinkArr[0], null);
                                if (jar.isEmpty())
                                    continue;
                                byte[] jarInByte = new byte[0];
                                if (isJarInImg)
                                    jarInByte = decodeSpider(jar);

                                if (jarLinkArr.length == 3)
                                    jarFileName = jarLinkArr[2] + ".jar";
                                else
                                    jarFileName = getMD5(new String(jarInByte, StandardCharsets.UTF_8)) + ".jar";

                                File jarFile = new File(Teleport.getAppJarDir(context).getAbsolutePath(), jarFileName);
                                DataOutputStream outputStreamWriter = new DataOutputStream(new FileOutputStream(jarFile));
                                try {
                                    outputStreamWriter.write(jarInByte);
                                    outputStreamWriter.flush();
                                } catch (Exception ex) {}
                                finally {
                                    outputStreamWriter.close();
                                }
                                SpiderDebug.log("Saved Jar --------" + jarFileName);
                            }

                            JSONArray theSites = model.teleConfig.getJSONArray("sites");
                            JSONObject originalConfig = getMatchedSite(theSites, key);
                            model.originalSiteJson.put(key, originalConfig);

                            model.jarName = jarFileName;
                            existingJarFileNames.add(model.jarName);

                            //Load Parsers
                            LinkedHashMap<String, HashMap<String, String>> parsers = getParsers(theRealConfigObj);
                            model.parsersMap = parsers;
                            SpiderDebug.log("Done to load Parsers --------" + teleportTo);
                            SpiderDebug.log("Done to get Teleport Config for --------" + key);
                            Teleport.JAR_MAPPER.put(teleportTo, model);
                        }
                    }
                }
            } catch (Exception ex) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                ex.printStackTrace(pw);
                SpiderDebug.log(ex.getMessage());
                SpiderDebug.log(sw.toString());
            }
        }
        //Delete useless jar(s)
        File jarFolder = new File(Teleport.getAppJarDir(context).getAbsolutePath());
        for(File jarFile : jarFolder.listFiles()) {
            if(jarFile.getName().endsWith(".jar") && !existingJarFileNames.contains(jarFile.getName())) {
                String dexName = jarFile.getName().replace(".jar", ".dex");
                jarFile.delete();
                File dexFile = new File(Teleport.getAppDexDir(context).getAbsolutePath(), dexName);
                if(dexFile.exists())
                    dexFile.delete();
            }
        }
        SpiderDebug.log("自定义爬虫代码加载成功！");
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static String decryptTeleportConfig(String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            IvParameterSpec iv = new IvParameterSpec("2143658709123456".getBytes(StandardCharsets.UTF_8));
            byte[] keyInByte = "CryptedIsN@thing".getBytes(StandardCharsets.UTF_8);
            SecretKey originalKey = new SecretKeySpec(keyInByte, 0, keyInByte.length, "AES");
            cipher.init(Cipher.DECRYPT_MODE, originalKey, iv);
            byte[] plainText = cipher.doFinal(Base64.decode(str, 0));
            return new String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static String decodeConfig(String secretKey, String data) {
        if(data.startsWith("{"))
            return data;
        String decodedStr = "";

        int startedPoint = data.indexOf("**");
        if(startedPoint > 0) {
            decodedStr = new String(Base64.decode(data.substring(startedPoint + 2), 0));
        }

        if(decodedStr.startsWith("{"))
            return decodedStr;

        if(secretKey.isEmpty()) {
            if(decodedStr.startsWith("2423")) {
                int suffixPos = decodedStr.indexOf("2324");
                String pwdInHax = decodedStr.substring(4, suffixPos);
                String pwd = new String(hexStringToByteArray(pwdInHax), StandardCharsets.UTF_8);
                String roundtimeInHax = decodedStr.substring(decodedStr.length() - 26);
                String roundtime = new String(hexStringToByteArray(roundtimeInHax), StandardCharsets.UTF_8);
                decodedStr = decodedStr.substring(suffixPos + 4, decodedStr.length() - 26);
                byte[] ivInByte = (roundtime + "0000000000000000".substring(0, roundtime.length()))
                        .getBytes(StandardCharsets.UTF_8);
                byte[] key = (pwd + "0000000000000000".substring(0, pwd.length()))
                        .getBytes(StandardCharsets.UTF_8);
                try {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    IvParameterSpec iv = new IvParameterSpec(key);
                    SecretKey originalKey = new SecretKeySpec(key, 0, key.length, "AES");
                    cipher.init(Cipher.DECRYPT_MODE, originalKey, iv);
                    byte[] plainText = cipher.doFinal(Base64.decode(decodedStr, 0));
                    return new String(plainText);
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            }
        } else {
            try {
                Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
                byte[] keyInByte = (secretKey + "0000000000000000".substring(0, secretKey.length()))
                        .getBytes(StandardCharsets.UTF_8);
                SecretKey originalKey = new SecretKeySpec(keyInByte, 0, keyInByte.length, "AES");
                cipher.init(Cipher.DECRYPT_MODE, originalKey);
                byte[] plainText = cipher.doFinal(Base64.decode(decodedStr, 0));
                return new String(plainText);
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        return "";
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static byte[] decodeSpider(String data) {

        int startedPoint = data.indexOf("**");
        if(startedPoint > 0) {
            return Base64.decode(data.substring(startedPoint + 2), 0);
        }
        return data.getBytes(StandardCharsets.UTF_8);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static String getMD5(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(data.getBytes(StandardCharsets.UTF_8));
        byte[] digest = md.digest();
        return String.format("%032x", new BigInteger(1, digest)).toLowerCase();
    }

    private static JSONObject getMatchedSite(JSONArray siteArr, String key) throws JSONException {
        for (int i = 0; i < siteArr.length(); i++) {
            JSONObject site = siteArr.getJSONObject(i);
            if(site.getString("key").equals(key))
                return site;
        }
        return null;
    }

    private static LinkedHashMap<String, HashMap<String, String>> getParsers(JSONObject myConfig) {
        LinkedHashMap<String, HashMap<String, String>> maps = new LinkedHashMap<>();
        try {
            JSONArray parsers = myConfig.getJSONArray("parses");
            for (int i = 0; i < parsers.length(); i++) {
                try {
                    JSONObject parser = parsers.getJSONObject(i);

                    HashMap<String, String> parserInMap = new HashMap<>();
                    for (Iterator<String> it = parser.keys(); it.hasNext(); ) {
                        String parserKey = it.next();
                        parserInMap.put(parserKey, parser.get(parserKey).toString());
                    }
                    maps.put(parser.getString("name"), parserInMap);
                } catch (Exception ex) {
                    StringWriter sw = new StringWriter();
                    PrintWriter pw = new PrintWriter(sw);
                    ex.printStackTrace(pw);
                    SpiderDebug.log(ex.getMessage());
                    SpiderDebug.log(sw.toString());
                }
            }
        } catch (JSONException e) {
            SpiderDebug.log(e.getMessage());
        } finally {

        }
        return maps;
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len/2];

        for(int i = 0; i < len; i+=2){
            data[i/2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i+1), 16));
        }

        return data;
    }
}
