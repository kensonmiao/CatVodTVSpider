package com.github.catvod.spider.merge;

import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.fa */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0072fa {
    protected C0080g6 a;
    C0110j0 b;
    L8 c;
    protected C0290y1 d;
    protected ArrayList<E1> e;
    protected String f;
    protected F8 g;
    protected C0020b6 h;
    private D8 i = new D8();
    private C8 j = new C8();

    public final E1 a() {
        int size = this.e.size();
        if (size > 0) {
            return this.e.get(size - 1);
        }
        return null;
    }

    public abstract boolean b(String str);

    public abstract boolean c(F8 f8);

    public final boolean d(String str) {
        F8 f8 = this.g;
        C8 c8 = this.j;
        if (f8 == c8) {
            C8 c82 = new C8();
            c82.s(str);
            return c(c82);
        }
        c8.g();
        c8.s(str);
        return c(c8);
    }

    public boolean e(K k) {
        D8 d8 = this.i;
        if (this.g == d8) {
            d8 = new D8();
        } else {
            d8.v();
        }
        d8.b = "input";
        d8.j = k;
        d8.c = F.j("input");
        return c(d8);
    }

    public final boolean f(String str) {
        D8 d8 = this.i;
        if (this.g == d8) {
            d8 = new D8();
        } else {
            d8.v();
        }
        d8.s(str);
        return c(d8);
    }
}
