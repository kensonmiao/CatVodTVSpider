package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.w2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0267w2 extends Y0 {
    private long e;
    private boolean f;
    private C0001a g;

    private final long f(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static void h(AbstractC0267w2 abstractC0267w2, boolean z, int i, Object obj) {
        abstractC0267w2.e += abstractC0267w2.f(false);
        abstractC0267w2.f = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long g() {
        C0001a c0001a = this.g;
        return (c0001a == null || c0001a.d()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean i() {
        C0001a c0001a = this.g;
        if (c0001a != null) {
            return c0001a.d();
        }
        return true;
    }

    public final boolean j() {
        kotlinx.coroutines.b bVar;
        C0001a c0001a = this.g;
        if (c0001a == null || (bVar = (kotlinx.coroutines.b) c0001a.i()) == null) {
            return false;
        }
        bVar.run();
        return true;
    }
}
