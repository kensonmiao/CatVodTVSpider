package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.u9  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0250u9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0250u9() {
        super("AfterAttributeValue_quoted", 40, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        W8 w8 = EnumC0024ba.c;
        C0155m9 c0155m9 = EnumC0024ba.J;
        char e = c0110j0.e();
        if (e != '\t' && e != '\n' && e != '\f' && e != '\r' && e != ' ') {
            if (e == '/') {
                l8.u(EnumC0024ba.R);
                return;
            }
            if (e == '>') {
                l8.o();
            } else if (e != 65535) {
                c0110j0.G();
                l8.q(this);
            } else {
                l8.p(this);
            }
            l8.u(w8);
            return;
        }
        l8.u(c0155m9);
    }
}
