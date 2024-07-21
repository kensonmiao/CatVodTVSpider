package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.o9  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0179o9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0179o9() {
        super("AfterAttributeName", 35, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        EnumC0024ba enumC0024ba;
        W8 w8 = EnumC0024ba.c;
        C0167n9 c0167n9 = EnumC0024ba.K;
        char e = c0110j0.e();
        if (e == 0) {
            l8.q(this);
            l8.i.i((char) 65533);
        } else if (e == ' ') {
            return;
        } else {
            if (e != '\"' && e != '\'') {
                if (e != '/') {
                    if (e == 65535) {
                        l8.p(this);
                    } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        switch (e) {
                            case '<':
                                break;
                            case '=':
                                enumC0024ba = EnumC0024ba.M;
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
                enumC0024ba = EnumC0024ba.R;
                l8.u(enumC0024ba);
                return;
            }
            l8.q(this);
            l8.i.u();
            l8.i.i(e);
        }
        l8.u(c0167n9);
    }
}
