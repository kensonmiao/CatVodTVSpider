package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class K6 extends RuntimeException {
    private final M6<?, ?> c;
    private final C0116j6 d;
    private final InterfaceC0245u4 e;
    private G8 f;
    private int g;

    public K6(M6<?, ?> m6, InterfaceC0245u4 interfaceC0245u4, C0116j6 c0116j6) {
        this.g = -1;
        this.c = m6;
        this.e = interfaceC0245u4;
        this.d = c0116j6;
        if (m6 != null) {
            this.g = m6.i();
        }
    }

    public final C0293y4 a() {
        M6<?, ?> m6 = this.c;
        if (m6 != null) {
            return m6.f().c(this.g, this.d);
        }
        return null;
    }

    public final InterfaceC0245u4 b() {
        return this.e;
    }

    public final G8 c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(int i) {
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(G8 g8) {
        this.f = g8;
    }
}
