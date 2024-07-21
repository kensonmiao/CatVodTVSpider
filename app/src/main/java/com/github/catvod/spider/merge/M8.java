package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum M8 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public M8() {
        super("TagName", 9, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        String str;
        EnumC0024ba enumC0024ba;
        W8 w8 = EnumC0024ba.c;
        l8.i.o(c0110j0.m());
        char e = c0110j0.e();
        if (e == 0) {
            E8 e8 = l8.i;
            str = EnumC0024ba.t0;
            e8.o(str);
            return;
        }
        if (e != ' ') {
            if (e == '/') {
                enumC0024ba = EnumC0024ba.R;
                l8.u(enumC0024ba);
            }
            if (e == '<') {
                c0110j0.G();
                l8.q(this);
            } else if (e != '>') {
                if (e == 65535) {
                    l8.p(this);
                    l8.u(w8);
                    return;
                } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                    l8.i.n(e);
                    return;
                }
            }
            l8.o();
            l8.u(w8);
            return;
        }
        enumC0024ba = EnumC0024ba.J;
        l8.u(enumC0024ba);
    }
}
