package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.r2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0207r2 extends AbstractC0255v2 {
    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        if (e12 instanceof D6) {
            return true;
        }
        for (A5 a5 : e12.q0()) {
            D6 d6 = new D6(C0022b8.l(e12.n0(), C0020b6.d), e12.e(), e12.d());
            a5.E(d6);
            d6.L(a5);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}
