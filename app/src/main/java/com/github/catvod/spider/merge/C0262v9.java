package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.v9 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public enum C0262v9 extends EnumC0024ba {
    public C0262v9() {
        super("SelfClosingStartTag", 41, null);
    }

    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        W8 w8 = EnumC0024ba.c;
        char e = c0110j0.e();
        if (e == '>') {
            l8.i.i = true;
            l8.o();
        } else if (e != 65535) {
            c0110j0.G();
            l8.q(this);
            l8.u(EnumC0024ba.J);
            return;
        } else {
            l8.p(this);
        }
        l8.u(w8);
    }
}
