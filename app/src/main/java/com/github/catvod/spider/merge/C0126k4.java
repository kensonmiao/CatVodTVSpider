package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.k4  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
enum C0126k4 extends EnumC0186p4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0126k4() {
        super("InHeadNoscript", 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0186p4
    public final boolean d(F8 f8, R3 r3) {
        C0297y8 c0297y8;
        C0114j4 c0114j4 = EnumC0186p4.f;
        if (f8.c()) {
            r3.n(this);
        } else if (f8.f() && ((D8) f8).c.equals("html")) {
            return r3.X(f8, EnumC0186p4.i);
        } else {
            if (!f8.e() || !((C8) f8).c.equals("noscript")) {
                if (!EnumC0186p4.a(f8) && !f8.b() && (!f8.f() || !C0308z7.b(((D8) f8).c, E.h))) {
                    if (f8.e() && ((C8) f8).c.equals("br")) {
                        r3.n(this);
                        c0297y8 = new C0297y8();
                    } else if ((f8.f() && C0308z7.b(((D8) f8).c, E.M)) || f8.e()) {
                        r3.n(this);
                        return false;
                    } else {
                        r3.n(this);
                        c0297y8 = new C0297y8();
                    }
                    c0297y8.i(f8.toString());
                    r3.E(c0297y8);
                    return true;
                }
                return r3.X(f8, c0114j4);
            }
            r3.U();
            r3.j0(c0114j4);
        }
        return true;
    }
}
