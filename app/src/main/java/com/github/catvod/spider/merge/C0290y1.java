package com.github.catvod.spider.merge;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.y1 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0290y1 extends E1 {
    private C0278x1 l;
    private C0080g6 m;
    private int n;

    public C0290y1() {
        super(C0022b8.l("#root", C0020b6.c), "", null);
        this.l = new C0278x1();
        this.n = 1;
        this.m = new C0080g6(new R3());
    }

    @Override // com.github.catvod.spider.merge.E1
    public final E1 o0(String str) {
        E1 M;
        E1 M2;
        Iterator<E1> it = Q().iterator();
        while (true) {
            if (!it.hasNext()) {
                M = M("html");
                break;
            }
            M = it.next();
            if (M.e0().equals("html")) {
                break;
            }
        }
        Iterator<E1> it2 = M.Q().iterator();
        while (true) {
            if (!it2.hasNext()) {
                M2 = M.M("body");
                break;
            }
            M2 = it2.next();
            if (!"body".equals(M2.e0())) {
                if ("frameset".equals(M2.e0())) {
                    break;
                }
            } else {
                break;
            }
        }
        M2.o0(str);
        return this;
    }

    @Override // com.github.catvod.spider.merge.E1, com.github.catvod.spider.merge.A5
    /* renamed from: r0 */
    public final C0290y1 j() {
        C0290y1 c0290y1 = (C0290y1) super.j();
        c0290y1.l = this.l.clone();
        return c0290y1;
    }

    public final C0278x1 s0() {
        return this.l;
    }

    @Override // com.github.catvod.spider.merge.E1, com.github.catvod.spider.merge.A5
    public final String t() {
        return "#document";
    }

    public final C0290y1 t0(C0080g6 c0080g6) {
        this.m = c0080g6;
        return this;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final String u() {
        return Y();
    }

    public final C0080g6 u0() {
        return this.m;
    }

    public final C0290y1 v0() {
        this.n = 2;
        return this;
    }

    public final int w0() {
        return this.n;
    }
}
