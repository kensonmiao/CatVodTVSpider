package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class M4 extends C0037d {
    private final Q4 f;
    private final boolean g;

    public M4(M4 m4, AbstractC0133l abstractC0133l) {
        super(m4, abstractC0133l, m4.c, m4.e);
        this.f = m4.f;
        this.g = d(m4, abstractC0133l);
    }

    public M4(M4 m4, AbstractC0133l abstractC0133l, Q4 q4) {
        super(m4, abstractC0133l, m4.c, m4.e);
        this.f = q4;
        this.g = d(m4, abstractC0133l);
    }

    public M4(M4 m4, AbstractC0133l abstractC0133l, AbstractC0283x6 abstractC0283x6) {
        super(m4, abstractC0133l, abstractC0283x6, m4.e);
        this.f = m4.f;
        this.g = d(m4, abstractC0133l);
    }

    public M4(AbstractC0133l abstractC0133l, int i, AbstractC0283x6 abstractC0283x6) {
        super(abstractC0133l, i, abstractC0283x6, AbstractC0105i7.c);
        this.g = false;
        this.f = null;
    }

    private static boolean d(M4 m4, AbstractC0133l abstractC0133l) {
        return m4.g || ((abstractC0133l instanceof AbstractC0171o1) && ((AbstractC0171o1) abstractC0133l).h);
    }

    @Override // com.github.catvod.spider.merge.C0037d
    public final boolean a(C0037d c0037d) {
        boolean z = true;
        if (this == c0037d) {
            return true;
        }
        if (c0037d instanceof M4) {
            M4 m4 = (M4) c0037d;
            if (this.g != m4.g) {
                return false;
            }
            Q4 q4 = this.f;
            Q4 q42 = m4.f;
            if (q4 != null) {
                z = q4.equals(q42);
            } else if (q42 != null) {
                z = false;
            }
            if (z) {
                return super.a(c0037d);
            }
            return false;
        }
        return false;
    }

    public final Q4 e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.C0037d
    public final int hashCode() {
        return D5.k(D5.p(D5.o(D5.p(D5.p(D5.o(D5.o(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }
}
