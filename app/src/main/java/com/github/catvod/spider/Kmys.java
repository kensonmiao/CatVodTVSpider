//
// Decompiled by Jadx (from NP Manager)
//
package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.crypto.Cipher;

public class Kmys extends Spider {
    private static final Pattern G = Pattern.compile("(\\S+.ts)|(#EXT-X-KEY:\\S+\")(\\S+)(\")");
    private static String K = "TBW1zF4p1j";
    private static HashMap<String, String> X;
    private String D = null;
    private String SI;
    private String YQ;
    private String Z = "1";

    public String homeContent(boolean z) {
        String str = "year";
        Object obj = "-1";
        String str2 = "全部";
        String str3 = "typeName";
        String str4 = "typeId";
        String str5 = "value";
        String str6 = "name";
        String str7 = "key";
        String str8 = "v";
        String str9 = "n";
        try {
            JSONObject jSONObject;
            JSONArray jSONArray;
            JSONObject jSONObject2;
            X();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.SI);
            stringBuilder.append("/static/");
            stringBuilder.append(this.Z);
            stringBuilder.append("/config/lib-new.json");
            String stringBuilder2 = stringBuilder.toString();
            JSONObject jSONObject3 = new JSONObject(OkHttpUtil.string(stringBuilder2, G(stringBuilder2))).getJSONObject("data");
            JSONArray jSONArray2 = jSONObject3.getJSONArray(str);
            JSONArray jSONArray3 = jSONObject3.getJSONArray("types");
            JSONArray jSONArray4 = new JSONArray();
            JSONObject jSONObject4 = new JSONObject();
            int i = 0;
            while (i < jSONArray3.length()) {
                String str10;
                int i2;
                Object obj2;
                jSONObject = jSONArray3.getJSONObject(i);
                JSONArray jSONArray5 = jSONArray3;
                stringBuilder2 = jSONObject.getString(str4).trim();
                if (stringBuilder2.isEmpty()) {
                    str10 = str;
                    jSONArray = jSONArray4;
                    jSONObject = jSONObject4;
                    i2 = i;
                    jSONArray4 = jSONArray2;
                    obj2 = obj;
                } else {
                    JSONArray jSONArray6;
                    Object obj3;
                    i2 = i;
                    String string = jSONObject.getString(str3);
                    JSONObject jSONObject5 = jSONObject4;
                    jSONObject4 = new JSONObject();
                    JSONArray jSONArray7 = jSONArray2;
                    jSONObject4.put("type_id", stringBuilder2);
                    jSONObject4.put("type_name", string);
                    jSONArray4.put(jSONObject4);
                    jSONArray2 = jSONObject.getJSONArray("tags");
                    JSONArray jSONArray8 = new JSONArray();
                    JSONObject jSONObject6 = new JSONObject();
                    jSONArray = jSONArray4;
                    jSONObject6.put(str7, "type");
                    jSONObject6.put(str6, "类型");
                    jSONArray4 = new JSONArray();
                    String str11 = stringBuilder2;
                    jSONObject3 = new JSONObject();
                    jSONObject3.put(str9, str2);
                    jSONObject3.put(str8, obj);
                    jSONArray4.put(jSONObject3);
                    str10 = str;
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        jSONObject2 = jSONArray2.getJSONObject(i3);
                        jSONArray6 = jSONArray2;
                        JSONObject jSONObject7 = new JSONObject();
                        obj3 = obj;
                        jSONObject7.put(str9, jSONObject2.getString(str3));
                        jSONObject7.put(str8, jSONObject2.getString(str4));
                        jSONArray4.put(jSONObject7);
                        i3++;
                        jSONArray2 = jSONArray6;
                        obj = obj3;
                    }
                    obj3 = obj;
                    jSONObject6.put(str5, jSONArray4);
                    jSONArray8.put(jSONObject6);
                    jSONObject2 = new JSONObject();
                    jSONObject2.put(str7, "sort");
                    jSONObject2.put(str6, "排序");
                    JSONArray jSONArray9 = new JSONArray();
                    jSONObject3 = new JSONObject();
                    jSONObject3.put(str9, "最热");
                    jSONObject3.put(str8, "2");
                    jSONArray9.put(jSONObject3);
                    jSONObject3 = new JSONObject();
                    jSONObject3.put(str9, "最新");
                    jSONObject3.put(str8, "1");
                    jSONArray9.put(jSONObject3);
                    jSONObject3 = new JSONObject();
                    jSONObject3.put(str9, "好评");
                    jSONObject3.put(str8, "3");
                    jSONArray9.put(jSONObject3);
                    jSONObject2.put(str5, jSONArray9);
                    jSONArray8.put(jSONObject2);
                    JSONArray jSONArray10 = jSONObject.getJSONArray("children");
                    jSONObject2 = new JSONObject();
                    jSONObject2.put(str7, "area");
                    jSONObject2.put(str6, "地区");
                    jSONArray9 = new JSONArray();
                    jSONObject3 = new JSONObject();
                    jSONObject3.put(str9, str2);
                    obj2 = obj3;
                    jSONObject3.put(str8, obj2);
                    jSONArray9.put(jSONObject3);
                    i3 = 0;
                    while (i3 < jSONArray10.length()) {
                        JSONObject jSONObject8 = jSONArray10.getJSONObject(i3);
                        jSONObject6 = new JSONObject();
                        jSONArray6 = jSONArray10;
                        jSONObject6.put(str9, jSONObject8.getString(str3));
                        jSONObject6.put(str8, jSONObject8.getString(str4));
                        jSONArray9.put(jSONObject6);
                        i3++;
                        jSONArray10 = jSONArray6;
                    }
                    jSONObject2.put(str5, jSONArray9);
                    jSONArray8.put(jSONObject2);
                    jSONObject = new JSONObject();
                    str = str10;
                    jSONObject.put(str7, str);
                    jSONObject.put(str6, "年份");
                    jSONArray9 = new JSONArray();
                    jSONObject3 = new JSONObject();
                    jSONObject3.put(str9, str2);
                    jSONObject3.put(str8, obj2);
                    jSONArray9.put(jSONObject3);
                    i3 = 0;
                    while (i3 < jSONArray7.length()) {
                        jSONArray4 = jSONArray7;
                        string = jSONArray4.getString(i3).trim();
                        if (string.isEmpty()) {
                            str10 = str;
                        } else {
                            str10 = str;
                            jSONObject2 = new JSONObject();
                            jSONObject2.put(str9, string);
                            jSONObject2.put(str8, string);
                            jSONArray9.put(jSONObject2);
                        }
                        i3++;
                        jSONArray7 = jSONArray4;
                        str = str10;
                    }
                    str10 = str;
                    jSONArray4 = jSONArray7;
                    jSONObject.put(str5, jSONArray9);
                    jSONArray8.put(jSONObject);
                    jSONObject = jSONObject5;
                    jSONObject.put(str11, jSONArray8);
                }
                i = i2 + 1;
                jSONObject4 = jSONObject;
                obj = obj2;
                jSONArray2 = jSONArray4;
                jSONArray3 = jSONArray5;
                jSONArray4 = jSONArray;
                str = str10;
            }
            jSONArray = jSONArray4;
            jSONObject = jSONObject4;
            jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", jSONObject);
            }
            return jSONObject2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String str;
        String str2 = "$$$";
        String str3 = "name";
        String str4 = "";
        try {
            X();
            JSONObject jSONObject = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.SI);
            stringBuilder.append("/static/video/detail/");
            stringBuilder.append((String) list.get(0));
            stringBuilder.append(".json");
            String stringBuilder2 = stringBuilder.toString();
            JSONObject jSONObject2 = new JSONObject(OkHttpUtil.string(stringBuilder2, G(stringBuilder2))).getJSONObject("data");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_id", jSONObject2.getString("id"));
            jSONObject3.put("vod_name", jSONObject2.getString("vodName"));
            jSONObject3.put("vod_pic", K(jSONObject2.getString("vodPic")));
            jSONObject3.put("type_name", jSONObject2.getString("typeName"));
            jSONObject3.put("vod_year", jSONObject2.getString("vodYear"));
            jSONObject3.put("vod_area", jSONObject2.getString("vodArea"));
            jSONObject3.put("vod_remarks", str4);
            jSONObject3.put("vod_actor", jSONObject2.getString("vodActor"));
            jSONObject3.put("vod_director", str4);
            jSONObject3.put("vod_content", jSONObject2.getString("vodBlurb"));
            stringBuilder2 = jSONObject2.getString("vodPlayUrl");
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2.substring(0, 10));
            stringBuilder3.append(stringBuilder2.substring(16));
            stringBuilder2 = D(stringBuilder3.toString());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONObject4 = new JSONArray(stringBuilder2);
            int i = 0;
            while (true) {
                String str5 = "list";
                String str6;
                JSONObject jSONObject5;
                if (i < jSONObject4.length()) {
                    JSONArray jSONArray;
                    JSONObject jSONObject6 = jSONObject4.getJSONObject(i);
                    String string = jSONObject6.getString(str3);
                    String comparedStr = "高速线路";
                    boolean equals = string.equals(comparedStr);
                    ArrayList arrayList3 = new ArrayList();
                    JSONArray jSONArray2 = jSONObject6.getJSONArray(str5);
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        boolean z;
                        JSONObject jSONObject7 = jSONArray2.getJSONObject(i2);
                        str6 = "isParse";
                        jSONArray = jSONObject4;
                        String str7 = "..";
                        JSONArray jSONArray3 = jSONArray2;
                        String str8 = "url";
                        str = str4;
                        str4 = "$";
                        StringBuilder stringBuilder4;
                        if (equals) {
                            z = equals;
                            try {
                                stringBuilder4 = new StringBuilder();
                                jSONObject5 = jSONObject;
                                stringBuilder4.append(jSONObject7.getString(str3));
                                stringBuilder4.append(str4);
                                stringBuilder4.append(Proxy.localProxyUrl());
                                stringBuilder4.append("?do=kmys&type=m3u8&url=");
                                stringBuilder4.append(Base64.encodeToString(jSONObject7.getString(str8).getBytes(Misc.Utf8), 10));
                                stringBuilder4.append(str7);
                                stringBuilder4.append(jSONObject7.getInt(str6));
                                arrayList3.add(stringBuilder4.toString());
                            } catch (Throwable unused) {
                                return str;
                            }
                        }
                        jSONObject5 = jSONObject;
                        z = equals;
                        stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(jSONObject7.getString(str3));
                        stringBuilder4.append(str4);
                        stringBuilder4.append(jSONObject7.getString(str8));
                        stringBuilder4.append(str7);
                        stringBuilder4.append(jSONObject7.getInt(str6));
                        arrayList3.add(stringBuilder4.toString());
                        i2++;
                        jSONObject4 = jSONArray;
                        jSONArray2 = jSONArray3;
                        str4 = str;
                        equals = z;
                        jSONObject = jSONObject5;
                    }
                    str = str4;
                    jSONObject5 = jSONObject;
                    jSONArray = jSONObject4;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(string);
                        arrayList2.add(TextUtils.join("#", arrayList3));
                    }
                    i++;
                    jSONObject4 = jSONArray;
                    str4 = str;
                    jSONObject = jSONObject5;
                } else {
                    str = str4;
                    jSONObject5 = jSONObject;
                    str6 = TextUtils.join(str2, arrayList);
                    str2 = TextUtils.join(str2, arrayList2);
                    jSONObject3.put("vod_play_from", str6);
                    jSONObject3.put("vod_play_url", str2);
                    JSONArray jSONArray4 = new JSONArray();
                    jSONArray4.put(jSONObject3);
                    JSONObject jSONObject8 = jSONObject5;
                    jSONObject8.put(str5, jSONArray4);
                    return jSONObject8.toString();
                }
            }
        } catch (Throwable unused2) {
            str = str4;
            return str;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3 = "list";
        String str4 = "year";
        String str5 = "sort";
        String str6 = "type";
        String str7 = "area";
        String str8 = "/";
        try {
            HashMap hashMap2 = null;
            int i;
            X();
            JSONObject jSONObject = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.YQ);
            stringBuilder.append("/videolibrary/v2/");
            stringBuilder.append(this.Z);
            stringBuilder.append(str8);
            stringBuilder.append(str);
            str = stringBuilder.toString();
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            String str9 = "-1";
            if (!hashMap2.containsKey(str7)) {
                hashMap2.put(str7, str9);
            }
            if (!hashMap2.containsKey(str6)) {
                hashMap2.put(str6, str9);
            }
            if (!hashMap2.containsKey(str5)) {
                hashMap2.put(str5, "2");
            }
            if (!hashMap2.containsKey(str4)) {
                hashMap2.put(str4, str9);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str8);
            stringBuilder.append((String) hashMap2.get(str7));
            str = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str8);
            stringBuilder2.append((String) hashMap2.get(str6));
            str = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(str8);
            stringBuilder3.append((String) hashMap2.get(str5));
            str = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append("/-1");
            str = stringBuilder4.toString();
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append(str8);
            stringBuilder4.append((String) hashMap2.get(str4));
            str = stringBuilder4.toString();
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str);
            stringBuilder5.append("/-1/");
            stringBuilder5.append(str2);
            stringBuilder5.append(".json");
            str = stringBuilder5.toString();
            JSONObject jSONObject2 = new JSONObject(OkHttpUtil.string(str, G(str))).getJSONObject("data");
            JSONArray jSONArray = jSONObject2.getJSONArray(str3);
            JSONArray jSONArray2 = new JSONArray();
            for (i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("vod_id", jSONObject3.getString("id"));
                jSONObject4.put("vod_name", jSONObject3.getString("vodName"));
                jSONObject4.put("vod_pic", K(jSONObject3.getString("vodPicThumb")));
                jSONObject4.put("vod_remarks", jSONObject3.getString("lastName"));
                jSONArray2.put(jSONObject4);
            }
            int i2 = jSONObject2.getInt("count");
            i = jSONObject2.getInt("pageSize");
            int i3 = i2 % i == 0 ? i2 / i : (i2 / i) + 1;
            jSONObject.put("page", jSONObject2.getInt("pageIndex"));
            jSONObject.put("pagecount", i3);
            jSONObject.put("limit", i);
            jSONObject.put("total", i2);
            jSONObject.put(str3, jSONArray2);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    static Object[] Z(String str) {
        Uri parse = Uri.parse(str);
        String valueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CY(str));
        stringBuilder.append(K);
        stringBuilder.append(valueOf);
        String toLowerCase = Misc.DecodeString(stringBuilder.toString(), Misc.Iso8859_1).toLowerCase();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("?key=");
        stringBuilder2.append(toLowerCase);
        stringBuilder2.append("&time=");
        stringBuilder2.append(valueOf);
        valueOf = OkHttpUtil.string(stringBuilder2.toString(), X);
        str = str.substring(0, str.indexOf(parse.getLastPathSegment()));
        StringBuilder stringBuilder3 = new StringBuilder();
        Matcher matcher = G.matcher(valueOf);
        int i = 0;
        while (matcher.find()) {
            stringBuilder3.append(valueOf, i, matcher.start());
            StringBuilder stringBuilder4;
            if (matcher.group().contains("EXT-X-KEY")) {
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(Proxy.localProxyUrl());
                stringBuilder4.append("?do=kmys&type=key&url=");
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(str);
                stringBuilder5.append(matcher.group(3));
                stringBuilder4.append(Base64.encodeToString(stringBuilder5.toString().getBytes(Misc.Iso8859_1), 10));
                String stringBuilder6 = stringBuilder4.toString();
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append(matcher.group(2));
                stringBuilder7.append(stringBuilder6);
                stringBuilder7.append(matcher.group(4));
                stringBuilder3.append(stringBuilder7.toString());
            } else {
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(Proxy.localProxyUrl());
                stringBuilder4.append("?do=kmys&type=ts&url=");
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append(str);
                stringBuilder8.append(matcher.group(1));
                stringBuilder4.append(Base64.encodeToString(stringBuilder8.toString().getBytes(Misc.Iso8859_1), 10));
                stringBuilder3.append(stringBuilder4.toString());
            }
            i = matcher.end();
        }
        stringBuilder3.append(valueOf, i, valueOf.length());
        return new Object[]{Integer.valueOf(200), "application/octet-stream", new ByteArrayInputStream(stringBuilder3.toString().getBytes(Misc.Iso8859_1))};
    }

    public String homeVideoContent() {
        String str = "list";
        try {
            X();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.SI);
            stringBuilder.append("/static/");
            stringBuilder.append(this.Z);
            stringBuilder.append("/index/cloumn/1.json");
            String stringBuilder2 = stringBuilder.toString();
            JSONArray jSONArray = new JSONObject(OkHttpUtil.string(stringBuilder2, G(stringBuilder2))).getJSONObject("data").getJSONArray(str);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray3 = jSONArray.getJSONObject(i).getJSONArray("videoList");
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    JSONObject jSONObject = jSONArray3.getJSONObject(i2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", jSONObject.getString("id"));
                    jSONObject2.put("vod_name", jSONObject.getString("vodName"));
                    jSONObject2.put("vod_pic", K(jSONObject.getString("vodPicThumb")));
                    jSONObject2.put("vod_remarks", jSONObject.getString("lastName"));
                    jSONArray2.put(jSONObject2);
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str, jSONArray2);
            return jSONObject3.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = "list";
        String str3 = "";
        if (z) {
            return str3;
        }
        try {
            X();
            JSONObject jSONObject = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.YQ);
            stringBuilder.append("/api/v2/index/search?pageIndex=1&wd=");
            stringBuilder.append(URLEncoder.encode(str));
            stringBuilder.append("&limit=10&type=1");
            String stringBuilder2 = stringBuilder.toString();
            stringBuilder2 = OkHttpUtil.string(stringBuilder2, G(stringBuilder2));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(stringBuilder2).getJSONObject("data").getJSONArray(str2);
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                String string = jSONObject2.getString("vodName");
                if (string.contains(str)) {
                    jSONObject3.put("vod_id", jSONObject2.getString("id"));
                    jSONObject3.put("vod_name", string);
                    jSONObject3.put("vod_pic", K(jSONObject2.getString("vodPicThumb")));
                    jSONObject3.put("vod_remarks", jSONObject2.getString("lastName"));
                    jSONArray.put(jSONObject3);
                }
            }
            jSONObject.put(str2, jSONArray);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return str3;
        }
    }

    public static Object[] vod(Map<String, String> map) {
        String str = (String) map.get("type");
        String str2 = new String(Base64.decode((String) map.get("url"), 10), Misc.Iso8859_1);
        if (X == null) {
            HashMap hashMap = new HashMap();
            X = hashMap;
            hashMap.put("User-Agent", "okhttp/3.14.7");
            X.put("Connection", "close");
        }
        if (str.equals("m3u8")) {
            return Z(str2);
        }
        if (str.equals("key")) {
            return YQ(str2);
        }
        return str.equals("ts") ? SI(str2) : null;
    }

    String D(String str) {
        try {
            int i = 0;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3VLHgbkFN0ebMaR4e0D\nz6Z2mFexPBFKGqK0tuRhzu7XOrG92nKWfnublf2p1i22UN81whBLINjMttOuqW6\nfM9DCnAPTelud1zCXWYWIsv5Z19inJSG8vytJ7xg1dnfuRSRUkx11IE7bm0T/sM\n0sI4GgcktQJNSizyirHtuJjUUxxQabEhFkFeqQ5r+A69KjB5QkotCc4pG5lENyT\nARHGSsfaiJthaiH0yJ/8tUlyMgJ9H6/jbQg0wlLcEUzdfe2KuCPrTRzIzx4Cjm1\nJogT6JV2byvXpzAMC3O48LDiekJdVztg2Cj7E0cGrOsGs+IK6F7TWsKD/cIELTF\nhLz6dExQIDAQAB", 0)));
            Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
            instance.init(Cipher.DECRYPT_MODE, rSAPublicKey);
            byte[] decode = Base64.decode(str, 0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (decode.length <= 256) {
                byteArrayOutputStream.write(instance.doFinal(decode));
            } else {
                while (i < decode.length) {
                    byteArrayOutputStream.write(instance.doFinal(decode, i, 256));
                    i += 256;
                }
            }
            byteArrayOutputStream.flush();
            str = new String(byteArrayOutputStream.toByteArray(), Misc.Utf8);
            byteArrayOutputStream.close();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        str = "";
        try {
            JSONObject jSONObject = new JSONObject();
            String[] split = str2.split("\\.\\.");
            Object obj = split[0];
            String str3 = "url";
            String str4 = "playUrl";
            String str5 = "parse";
            if (Integer.parseInt(split[1]) == 2) {
                jSONObject.put(str5, 0);
                jSONObject.put(str4, str);
                jSONObject.put(str3, obj);
            } else {
                jSONObject.put(str5, 0);
                jSONObject.put(str4, str);
                jSONObject.put(str3, obj);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    static Object[] SI(String str) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CY(str));
        stringBuilder.append(K);
        stringBuilder.append(valueOf);
        String toLowerCase = Misc.DecodeString(stringBuilder.toString(), Misc.Iso8859_1).toLowerCase();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("?key=");
        stringBuilder2.append(toLowerCase);
        stringBuilder2.append("&time=");
        stringBuilder2.append(valueOf);
        str = stringBuilder2.toString();
        OKCallBack<Response> anonymousClass1 = new OKCallBack.OKCallBackDefault() {
            public void onFailure(Call call, Exception exception) {
            }

            public void onResponse(Response response) {
            }
        };
        OkHttpUtil.get(OkHttpUtil.defaultClient(), str, null, X, anonymousClass1);
        if (((Response) anonymousClass1.getResult()).code() != 200) {
            return null;
        }
        str = ((Response) anonymousClass1.getResult()).headers().get("Content-Type");
        if (str == null) {
            str = "application/octet-stream";
        }
        return new Object[]{Integer.valueOf(200), str, (anonymousClass1.getResult()).body().byteStream()};
    }

    private void X() {
        if (this.SI.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("http://feigua2021.oss-cn-beijing.aliyuncs.com/static/config/video/");
            stringBuilder.append(this.Z);
            stringBuilder.append(".json");
            String stringBuilder2 = stringBuilder.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", "okhttp/3.14.7");
            try {
                JSONObject jSONObject = new JSONObject(OkHttpUtil.string(stringBuilder2, hashMap));
                this.YQ = jSONObject.getString("apiDomain");
                this.SI = jSONObject.getString("staticDomain");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    protected String K(String str) {
        String str2 = "/";
        String str3 = "://";
        try {
            if (str.startsWith("//")) {
                Uri parse = Uri.parse(this.SI);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(parse.getScheme());
                stringBuilder.append(":");
                stringBuilder.append(str);
                return stringBuilder.toString();
            } else if (str.contains(str3)) {
                return str;
            } else {
                Uri parse2 = Uri.parse(this.SI);
                if (!str.startsWith(str2)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    stringBuilder2.append(str);
                    str = stringBuilder2.toString();
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(parse2.getScheme());
                stringBuilder3.append(str3);
                stringBuilder3.append(parse2.getHost());
                stringBuilder3.append(str);
                return stringBuilder3.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    private HashMap<String, String> G(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionNumber", "330");
        hashMap.put("versionName", "3.3.0");
        hashMap.put("device", this.D);
        hashMap.put("appId", this.Z);
        hashMap.put("platformId", "7");
        hashMap.put("User-Agent", "okhttp/3.14.7");
        return hashMap;
    }

    static Object[] YQ(String str) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CY(str));
        stringBuilder.append(K);
        stringBuilder.append(valueOf);
        String toLowerCase = Misc.DecodeString(stringBuilder.toString(), Misc.Iso8859_1).toLowerCase();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("?key=");
        stringBuilder2.append(toLowerCase);
        stringBuilder2.append("&time=");
        stringBuilder2.append(valueOf);
        str = OkHttpUtil.string(stringBuilder2.toString(), X);
        return new Object[]{Integer.valueOf(200), "application/octet-stream", new ByteArrayInputStream(str.getBytes(Misc.Iso8859_1))};
    }

    public void init(Context context) {
        String str = "device";
        super.init(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp_Kmys", 0);
        try {
            String string = sharedPreferences.getString(str, null);
            this.D = string;
            if (string == null) {
                this.D = Misc.DecodeString(UUID.randomUUID().toString(), Misc.Iso8859_1).toLowerCase();
                sharedPreferences.edit().putString(str, this.D).commit();
            }
        } catch (Throwable unused) {
            if (this.D != null) {
            }
        }
    }

    public Kmys() {
        String str = "";
        this.YQ = str;
        this.SI = str;
    }

    static String CY(String str) {
        if (str.startsWith("http://")) {
            return str.substring(0, str.substring(7).indexOf(47) + 7);
        }
        return str.substring((str.startsWith("https://") ? str.substring(0, str.substring(8).indexOf(47) + 8) : "").length());
    }
}