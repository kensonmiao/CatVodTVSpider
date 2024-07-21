package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum K9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public K9() {
        super("BeforeDoctypePublicIdentifier", 55, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        EnumC0024ba enumC0024ba;
        W8 w8 = EnumC0024ba.c;
        char e = c0110j0.e();
        if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
            return;
        }
        if (e == '\"') {
            enumC0024ba = EnumC0024ba.g0;
        } else if (e != '\'') {
            if (e == '>') {
                l8.q(this);
            } else if (e != 65535) {
                l8.q(this);
                l8.m.f = true;
                enumC0024ba = EnumC0024ba.p0;
            } else {
                l8.p(this);
            }
            l8.m.f = true;
            l8.n();
            l8.u(w8);
            return;
        } else {
            enumC0024ba = EnumC0024ba.h0;
        }
        l8.u(enumC0024ba);
    }
}
