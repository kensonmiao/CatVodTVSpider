package com.github.catvod.spider.merge;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.r5 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0210r5 {
    private static final Pattern a = Pattern.compile("http((?!http).){26,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg)\\?.*|http((?!http).){26,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");
    public static Charset b;
    public static Charset c;
    public static Charset d;

    static {
        new ArrayList();
        b = Charset.forName("UTF-8");
        c = Charset.forName("ISO-8859-1");
        d = Charset.forName("US-ASCII");
    }

    public static String a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return matcher.find() ? matcher.group(0) : "";
    }

    public static HashMap<String, String> b(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    public static String c(String str) {
        return d(str, b);
    }

    public static String d(String str, Charset charset) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(charset));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String e(String str, String str2, Map<String, String> map) {
        C0199q5 c0199q5 = new C0199q5();
        T5.l(T5.b(), str, str2, map, c0199q5);
        return c0199q5.getResult();
    }

    public static String f(Long l, String str) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format((Date) new Timestamp(l.longValue()));
    }

    public static String g(String str, HashMap<String, String> hashMap) {
        String group;
        String str2;
        String m = T5.m(str, hashMap);
        if (m.contains(".m3u8")) {
            String[] split = m.split("\\n| #");
            String host = Uri.parse(str).getHost();
            Uri parse = Uri.parse(str);
            String str3 = parse.getScheme() + "://" + host;
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str2 = null;
                    break;
                }
                str2 = split[i];
                if (!str2.contains(".m3u8")) {
                    i++;
                } else if (str2.trim().startsWith("/")) {
                    str2 = C0288y.a(str3, str2);
                }
            }
            m = T5.m(str2, hashMap);
        }
        String[] split2 = m.split("\\n| #");
        Pattern compile = Pattern.compile("EXTINF:(.*?),");
        double d2 = 0.0d;
        for (String str4 : split2) {
            if (str4.contains("EXTINF:")) {
                Matcher matcher = compile.matcher(str4);
                if (matcher.find() && (group = matcher.group(1)) != null) {
                    d2 += Double.parseDouble(group);
                }
                if (d2 / 60.0d > 6.0d) {
                    return str;
                }
            }
        }
        return null;
    }

    public static String h(String str, String str2) {
        String str3;
        try {
            if (str2.startsWith("//")) {
                Uri parse = Uri.parse(str);
                str3 = parse.getScheme() + ":" + str2;
            } else if (str2.contains("://")) {
                return str2;
            } else {
                Uri parse2 = Uri.parse(str);
                str3 = parse2.getScheme() + "://" + parse2.getHost() + str2;
            }
            return str3;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    public static boolean i(String str) {
        if (a.matcher(str).find()) {
            return (str.contains("cdn-tos") && str.contains(".js")) ? false : true;
        }
        return false;
    }

    public static boolean j(String str) {
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com"};
            for (int i = 0; i < 11; i++) {
                if (host.contains(strArr[i]) && (!"iqiyi.com".equals(strArr[i]) || str.contains("iqiyi.com/a_") || str.contains("iqiyi.com/w_") || str.contains("iqiyi.com/v_"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0095, code lost:
        if (r0.has("Headers") != false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject k(java.lang.String r10, java.lang.String r11) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r11)
            java.lang.String r11 = "data"
            boolean r1 = r0.has(r11)
            java.lang.String r2 = "url"
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.get(r11)
            boolean r1 = r1 instanceof org.json.JSONObject
            if (r1 == 0) goto L21
            boolean r1 = r0.has(r2)
            if (r1 != 0) goto L21
            org.json.JSONObject r0 = r0.getJSONObject(r11)
        L21:
            java.lang.String r11 = r0.getString(r2)
            java.lang.String r1 = "//"
            boolean r1 = r11.startsWith(r1)
            if (r1 == 0) goto L33
            java.lang.String r1 = "https:"
            java.lang.String r11 = com.github.catvod.spider.merge.C0288y.a(r1, r11)
        L33:
            java.lang.String r1 = r11.trim()
            java.lang.String r3 = "http"
            boolean r1 = r1.startsWith(r3)
            r3 = 0
            if (r1 != 0) goto L41
            return r3
        L41:
            boolean r1 = r11.equals(r10)
            if (r1 == 0) goto L54
            boolean r1 = j(r11)
            if (r1 != 0) goto L53
            boolean r1 = i(r11)
            if (r1 != 0) goto L54
        L53:
            return r3
        L54:
            java.lang.String r1 = "973973.xyz"
            boolean r1 = r11.contains(r1)
            if (r1 != 0) goto L67
            java.lang.String r1 = ".fit:"
            boolean r1 = r11.contains(r1)
            if (r1 == 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            if (r1 == 0) goto L6b
            return r3
        L6b:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "header"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L7d
            org.json.JSONObject r1 = r0.optJSONObject(r3)
            goto L9b
        L7d:
            java.lang.String r4 = "Header"
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L86
            goto L97
        L86:
            java.lang.String r4 = "headers"
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L8f
            goto L97
        L8f:
            java.lang.String r4 = "Headers"
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L9b
        L97:
            org.json.JSONObject r1 = r0.optJSONObject(r4)
        L9b:
            java.lang.String r4 = "user-agent"
            boolean r5 = r0.has(r4)
            java.lang.String r6 = "User-Agent"
            java.lang.String r7 = ""
            if (r5 == 0) goto Lac
            java.lang.String r4 = r0.optString(r4, r7)
            goto Lb8
        Lac:
            boolean r4 = r0.has(r6)
            if (r4 == 0) goto Lb7
            java.lang.String r4 = r0.optString(r6, r7)
            goto Lb8
        Lb7:
            r4 = r7
        Lb8:
            java.lang.String r5 = r4.trim()
            int r5 = r5.length()
            java.lang.String r8 = " "
            if (r5 <= 0) goto Ld6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.put(r6, r4)
        Ld6:
            java.lang.String r4 = "referer"
            boolean r5 = r0.has(r4)
            java.lang.String r9 = "Referer"
            if (r5 == 0) goto Le5
            java.lang.String r7 = r0.optString(r4, r7)
            goto Lef
        Le5:
            boolean r4 = r0.has(r9)
            if (r4 == 0) goto Lef
            java.lang.String r7 = r0.optString(r9, r7)
        Lef:
            java.lang.String r0 = r7.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L10b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1.put(r9, r0)
        L10b:
            if (r1 != 0) goto L112
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L112:
            java.lang.String r0 = "www.mgtv.com"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L11b
            goto L123
        L11b:
            java.lang.String r0 = "titan.mgtv"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L129
        L123:
            r1.put(r9, r8)
            java.lang.String r10 = " Mozilla/5.0"
            goto L138
        L129:
            java.lang.String r0 = "bilibili"
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L13b
            java.lang.String r10 = " https://www.bilibili.com/"
            r1.put(r9, r10)
            java.lang.String r10 = " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36"
        L138:
            r1.put(r6, r10)
        L13b:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            r10.put(r3, r1)
            r10.put(r2, r11)
            java.lang.String r11 = "parse"
            java.lang.String r0 = "0"
            r10.put(r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0210r5.k(java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
