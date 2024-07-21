package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.p9  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0191p9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0191p9() {
        super("BeforeAttributeValue", 36, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        EnumC0024ba enumC0024ba;
        W8 w8 = EnumC0024ba.c;
        C0238t9 c0238t9 = EnumC0024ba.P;
        char e = c0110j0.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '\"') {
                    if (e != '`') {
                        if (e == 65535) {
                            l8.p(this);
                        } else if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                            return;
                        } else {
                            if (e != '&') {
                                if (e != '\'') {
                                    switch (e) {
                                        case '>':
                                            l8.q(this);
                                            break;
                                    }
                                } else {
                                    enumC0024ba = EnumC0024ba.O;
                                }
                            }
                            c0110j0.G();
                        }
                        l8.o();
                        l8.u(w8);
                        return;
                    }
                    l8.q(this);
                    l8.i.k(e);
                } else {
                    enumC0024ba = EnumC0024ba.N;
                }
                l8.u(enumC0024ba);
                return;
            }
            return;
        }
        l8.q(this);
        l8.i.k((char) 65533);
        l8.u(c0238t9);
    }
}
