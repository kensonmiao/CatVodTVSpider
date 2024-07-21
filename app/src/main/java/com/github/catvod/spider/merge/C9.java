package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9() {
        super("CommentEnd", 48, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        W8 w8 = EnumC0024ba.c;
        A9 a9 = EnumC0024ba.W;
        char e = c0110j0.e();
        if (e != 0) {
            if (e == '!') {
                l8.q(this);
                l8.u(EnumC0024ba.Z);
                return;
            } else if (e == '-') {
                l8.q(this);
                l8.n.i('-');
                return;
            } else {
                if (e != '>') {
                    if (e != 65535) {
                        l8.q(this);
                        C0309z8 c0309z8 = l8.n;
                        c0309z8.j("--");
                        c0309z8.i(e);
                    } else {
                        l8.p(this);
                    }
                }
                l8.m();
                l8.u(w8);
                return;
            }
        }
        l8.q(this);
        C0309z8 c0309z82 = l8.n;
        c0309z82.j("--");
        c0309z82.i((char) 65533);
        l8.u(a9);
    }
}
