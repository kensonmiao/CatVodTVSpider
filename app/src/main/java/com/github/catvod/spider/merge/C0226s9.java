package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.s9  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0226s9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0226s9() {
        super("Rcdata", 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        EnumC0024ba enumC0024ba;
        char s = c0110j0.s();
        if (s == 0) {
            l8.q(this);
            c0110j0.a();
            l8.i((char) 65533);
            return;
        }
        if (s == '&') {
            enumC0024ba = EnumC0024ba.f;
        } else if (s != '<') {
            if (s != 65535) {
                l8.k(c0110j0.g());
                return;
            } else {
                l8.j(new B8());
                return;
            }
        } else {
            enumC0024ba = EnumC0024ba.m;
        }
        l8.a(enumC0024ba);
    }
}
