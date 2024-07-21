package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.m9 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public enum C0155m9 extends EnumC0024ba {
    public C0155m9() {
        super("BeforeAttributeName", 33, null);
    }

    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        W8 w8 = EnumC0024ba.c;
        C0167n9 c0167n9 = EnumC0024ba.K;
        char e = c0110j0.e();
        if (e == 0) {
            c0110j0.G();
            l8.q(this);
            l8.i.u();
        } else if (e == ' ') {
            return;
        } else {
            if (e != '\"' && e != '\'') {
                if (e == '/') {
                    l8.u(EnumC0024ba.R);
                    return;
                }
                if (e == 65535) {
                    l8.p(this);
                } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                    switch (e) {
                        case '<':
                            c0110j0.G();
                            l8.q(this);
                            l8.o();
                            break;
                        case '=':
                            break;
                        case '>':
                            l8.o();
                            break;
                        default:
                            l8.i.u();
                            c0110j0.G();
                            break;
                    }
                } else {
                    return;
                }
                l8.u(w8);
                return;
            }
            l8.q(this);
            l8.i.u();
            l8.i.i(e);
        }
        l8.u(c0167n9);
    }
}
