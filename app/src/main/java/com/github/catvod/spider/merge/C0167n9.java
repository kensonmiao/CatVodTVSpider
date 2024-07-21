package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.n9 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0167n9 extends EnumC0024ba {
    public C0167n9() {
        super("AttributeName", 34, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        E8 e8;
        EnumC0024ba enumC0024ba;
        W8 w8 = EnumC0024ba.c;
        l8.i.j(c0110j0.q(EnumC0024ba.r0));
        char e = c0110j0.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '\"' && e != '\'') {
                    if (e != '/') {
                        if (e == 65535) {
                            l8.p(this);
                        } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                            switch (e) {
                                case '=':
                                    enumC0024ba = EnumC0024ba.M;
                                    break;
                                case '>':
                                    l8.o();
                                    break;
                            }
                            e8 = l8.i;
                        }
                        l8.u(w8);
                        return;
                    }
                    enumC0024ba = EnumC0024ba.R;
                    l8.u(enumC0024ba);
                    return;
                }
                l8.q(this);
                e8 = l8.i;
            }
            enumC0024ba = EnumC0024ba.L;
            l8.u(enumC0024ba);
            return;
        }
        l8.q(this);
        e8 = l8.i;
        e = 65533;
        e8.i(e);
    }
}
