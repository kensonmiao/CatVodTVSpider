package com.github.catvod.spider.merge;

import java.io.PrintStream;

/* renamed from: com.github.catvod.spider.merge.p1  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0183p1 {
    protected boolean a = false;
    protected int b = -1;
    protected C0293y4 c;
    protected C0116j6 d;
    protected int e;

    protected final void a(AbstractC0092h6 abstractC0092h6, C0293y4 c0293y4) {
        K8 k8 = abstractC0092h6.e;
        while (true) {
            int e = k8.e(1);
            if (e == -1 || c0293y4.d(e)) {
                return;
            }
            abstractC0092h6.l();
            k8 = abstractC0092h6.e;
        }
    }

    protected final String b(String str) {
        String replace = str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
        return "'" + replace + "'";
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.l>, java.util.ArrayList] */
    protected final C0293y4 c(AbstractC0092h6 abstractC0092h6) {
        C0025c c0025c = ((C0104i6) abstractC0092h6.b).a;
        C0293y4 c0293y4 = new C0293y4(new int[0]);
        for (S6 s6 = abstractC0092h6.g; s6 != null; s6 = s6.a) {
            int i = s6.b;
            if (i < 0) {
                break;
            }
            c0293y4.c(c0025c.e(((W6) ((AbstractC0133l) c0025c.a.get(i)).d(0)).c));
        }
        c0293y4.h();
        return c0293y4;
    }

    protected final C0293y4 d(AbstractC0092h6 abstractC0092h6) {
        abstractC0092h6.getClass();
        return eb.q.c(abstractC0092h6.i(), abstractC0092h6.g);
    }

    protected final String e(G8 g8) {
        if (g8 == null) {
            return "<no token>";
        }
        String c = g8.c();
        if (c == null) {
            if (g8.e() == -1) {
                c = "<EOF>";
            } else {
                StringBuilder a = A.a("<");
                a.append(g8.e());
                a.append(">");
                c = a.toString();
            }
        }
        return b(c);
    }

    public void f(AbstractC0092h6 abstractC0092h6, K6 k6) {
        C0293y4 c0293y4;
        if (this.b == abstractC0092h6.e.g() && (c0293y4 = this.c) != null && c0293y4.d(abstractC0092h6.i())) {
            abstractC0092h6.l();
        }
        this.b = abstractC0092h6.e.g();
        if (this.c == null) {
            this.c = new C0293y4(new int[0]);
        }
        this.c.a(abstractC0092h6.i());
        a(abstractC0092h6, c(abstractC0092h6));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.l>, java.util.ArrayList] */
    public G8 g(AbstractC0092h6 abstractC0092h6) {
        String sb;
        G8 k = k(abstractC0092h6);
        if (k != null) {
            abstractC0092h6.l();
            return k;
        }
        boolean z = true;
        if (!((C0104i6) abstractC0092h6.b).a.f(((AbstractC0133l) ((C0104i6) abstractC0092h6.b).a.a.get(abstractC0092h6.i())).d(0).a, abstractC0092h6.g).d(abstractC0092h6.e.e(1))) {
            z = false;
        } else if (!this.a) {
            this.a = true;
            G8 q = abstractC0092h6.q();
            C0293y4 d = d(abstractC0092h6);
            StringBuilder a = A.a("missing ");
            a.append(d.l(eb.o));
            a.append(" at ");
            a.append(e(q));
            abstractC0092h6.t(q, a.toString(), null);
        }
        if (z) {
            G8 q2 = abstractC0092h6.q();
            C0293y4 d2 = d(abstractC0092h6);
            int e = !d2.f() ? d2.e() : 0;
            if (e == -1) {
                sb = "<missing EOF>";
            } else {
                StringBuilder a2 = A.a("<missing ");
                a2.append(eb.o.a(e));
                a2.append(">");
                sb = a2.toString();
            }
            String str = sb;
            G8 d3 = abstractC0092h6.e.d(-1);
            if (q2.e() == -1 && d3 != null) {
                q2 = d3;
            }
            return ((J0) abstractC0092h6.e.b().e()).b(new W5(q2.b(), q2.b().b()), e, str, 0, -1, -1, q2.d(), q2.a());
        } else if (this.d == null) {
            throw new C0221s4(abstractC0092h6);
        } else {
            throw new C0221s4(abstractC0092h6, this.e, this.d);
        }
    }

    public final void h(AbstractC0092h6 abstractC0092h6, K6 k6) {
        String str;
        if (this.a) {
            return;
        }
        this.a = true;
        if (k6 instanceof C0282x5) {
            C0282x5 c0282x5 = (C0282x5) k6;
            K8 k8 = abstractC0092h6.e;
            if (k8 != null) {
                str = c0282x5.f().e() == -1 ? "<EOF>" : k8.h(c0282x5.f(), c0282x5.c());
            } else {
                str = "<unknown input>";
            }
            StringBuilder a = A.a("no viable alternative at input ");
            a.append(b(str));
            abstractC0092h6.t(c0282x5.c(), a.toString(), c0282x5);
        } else if (k6 instanceof C0221s4) {
            K6 k62 = (C0221s4) k6;
            StringBuilder a2 = A.a("mismatched input ");
            a2.append(e(k62.c()));
            a2.append(" expecting ");
            C0293y4 a3 = k62.a();
            ((eb) abstractC0092h6).getClass();
            a2.append(a3.l(eb.o));
            abstractC0092h6.t(k62.c(), a2.toString(), k62);
        } else if (k6 instanceof G2) {
            K6 k63 = (G2) k6;
            ((eb) abstractC0092h6).getClass();
            String str2 = eb.n[abstractC0092h6.g.b()];
            abstractC0092h6.t(k63.c(), "rule " + str2 + " " + k63.getMessage(), k63);
        } else {
            PrintStream printStream = System.err;
            StringBuilder a4 = A.a("unknown recognition error type: ");
            a4.append(k6.getClass().getName());
            printStream.println(a4.toString());
            abstractC0092h6.t(k6.c(), k6.getMessage(), k6);
        }
    }

    public final void i() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    protected final void j(AbstractC0092h6 abstractC0092h6) {
        if (this.a) {
            return;
        }
        this.a = true;
        G8 q = abstractC0092h6.q();
        String e = e(q);
        C0293y4 d = d(abstractC0092h6);
        abstractC0092h6.t(q, "extraneous input " + e + " expecting " + d.l(eb.o), null);
    }

    protected final G8 k(AbstractC0092h6 abstractC0092h6) {
        if (d(abstractC0092h6).d(abstractC0092h6.e.e(2))) {
            j(abstractC0092h6);
            abstractC0092h6.l();
            G8 q = abstractC0092h6.q();
            i();
            return q;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.l>, java.util.ArrayList] */
    public final void l(AbstractC0092h6 abstractC0092h6) {
        AbstractC0133l abstractC0133l = (AbstractC0133l) ((C0104i6) abstractC0092h6.b).a.a.get(abstractC0092h6.i());
        if (this.a) {
            return;
        }
        int e = abstractC0092h6.e.e(1);
        C0025c c0025c = eb.q;
        C0293y4 e2 = c0025c.e(abstractC0133l);
        if (e2.d(e)) {
            this.d = null;
            this.e = -1;
        } else if (e2.d(-2)) {
            if (this.d == null) {
                this.d = abstractC0092h6.g;
                this.e = abstractC0092h6.i();
            }
        } else {
            int c = abstractC0133l.c();
            if (c != 3 && c != 4 && c != 5) {
                switch (c) {
                    case 9:
                    case 11:
                        j(abstractC0092h6);
                        C0293y4 c2 = c0025c.c(abstractC0092h6.i(), abstractC0092h6.g);
                        C0293y4 c3 = c(abstractC0092h6);
                        C0293y4 c0293y4 = new C0293y4(new int[0]);
                        c0293y4.c(c2);
                        c0293y4.c(c3);
                        a(abstractC0092h6, c0293y4);
                        return;
                    case 10:
                        break;
                    default:
                        return;
                }
            }
            if (k(abstractC0092h6) == null) {
                throw new C0221s4(abstractC0092h6);
            }
        }
    }
}
