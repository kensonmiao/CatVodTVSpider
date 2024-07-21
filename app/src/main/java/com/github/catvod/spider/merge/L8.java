package com.github.catvod.spider.merge;

import java.util.Arrays;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class L8 {
    private static final char[] r;
    static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final C0110j0 a;
    private final C0008a6 b;
    private F8 d;
    E8 i;
    private String o;
    private EnumC0024ba c = EnumC0024ba.c;
    private boolean e = false;
    private String f = null;
    private StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    D8 j = new D8();
    C8 k = new C8();
    C0297y8 l = new C0297y8();
    A8 m = new A8();
    C0309z8 n = new C0309z8();
    private final int[] p = new int[1];
    private final int[] q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public L8(C0110j0 c0110j0, C0008a6 c0008a6) {
        this.a = c0110j0;
        this.b = c0008a6;
    }

    private void c(String str) {
        if (this.b.a()) {
            this.b.add(new Z5(this.a.E(), "Invalid character reference: %s", str));
        }
    }

    public final void a(EnumC0024ba enumC0024ba) {
        this.a.a();
        this.c = enumC0024ba;
    }

    public final String b() {
        return this.o;
    }

    public final int[] d(Character ch, boolean z) {
        int i;
        if (this.a.t()) {
            return null;
        }
        if ((ch == null || ch.charValue() != this.a.s()) && !this.a.A(r)) {
            int[] iArr = this.p;
            this.a.v();
            if (this.a.w("#")) {
                boolean x = this.a.x("X");
                C0110j0 c0110j0 = this.a;
                String i2 = x ? c0110j0.i() : c0110j0.h();
                if (i2.length() != 0) {
                    this.a.H();
                    if (!this.a.w(";")) {
                        c("missing semicolon");
                    }
                    try {
                        i = Integer.valueOf(i2, x ? 16 : 10).intValue();
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                        c("character outside of valid range");
                        iArr[0] = 65533;
                    } else {
                        if (i >= 128) {
                            int[] iArr2 = s;
                            if (i < 160) {
                                c("character is not a valid unicode code point");
                                i = iArr2[i - 128];
                            }
                        }
                        iArr[0] = i;
                    }
                    return iArr;
                }
                c("numeric reference with no numerals");
            } else {
                String k = this.a.k();
                boolean y = this.a.y(';');
                if (!(L1.e(k) || (L1.f(k) && y))) {
                    this.a.F();
                    if (y) {
                        c("invalid named reference");
                    }
                    return null;
                } else if (!z || (!this.a.C() && !this.a.B() && !this.a.z('=', '-', '_'))) {
                    this.a.H();
                    if (!this.a.w(";")) {
                        c("missing semicolon");
                    }
                    int c = L1.c(k, this.q);
                    if (c == 1) {
                        iArr[0] = this.q[0];
                        return iArr;
                    } else if (c == 2) {
                        return this.q;
                    } else {
                        R0.f("Unexpected characters returned for " + k);
                        throw null;
                    }
                }
            }
            this.a.F();
            return null;
        }
        return null;
    }

    public final void e() {
        this.n.g();
        this.n.getClass();
    }

    public final void f() {
        this.m.g();
    }

    public final E8 g(boolean z) {
        E8 e8;
        if (z) {
            e8 = this.j;
            e8.v();
        } else {
            e8 = this.k;
            e8.g();
        }
        this.i = e8;
        return e8;
    }

    public final void h() {
        F8.h(this.h);
    }

    public final void i(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(c);
    }

    public final void j(F8 f8) {
        R0.k(this.e);
        this.d = f8;
        this.e = true;
        int i = f8.a;
        if (i == 2) {
            this.o = ((D8) f8).b;
        } else if (i == 3 && ((C8) f8).r()) {
            r("Attributes incorrectly present on end tag");
        }
    }

    public final void k(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(str);
    }

    public final void l(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append((CharSequence) sb);
    }

    public final void m() {
        j(this.n);
    }

    public final void n() {
        j(this.m);
    }

    public final void o() {
        this.i.q();
        j(this.i);
    }

    public final void p(EnumC0024ba enumC0024ba) {
        if (this.b.a()) {
            this.b.add(new Z5(this.a.E(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC0024ba));
        }
    }

    public final void q(EnumC0024ba enumC0024ba) {
        if (this.b.a()) {
            this.b.add(new Z5(this.a.E(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.a.s()), enumC0024ba));
        }
    }

    public final void r(String str) {
        if (this.b.a()) {
            this.b.add(new Z5(this.a.E(), str));
        }
    }

    public final boolean s() {
        return this.o != null && this.i.t().equalsIgnoreCase(this.o);
    }

    public final F8 t() {
        while (!this.e) {
            this.c.g(this, this.a);
        }
        StringBuilder sb = this.g;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            this.f = null;
            C0297y8 c0297y8 = this.l;
            c0297y8.i(sb2);
            return c0297y8;
        }
        String str = this.f;
        if (str == null) {
            this.e = false;
            return this.d;
        }
        C0297y8 c0297y82 = this.l;
        c0297y82.i(str);
        this.f = null;
        return c0297y82;
    }

    public final void u(EnumC0024ba enumC0024ba) {
        this.c = enumC0024ba;
    }
}
