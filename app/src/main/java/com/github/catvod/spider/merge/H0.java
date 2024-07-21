package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class H0 extends E2 {
    private static final int e;
    public static final H0 f = new H0();

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer s = B7.s(str);
            if (s == null || s.intValue() < 1) {
                throw new IllegalStateException(C0288y.a("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i = s.intValue();
        } else {
            i = -1;
        }
        e = i;
    }

    private H0() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // com.github.catvod.spider.merge.Y0
    public final String toString() {
        return "CommonPool";
    }
}
