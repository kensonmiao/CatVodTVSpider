package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum H9 extends EnumC0024ba {
    public H9() {
        super("DoctypeName", 52, null);
    }

    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        StringBuilder sb;
        W8 w8 = EnumC0024ba.c;
        if (c0110j0.C()) {
            l8.m.b.append(c0110j0.j());
            return;
        }
        char e = c0110j0.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '>') {
                    if (e == 65535) {
                        l8.p(this);
                        l8.m.f = true;
                    } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        sb = l8.m.b;
                    }
                }
                l8.n();
                l8.u(w8);
                return;
            }
            l8.u(EnumC0024ba.d0);
            return;
        }
        l8.q(this);
        sb = l8.m.b;
        e = 65533;
        sb.append(e);
    }
}
