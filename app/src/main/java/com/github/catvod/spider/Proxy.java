package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.live.TxtSubscribe;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import dalvik.system.DexClassLoader;

public class Proxy extends Spider {

    public static int foundPort = -1;

    private static Map<String, Class> teleProxy = new HashMap<>();

    private static SharedPreferences sharedPreferences = null;

    public void init(Context context) {
        sharedPreferences = context.getSharedPreferences(context.getPackageName() + "cat_vod", 0);
        for (Teleport.TeleportModel model: Teleport.JAR_MAPPER.values()) {
            try {
                DexClassLoader loader = Teleport.getClassLoader(context, model.jarName);
                Class targetClass = loader.loadClass("com.github.catvod.spider.Proxy");
                teleProxy.put(model.fromLink, targetClass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public static Object[] proxy(Map<String, String> params) {
        try {
            String what = params.get("do");
            SpiderDebug.log("I'm the proxy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Yeah!!!");
            if (what.startsWith("teleproxyLink-")) {
                int indexDbluscore = what.indexOf("__");
                String proxyKey = what.substring(14, indexDbluscore);
                proxyKey = new String(Base64.decode(proxyKey, 0), StandardCharsets.UTF_8);
                if(teleProxy.containsKey(proxyKey)) {
                    SpiderDebug.log("Used proxy key -------" + proxyKey);
                    Class proxyClass = teleProxy.get(proxyKey);
                    params.put("do", what.substring(indexDbluscore + 2));
                    Object[] returnedData = null;
                    try {
                        String originalConfigId = "";
                        if(sharedPreferences != null) {
                            originalConfigId = sharedPreferences.getString("sss_api_config_id", "");
                            sharedPreferences.edit().putString("sss_api_config_id", proxyKey);
                        }
                        returnedData = (Object[]) proxyClass.getMethod("proxy").invoke(null, params);
                        if(!originalConfigId.isEmpty())
                            sharedPreferences.edit().putString("sss_api_config_id", originalConfigId);
                    } catch (Exception ex) {
                        SpiderDebug.log(ex.getMessage());
                    }
                } else {
                    SpiderDebug.log("Proxy key NOT FOUND -------" + proxyKey);
                }

            } else if (what.equals("nekk")) {
                String pic = params.get("pic");
                return Nekk.loadPic(pic);
            } else if (what.equals("live")) {
                String type = params.get("type");
                if (type.equals("txt")) {
                    String ext = params.get("ext");
                    ext = new String(Base64.decode(ext, Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP), "UTF-8");
                    return TxtSubscribe.load(ext);
                }
            } else if (what.equals("ck")) {
                return new Object[]{Integer.valueOf(200), "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
            } else if (what.equals("kmys")) {
                return Kmys.vod(params);
            } else if(what.equals("hdmoli_m3u8temp")) {
                return XPathHdmoli.GetTempM3U8();
            } else if(what.equals("gaze"))
                return XPathGaze.vod(params);
        } catch (Throwable th) {

        }
        return null;
    }

    static void X() {
        if (foundPort <= 0) {
            for (int i = 9978; i < 10000; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("http://127.0.0.1:");
                stringBuilder.append(i);
                stringBuilder.append("/proxy?do=ck");
                if (OkHttpUtil.string(stringBuilder.toString(), null).equals("ok")) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Found local server port ");
                    stringBuilder.append(i);
                    SpiderDebug.log(stringBuilder.toString());
                    foundPort = i;
                    break;
                }
            }
        }
    }

    public static String localProxyUrl() {
        X();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://127.0.0.1:");
        stringBuilder.append(foundPort);
        stringBuilder.append("/proxy");
        return stringBuilder.toString();
    }

}
