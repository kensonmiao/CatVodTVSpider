package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum F9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public F9() {
        super("Doctype", 50, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        G9 g9 = EnumC0024ba.b0;
        char e = c0110j0.e();
        if (e != '\t' && e != '\n' && e != '\f' && e != '\r' && e != ' ') {
            if (e != '>') {
                if (e != 65535) {
                    l8.q(this);
                } else {
                    l8.p(this);
                }
            }
            l8.q(this);
            l8.f();
            l8.m.f = true;
            l8.n();
            l8.u(EnumC0024ba.c);
            return;
        }
        l8.u(g9);
    }
}
