package com.github.catvod.spider.merge;

import java.util.regex.Pattern;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class A7 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return C0086h0.b(charSequence, false, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
        }
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean d(CharSequence charSequence) {
        return !b(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0041 -> B:19:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.lang.Iterable<?> r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r3 = r3.iterator()
            if (r3 != 0) goto Lb
            goto L49
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L12
            goto L1e
        L12:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L26
            if (r0 != 0) goto L21
        L1e:
            java.lang.String r0 = ""
            goto L49
        L21:
            java.lang.String r0 = r0.toString()
            goto L49
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L30
            goto L41
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            if (r4 == 0) goto L3b
            r1.append(r4)
        L3b:
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L30
        L41:
            r1.append(r0)
            goto L30
        L45:
            java.lang.String r0 = r1.toString()
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A7.e(java.lang.Iterable, java.lang.String):java.lang.String");
    }

    public static String f(String str, String str2) {
        return (c(str) || c(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String g(String str, String str2) {
        return (c(str) || c(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String h(String str, String str2, String str3) {
        if (c(str) || c(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int a2 = (str == null || str2 == null) ? -1 : C0086h0.a(str, str2, 0);
        if (a2 == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (a2 != -1) {
            sb.append((CharSequence) str, i, a2);
            sb.append(str3);
            i = a2 + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            a2 = C0086h0.a(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String i(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        return i > str.length() ? "" : str.substring(i);
    }

    public static String j(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }
}
