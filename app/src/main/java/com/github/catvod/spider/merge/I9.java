package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum I9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public I9() {
        super("AfterDoctypeName", 53, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        EnumC0024ba enumC0024ba;
        W8 w8 = EnumC0024ba.c;
        if (c0110j0.t()) {
            l8.p(this);
            l8.m.f = true;
            l8.n();
            l8.u(w8);
        } else if (c0110j0.z('\t', '\n', '\r', '\f', ' ')) {
            c0110j0.a();
        } else if (c0110j0.y('>')) {
            l8.n();
            l8.a(w8);
        } else {
            if (c0110j0.x("PUBLIC")) {
                l8.m.c = "PUBLIC";
                enumC0024ba = EnumC0024ba.e0;
            } else if (!c0110j0.x("SYSTEM")) {
                l8.q(this);
                l8.m.f = true;
                l8.a(EnumC0024ba.p0);
                return;
            } else {
                l8.m.c = "SYSTEM";
                enumC0024ba = EnumC0024ba.k0;
            }
            l8.u(enumC0024ba);
        }
    }
}
