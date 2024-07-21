package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum G9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public G9() {
        super("BeforeDoctypeName", 51, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        H9 h9 = EnumC0024ba.c0;
        if (c0110j0.C()) {
            l8.f();
            l8.u(h9);
            return;
        }
        char e = c0110j0.e();
        if (e == 0) {
            l8.q(this);
            l8.f();
            l8.m.b.append((char) 65533);
        } else if (e == ' ') {
            return;
        } else {
            if (e == 65535) {
                l8.p(this);
                l8.f();
                l8.m.f = true;
                l8.n();
                l8.u(EnumC0024ba.c);
                return;
            } else if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                return;
            } else {
                l8.f();
                l8.m.b.append(e);
            }
        }
        l8.u(h9);
    }
}
