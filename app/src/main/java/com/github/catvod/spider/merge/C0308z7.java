package com.github.catvod.spider.merge;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.z7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0308z7 {
    static final String[] a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static Pattern b = Pattern.compile("^/((\\.{1,2}/)+)");
    private static final ThreadLocal<Stack<StringBuilder>> c = new C0296y7();
    public static final /* synthetic */ int d = 0;

    public static StringBuilder a() {
        Stack<StringBuilder> stack = c.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    public static boolean b(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean c(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!d(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean d(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String e(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder a2 = a();
        R0.p(a2);
        Object obj2 = obj;
        while (true) {
            a2.append(obj2);
            if (it.hasNext()) {
                Object next = it.next();
                a2.append(str);
                obj2 = next;
            } else {
                return g(a2);
            }
        }
    }

    public static String f(int i) {
        if (i >= 0) {
            String[] strArr = a;
            if (i < 21) {
                return strArr[i];
            }
            int min = Math.min(i, 30);
            char[] cArr = new char[min];
            for (int i2 = 0; i2 < min; i2++) {
                cArr[i2] = ' ';
            }
            return String.valueOf(cArr);
        }
        throw new IllegalArgumentException("width must be > 0");
    }

    public static String g(StringBuilder sb) {
        R0.p(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = c.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    public static URL h(URL url, String str) {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String replaceFirst = b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
