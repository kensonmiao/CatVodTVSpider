package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.q9  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0203q9 extends EnumC0024ba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0203q9() {
        super("AttributeValue_doubleQuoted", 37, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0024ba
    public final void g(L8 l8, C0110j0 c0110j0) {
        E8 e8;
        EnumC0024ba enumC0024ba;
        String f = c0110j0.f(false);
        if (f.length() > 0) {
            l8.i.l(f);
        } else {
            l8.i.w();
        }
        char e = c0110j0.e();
        if (e != 0) {
            if (e == '\"') {
                enumC0024ba = EnumC0024ba.Q;
            } else if (e == '&') {
                int[] d = l8.d('\"', true);
                E8 e82 = l8.i;
                if (d != null) {
                    e82.m(d);
                    return;
                } else {
                    e82.k('&');
                    return;
                }
            } else if (e != 65535) {
                e8 = l8.i;
            } else {
                l8.p(this);
                enumC0024ba = EnumC0024ba.c;
            }
            l8.u(enumC0024ba);
            return;
        }
        l8.q(this);
        e8 = l8.i;
        e = 65533;
        e8.k(e);
    }
}
