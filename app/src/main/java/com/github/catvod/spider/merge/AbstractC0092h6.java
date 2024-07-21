package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.github.catvod.spider.merge.h6 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0092h6 extends M6<G8, C0104i6> {
    protected C0183p1 d = new C0183p1();
    protected K8 e;
    protected final C0269w4 f;
    protected C0116j6 g;
    protected boolean h;
    private C0068f6 i;
    protected List<InterfaceC0044d6> j;
    protected boolean k;

    static {
        new WeakHashMap();
    }

    public AbstractC0092h6(K8 k8) {
        C0269w4 c0269w4 = new C0269w4();
        this.f = c0269w4;
        c0269w4.a(0);
        this.h = true;
        this.e = null;
        C0183p1 c0183p1 = this.d;
        c0183p1.a = false;
        c0183p1.c = null;
        c0183p1.b = -1;
        this.g = null;
        this.k = false;
        u(this.i);
        this.i = null;
        c0269w4.b();
        c0269w4.a(0);
        ATNInterpreter atninterpreter = this.b;
        if (atninterpreter != 0) {
            atninterpreter.a();
        }
        this.e = k8;
    }

    @Override // com.github.catvod.spider.merge.M6
    public final boolean j(int i) {
        C0269w4 c0269w4 = this.f;
        return i >= c0269w4.c(c0269w4.f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    public final G8 l() {
        G8 q = q();
        if (q.e() != -1) {
            this.e.i();
        }
        ?? r1 = this.j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                C0116j6 c0116j6 = this.g;
                O1 o1 = new O1(q);
                c0116j6.getClass();
                c0116j6.h(o1);
                ?? r12 = this.j;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0044d6) it.next()).a();
                    }
                }
            } else {
                C0116j6 c0116j62 = this.g;
                C0094h8 c0094h8 = new C0094h8(q);
                c0116j62.getClass();
                c0116j62.h(c0094h8);
                ?? r13 = this.j;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0044d6) it2.next()).z(c0094h8);
                    }
                }
            }
        }
        return q;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.c6>, java.util.ArrayList] */
    public final void m(C0116j6 c0116j6) {
        C0116j6 c0116j62;
        C0116j6 c0116j63;
        if (this.h && (c0116j62 = this.g) != c0116j6 && (c0116j63 = (C0116j6) c0116j62.a) != null) {
            ?? r1 = c0116j63.d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            c0116j63.h(c0116j6);
        }
        this.g = c0116j6;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    public final void n(C0116j6 c0116j6, int i) {
        k(i);
        this.g = c0116j6;
        c0116j6.e = this.e.d(1);
        if (this.h) {
            C0116j6 c0116j62 = this.g;
            C0116j6 c0116j63 = (C0116j6) c0116j62.a;
            if (c0116j63 != null) {
                c0116j63.h(c0116j62);
            }
        }
        ?? r2 = this.j;
        if (r2 != 0) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                InterfaceC0044d6 interfaceC0044d6 = (InterfaceC0044d6) it.next();
                interfaceC0044d6.E(this.g);
                this.g.i(interfaceC0044d6);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    public final void o() {
        C0116j6 c0116j6;
        G8 d;
        if (this.k) {
            c0116j6 = this.g;
            d = this.e.d(1);
        } else {
            c0116j6 = this.g;
            d = this.e.d(-1);
        }
        c0116j6.f = d;
        ?? r0 = this.j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                InterfaceC0044d6 interfaceC0044d6 = (InterfaceC0044d6) this.j.get(size);
                this.g.j(interfaceC0044d6);
                interfaceC0044d6.e(this.g);
            }
        }
        k(this.g.b);
        this.g = (C0116j6) this.g.a;
    }

    public final C0116j6 p() {
        return this.g;
    }

    public final G8 q() {
        return this.e.d(1);
    }

    public final int r() {
        if (this.f.d()) {
            return -1;
        }
        C0269w4 c0269w4 = this.f;
        return c0269w4.c(c0269w4.f() - 1);
    }

    public final G8 s(int i) {
        G8 q = q();
        if (q.e() == i) {
            if (i == -1) {
                this.k = true;
            }
            this.d.i();
            l();
        } else {
            q = this.d.g(this);
            if (this.h && q.h() == -1) {
                C0116j6 c0116j6 = this.g;
                O1 o1 = new O1(q);
                c0116j6.getClass();
                c0116j6.h(o1);
            }
        }
        return q;
    }

    public final void t(G8 g8, String str, K6 k6) {
        ((C6) g()).a(this, g8, g8.d(), g8.a(), str, k6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.d6>, java.util.ArrayList] */
    public final void u(InterfaceC0044d6 interfaceC0044d6) {
        ?? r0 = this.j;
        if (r0 != 0 && r0.remove(interfaceC0044d6) && this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void v(C0183p1 c0183p1) {
        this.d = c0183p1;
    }
}
