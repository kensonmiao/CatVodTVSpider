package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.t0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0229t0 implements InterfaceC0098i0 {
    protected final int a;
    protected int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0229t0(int i) {
        this.a = i;
    }

    public static AbstractC0229t0 k(C0182p0 c0182p0) {
        int b = C0158n0.b(c0182p0.e());
        if (b == 0) {
            int g = c0182p0.g();
            int h = c0182p0.h();
            byte[] c = c0182p0.c();
            c0182p0.a();
            return new C0217s0(g, h, c);
        } else if (b == 1) {
            int g2 = c0182p0.g();
            int h2 = c0182p0.h();
            char[] d = c0182p0.d();
            c0182p0.a();
            return new C0194q0(g2, h2, d);
        } else if (b == 2) {
            int g3 = c0182p0.g();
            int h3 = c0182p0.h();
            int[] f = c0182p0.f();
            c0182p0.a();
            return new C0205r0(g3, h3, f);
        } else {
            throw new UnsupportedOperationException("Not reached");
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final void c(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final int f() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final int g() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final void i() {
        int i = this.a;
        int i2 = this.b;
        if (i - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        this.b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return j(C0281x4.b(0, this.a - 1));
    }
}
