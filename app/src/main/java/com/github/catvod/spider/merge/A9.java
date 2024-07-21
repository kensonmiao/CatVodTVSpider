package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum A9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public A9() {
        super("Comment", 46, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        char s = c0110j0.s();
        if (s == 0) {
            l8.q(this);
            c0110j0.a();
            l8.n.i((char) 65533);
        } else if (s == '-') {
            l8.a(EnumC0024ba.X);
        } else if (s != 65535) {
            l8.n.j(c0110j0.p('-', 0));
        } else {
            l8.p(this);
            l8.m();
            l8.u(EnumC0024ba.c);
        }
    }
}
