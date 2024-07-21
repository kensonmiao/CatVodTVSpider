package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum L9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public L9() {
        super("DoctypePublicIdentifier_doubleQuoted", 56, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        StringBuilder sb;
        W8 w8 = EnumC0024ba.c;
        char e = c0110j0.e();
        if (e != 0) {
            if (e == '\"') {
                l8.u(EnumC0024ba.i0);
                return;
            }
            if (e == '>') {
                l8.q(this);
            } else if (e != 65535) {
                sb = l8.m.d;
            } else {
                l8.p(this);
            }
            l8.m.f = true;
            l8.n();
            l8.u(w8);
            return;
        }
        l8.q(this);
        sb = l8.m.d;
        e = 65533;
        sb.append(e);
    }
}
