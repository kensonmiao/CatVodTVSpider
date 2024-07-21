package com.github.catvod.spider.merge;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class F {
    public static String a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return matcher.find() ? matcher.group(0) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(C0038d0 c0038d0) {
        return c(c0038d0, true) + c(c0038d0, false);
    }

    private static int c(C0038d0 c0038d0, boolean z) {
        int d = z ? c0038d0.d() : c0038d0.e();
        int e = z ? c0038d0.e() : c0038d0.d();
        byte[][] c = c0038d0.c();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < e; i4++) {
                byte b2 = z ? c[i2][i4] : c[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b = b2;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i = (i3 - 5) + 3 + i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(C0038d0 c0038d0) {
        byte[][] c = c0038d0.c();
        int e = c0038d0.e();
        int d = c0038d0.d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            for (int i3 = 0; i3 < e; i3++) {
                byte[] bArr = c[i2];
                int i4 = i3 + 6;
                if (i4 < e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (f(bArr, i3 - 4, i3) || f(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < d && c[i2][i3] == 1 && c[i2 + 1][i3] == 0 && c[i2 + 2][i3] == 1 && c[i2 + 3][i3] == 1 && c[i2 + 4][i3] == 1 && c[i2 + 5][i3] == 0 && c[i5][i3] == 1 && (g(c, i3, i2 - 4, i2) || g(c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    public static final Object e(Throwable th) {
        return new Q6(th);
    }

    private static boolean f(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    public static String h(String str) {
        String str2;
        String str3 = "httpurl";
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("Live");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("Category");
            int i = 0;
            while (i < optJSONArray2.length()) {
                String string = optJSONArray2.getString(i);
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                jSONObject2.put("group", string);
                int i2 = 0;
                while (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if ((optJSONObject.has("Category") ? optJSONObject.optString("Category") : optJSONObject.optString("Category-off")).contains(string)) {
                        String optString = optJSONObject.has("name") ? optJSONObject.optString("name") : optJSONObject.optString("name-off");
                        String[] split = (optJSONObject.has(str3) ? optJSONObject.optString(str3) : optJSONObject.optString("httpurl-off")).split("#");
                        JSONArray jSONArray3 = new JSONArray();
                        int length = split.length;
                        int i3 = 0;
                        while (true) {
                            str2 = str3;
                            if (i3 >= length) {
                                break;
                            }
                            jSONArray3.put(split[i3]);
                            i3++;
                            str3 = str2;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", optString);
                        jSONObject3.put("urls", jSONArray3);
                        jSONArray2.put(jSONObject3);
                    } else {
                        str2 = str3;
                    }
                    i2++;
                    str3 = str2;
                }
                String str4 = str3;
                jSONObject2.put("channels", jSONArray2);
                jSONArray.put(jSONObject2);
                i++;
                str3 = str4;
            }
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
        return jSONArray.toString();
    }

    public static Object[] i() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("account=pandora227722@gmail.com&password=qwerty1&markcode=");
            Random random = new Random();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 16; i++) {
                stringBuffer.append("1234567890abcdef".charAt(random.nextInt(16)));
            }
            sb.append(stringBuffer.toString());
            sb.append("&t=");
            sb.append(System.currentTimeMillis() / 1000);
            String sb2 = sb.toString();
            String j = D5.j(sb2);
            HashMap hashMap = new HashMap();
            hashMap.put("data", j);
            hashMap.put("sign", C0210r5.c(sb2 + "&8a499f7bd3ed7598762536a3ae96a0ed"));
            new String(D5.i(new JSONObject(T5.f("http://jins365m.webredirect.org/auth/api.php?app=10000&act=user_logon", hashMap, null)).getString("msg"), "wetEWKhXShYbp2RcDXY8kGtbhpXctQMF").getBytes(), "GBK");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", "com.jrys.app");
            hashMap2.put("QQ", "3119374819");
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(h(D5.i(T5.f("http://jins365m.webredirect.org/live/zbzh.php", hashMap2, null), "1234567890")).getBytes("UTF-8"))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String j(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String k(String str) {
        return j(str).trim();
    }

    public static Object[] l(Map map) {
        String str = (String) map.get("name");
        if (str.equals("bt5v")) {
            String str2 = (String) map.get("url");
            try {
                String m = T5.m("https://rx.bt5v.com/?url=" + str2, null);
                String b = C0001a.b(Base64.decode(a(m, "(?<=\"url\": \").*?(?=\")").getBytes(), 0), "A42EAC0C2B408472".getBytes(), a(m, "(?<=le_token = \").*?(?=\")").getBytes(), "AES/CBC/PKCS7Padding");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("User-Agent", "");
                jSONObject.put("Referer", "");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", b);
                jSONObject2.put("header", jSONObject);
                jSONObject2.put("parse", "0");
                return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(jSONObject2.toString().getBytes())};
            } catch (Exception e) {
                SpiderDebug.log(e);
                return null;
            }
        } else if (str.equals("playmv")) {
            String str3 = (String) map.get("url");
            try {
                String a = a(T5.m("https://playmv.vip/?url=" + str3, null), "(?<=\"url\":\").*?(?=\")");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("User-Agent", "");
                jSONObject3.put("Referer", "");
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", a);
                jSONObject4.put("header", jSONObject3);
                jSONObject4.put("parse", "0");
                return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(jSONObject4.toString().getBytes())};
            } catch (Exception e2) {
                SpiderDebug.log(e2);
                return null;
            }
        } else {
            return null;
        }
    }
}
