package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.ta  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0239ta implements InterfaceC0227sa {
    private static final String[] d;
    public static final C0239ta e;
    private final String[] a;
    private final String[] b;
    private final String[] c;

    static {
        String[] strArr = new String[0];
        d = strArr;
        e = new C0239ta(strArr, strArr, strArr);
    }

    public C0239ta(String[] strArr, String[] strArr2, String[] strArr3) {
        this.a = strArr;
        this.b = strArr2;
        strArr3 = strArr3 == null ? d : strArr3;
        this.c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    public final String a(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.c;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String b = b(i);
        if (b != null) {
            return b;
        }
        String c = c(i);
        return c != null ? c : Integer.toString(i);
    }

    public final String b(int i) {
        if (i >= 0) {
            String[] strArr = this.a;
            if (i < strArr.length) {
                return strArr[i];
            }
            return null;
        }
        return null;
    }

    public final String c(int i) {
        if (i >= 0) {
            String[] strArr = this.b;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }
}
