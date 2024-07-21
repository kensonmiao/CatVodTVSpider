package com.github.catvod.spider.merge;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.z6  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0307z6 extends AbstractC0169o {
    public static final C0307z6 a = new C0307z6();

    private C0307z6() {
    }

    @Override // com.github.catvod.spider.merge.AbstractC0169o
    public final boolean E(Object obj, Object obj2) {
        C0037d c0037d = (C0037d) obj;
        C0037d c0037d2 = (C0037d) obj2;
        if (c0037d == c0037d2) {
            return true;
        }
        return c0037d != null && c0037d2 != null && c0037d.a.b == c0037d2.a.b && c0037d.c.equals(c0037d2.c);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0169o
    public final int F(Object obj) {
        C0037d c0037d = (C0037d) obj;
        return D5.k(D5.p(D5.o(7, c0037d.a.b), c0037d.c), 2);
    }
}
