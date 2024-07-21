package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.l4  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0138l4 extends EnumC0186p4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0138l4() {
        super("AfterHead", 5, null);
    }

    private boolean e(F8 f8, R3 r3) {
        r3.f("body");
        r3.o(true);
        return r3.c(f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0186p4
    public final boolean d(F8 f8, R3 r3) {
        C0150m4 c0150m4 = EnumC0186p4.i;
        if (EnumC0186p4.a(f8)) {
            r3.E((C0297y8) f8);
            return true;
        } else if (f8.b()) {
            r3.F((C0309z8) f8);
            return true;
        } else if (f8.c()) {
            r3.n(this);
            return true;
        } else {
            if (f8.f()) {
                D8 d8 = (D8) f8;
                String str = d8.c;
                if (str.equals("html")) {
                    return r3.X(f8, c0150m4);
                }
                if (str.equals("body")) {
                    r3.D(d8);
                    r3.o(false);
                    r3.j0(c0150m4);
                    return true;
                } else if (str.equals("frameset")) {
                    r3.D(d8);
                    r3.j0(EnumC0186p4.u);
                    return true;
                } else if (C0308z7.b(str, E.i)) {
                    r3.n(this);
                    E1 u = r3.u();
                    r3.e.add(u);
                    r3.X(f8, EnumC0186p4.f);
                    r3.c0(u);
                    return true;
                } else if (str.equals("head")) {
                    r3.n(this);
                    return false;
                }
            } else if (f8.e() && !C0308z7.b(((C8) f8).c, E.f)) {
                r3.n(this);
                return false;
            }
            e(f8, r3);
            return true;
        }
    }
}
