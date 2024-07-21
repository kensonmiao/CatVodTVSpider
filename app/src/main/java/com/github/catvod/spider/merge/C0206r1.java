package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.r1  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0206r1 extends F2 {
    private static final Y0 f;
    public static final C0206r1 g;

    static {
        C0206r1 c0206r1 = new C0206r1();
        g = c0206r1;
        int b = E.b();
        if (64 >= b) {
            b = 64;
        }
        f = new ExecutorC0031c5(c0206r1, E.o("kotlinx.coroutines.io.parallelism", b, 0, 0, 12));
    }

    private C0206r1() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.github.catvod.spider.merge.Y0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
