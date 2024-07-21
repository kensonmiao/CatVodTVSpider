package com.github.catvod.spider.merge;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Base64;
import com.github.catvod.spider.Init;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class E {
    public static final byte[] a = new byte[0];
    public static final Object[] b = new Object[0];
    static final String[] c = {"base", "basefont", "bgsound", "command", "link"};
    static final String[] d = {"noframes", "style"};
    static final String[] e = {"body", "br", "html"};
    static final String[] f = {"body", "html"};
    static final String[] g = {"body", "br", "head", "html"};
    static final String[] h = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
    static final String[] i = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
    static final String[] j = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
    static final String[] k = {"h1", "h2", "h3", "h4", "h5", "h6"};
    static final String[] l = {"address", "div", "p"};
    static final String[] m = {"dd", "dt"};
    static final String[] n = {"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
    static final String[] o = {"applet", "marquee", "object"};
    static final String[] p = {"area", "br", "embed", "img", "keygen", "wbr"};
    static final String[] q = {"param", "source", "track"};
    static final String[] r = {"action", "name", "prompt"};
    static final String[] s = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] t = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
    static final String[] u = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
    static final String[] v = {"table", "tbody", "tfoot", "thead", "tr"};
    static final String[] w = {"tbody", "tfoot", "thead"};
    static final String[] x = {"td", "th", "tr"};
    static final String[] y = {"script", "style"};
    static final String[] z = {"td", "th"};
    static final String[] A = {"body", "caption", "col", "colgroup", "html"};
    static final String[] B = {"table", "tbody", "tfoot", "thead", "tr"};
    static final String[] C = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] D = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] E = {"table", "tbody", "tfoot", "thead", "tr"};
    static final String[] F = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
    static final String[] G = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
    static final String[] H = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
    static final String[] I = {"body", "caption", "col", "colgroup", "html", "td", "th"};
    static final String[] J = {"input", "keygen", "textarea"};
    static final String[] K = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] L = {"tbody", "tfoot", "thead"};
    static final String[] M = {"head", "noscript"};
    static final String[] N = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

    public static F1 a(E1 e1) {
        F1 f1 = new F1();
        while (true) {
            e1 = e1.c0();
            if (e1 == null) {
                break;
            }
            f1.add(e1);
        }
        if (f1.size() > 0) {
            return f1;
        }
        return null;
    }

    public static final int b() {
        return C0010a8.a();
    }

    public static final String c(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static int d(E1 e1, C0009a7 c0009a7) {
        Iterator<E1> it = e1.g0().R().iterator();
        int i2 = 1;
        while (it.hasNext()) {
            E1 next = it.next();
            if (e1.n0().equals(next.n0()) && c0009a7.a().contains(next)) {
                if (e1 == next) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    public static final String e(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    private static SharedPreferences f() {
        Application context = Init.context();
        return context.getSharedPreferences(Init.context().getPackageName() + "_preferences", 0);
    }

    public static String g() {
        return f().getString("BiliCookie", "");
    }

    public static Object[] h(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean contains = str.contains(".bmp");
            String m2 = T5.m(str, null);
            if (contains) {
                i(linkedHashMap, new String(Base64.decode(m2.split("\\*\\*")[1], 0)));
            } else {
                i(linkedHashMap, m2);
            }
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(C0001a.e(linkedHashMap).getBytes())};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void i(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            String readLine = bufferedReader.readLine();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            String str2 = "";
            while (readLine != null) {
                if (!readLine.trim().isEmpty()) {
                    if (readLine.trim().startsWith("#EXTINF")) {
                        String[] split = readLine.split(",");
                        if (split.length >= 2 && readLine.contains("group-title")) {
                            Matcher matcher = Pattern.compile("group-title\\s*=\\s*['\"](.*?)['\"]").matcher(readLine);
                            String group = matcher.find() ? matcher.group(1) : "";
                            if (linkedHashMap.containsKey(group)) {
                                linkedHashMap3 = (LinkedHashMap) linkedHashMap.get(group);
                            } else {
                                linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap.put(group, linkedHashMap3);
                            }
                            str2 = split[1].trim();
                        }
                    } else {
                        String trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (trim.startsWith("http") || trim.startsWith("rtsp") || trim.startsWith("rtmp")) {
                                if (linkedHashMap3.containsKey(str2)) {
                                    arrayList = (ArrayList) linkedHashMap3.get(str2);
                                } else {
                                    arrayList = new ArrayList();
                                    linkedHashMap3.put(str2, arrayList);
                                }
                                if (!arrayList.contains(trim)) {
                                    System.out.println(trim);
                                }
                                arrayList.add(trim);
                            }
                        }
                    }
                }
                readLine = bufferedReader.readLine();
            }
            bufferedReader.close();
            if (linkedHashMap2.isEmpty()) {
                return;
            }
            linkedHashMap.put("未分组", linkedHashMap2);
        } catch (Throwable unused) {
        }
    }

    public static F1 j(E1 e1) {
        F1 f1 = new F1();
        while (true) {
            e1 = e1.j0();
            if (e1 == null) {
                break;
            }
            f1.add(e1);
        }
        if (f1.size() > 0) {
            return f1;
        }
        return null;
    }

    public static void k(Object obj) {
        SharedPreferences.Editor putLong;
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            putLong = f().edit().putString("BiliCookie", (String) obj);
        } else if (obj instanceof Boolean) {
            putLong = f().edit().putBoolean("BiliCookie", ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            putLong = f().edit().putFloat("BiliCookie", ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            putLong = f().edit().putInt("BiliCookie", ((Integer) obj).intValue());
        } else if (!(obj instanceof Long)) {
            return;
        } else {
            putLong = f().edit().putLong("BiliCookie", ((Long) obj).longValue());
        }
        putLong.apply();
    }

    public static void l(E1 e1, int i2) {
        e1.b("EL_SAME_TAG_INDEX_KEY", String.valueOf(i2));
    }

    public static final long m(String str, long j2, long j3, long j4) {
        String n2 = n(str);
        if (n2 != null) {
            Long t2 = B7.t(n2);
            if (t2 == null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + n2 + '\'').toString());
            }
            long longValue = t2.longValue();
            if (j3 > longValue || j4 < longValue) {
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
            }
            return longValue;
        }
        return j2;
    }

    public static final String n(String str) {
        int i2 = C0010a8.b;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static int o(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) m(str, i2, i3, i4);
    }
}
