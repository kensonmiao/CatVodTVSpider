package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.t9  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0238t9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0238t9() {
        super("AttributeValue_unquoted", 39, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        E8 e8;
        W8 w8 = EnumC0024ba.c;
        String q = c0110j0.q(EnumC0024ba.s0);
        if (q.length() > 0) {
            l8.i.l(q);
        }
        char e = c0110j0.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '\"' && e != '`') {
                    if (e == 65535) {
                        l8.p(this);
                    } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        if (e == '&') {
                            int[] d = l8.d('>', true);
                            E8 e82 = l8.i;
                            if (d != null) {
                                e82.m(d);
                                return;
                            } else {
                                e82.k('&');
                                return;
                            }
                        } else if (e != '\'') {
                            switch (e) {
                                case '>':
                                    l8.o();
                                    break;
                                case '<':
                                case '=':
                                    l8.q(this);
                                    break;
                            }
                            e8 = l8.i;
                        }
                    }
                    l8.u(w8);
                    return;
                }
                l8.q(this);
                e8 = l8.i;
            }
            l8.u(EnumC0024ba.J);
            return;
        }
        l8.q(this);
        e8 = l8.i;
        e = 65533;
        e8.k(e);
    }
}
