package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.o4 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public enum C0174o4 extends EnumC0186p4 {
    public C0174o4() {
        super("InTable", 8, null);
    }

    @Override // com.github.catvod.spider.merge.EnumC0186p4
    public final boolean d(F8 f8, R3 r3) {
        EnumC0186p4 enumC0186p4;
        if (f8.a()) {
            r3.R();
            r3.P();
            r3.j0(EnumC0186p4.l);
            return r3.c(f8);
        } else if (f8.b()) {
            r3.F((C0309z8) f8);
            return true;
        } else if (f8.c()) {
            r3.n(this);
            return false;
        } else if (!f8.f()) {
            if (!f8.e()) {
                if (f8.d()) {
                    if (r3.a().e0().equals("html")) {
                        r3.n(this);
                    }
                    return true;
                }
                return e(f8, r3);
            }
            String str = ((C8) f8).c;
            if (!str.equals("table")) {
                if (C0308z7.b(str, E.D)) {
                    r3.n(this);
                    return false;
                }
                return e(f8, r3);
            } else if (!r3.B(str)) {
                r3.n(this);
                return false;
            } else {
                r3.V("table");
                r3.e0();
                return true;
            }
        } else {
            D8 d8 = (D8) f8;
            String str2 = d8.c;
            if (str2.equals("caption")) {
                r3.l();
                r3.J();
                r3.D(d8);
                enumC0186p4 = EnumC0186p4.m;
            } else if (str2.equals("colgroup")) {
                r3.l();
                r3.D(d8);
                enumC0186p4 = EnumC0186p4.n;
            } else if (str2.equals("col")) {
                r3.f("colgroup");
                return r3.c(f8);
            } else if (!C0308z7.b(str2, E.w)) {
                if (C0308z7.b(str2, E.x)) {
                    r3.f("tbody");
                    return r3.c(f8);
                }
                if (str2.equals("table")) {
                    r3.n(this);
                    if (r3.d("table")) {
                        return r3.c(f8);
                    }
                } else if (C0308z7.b(str2, E.y)) {
                    return r3.X(f8, EnumC0186p4.f);
                } else {
                    if (str2.equals("input")) {
                        if (!d8.r() || !d8.j.j("type").equalsIgnoreCase("hidden")) {
                            return e(f8, r3);
                        }
                        r3.G(d8);
                    } else if (!str2.equals("form")) {
                        return e(f8, r3);
                    } else {
                        r3.n(this);
                        if (r3.s() != null) {
                            return false;
                        }
                        r3.H(d8, false);
                    }
                }
                return true;
            } else {
                r3.l();
                r3.D(d8);
                enumC0186p4 = EnumC0186p4.o;
            }
            r3.j0(enumC0186p4);
            return true;
        }
    }

    final boolean e(F8 f8, R3 r3) {
        C0150m4 c0150m4 = EnumC0186p4.i;
        r3.n(this);
        if (C0308z7.b(r3.a().e0(), E.E)) {
            r3.g0(true);
            boolean X = r3.X(f8, c0150m4);
            r3.g0(false);
            return X;
        }
        return r3.X(f8, c0150m4);
    }
}
