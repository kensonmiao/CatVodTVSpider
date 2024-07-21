package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.x9  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0286x9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0286x9() {
        super("MarkupDeclarationOpen", 43, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        EnumC0024ba enumC0024ba;
        if (c0110j0.w("--")) {
            l8.n.g();
            enumC0024ba = EnumC0024ba.U;
        } else if (c0110j0.x("DOCTYPE")) {
            enumC0024ba = EnumC0024ba.a0;
        } else if (!c0110j0.w("[CDATA[")) {
            l8.q(this);
            l8.e();
            l8.a(EnumC0024ba.S);
            return;
        } else {
            l8.h();
            enumC0024ba = EnumC0024ba.q0;
        }
        l8.u(enumC0024ba);
    }
}
