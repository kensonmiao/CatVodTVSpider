package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class L4 extends M6<Integer, O4> implements J8 {
    public InterfaceC0098i0 d;
    protected W5<J8, InterfaceC0098i0> e;
    public G8 g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    protected H8<?> f = J0.a;
    public int h = -1;
    public final C0269w4 n = new C0269w4();
    public int o = 0;

    public L4(InterfaceC0098i0 interfaceC0098i0) {
        this.d = interfaceC0098i0;
        this.e = new W5<>(this, interfaceC0098i0);
    }

    @Override // com.github.catvod.spider.merge.J8
    public final int a() {
        return ((O4) this.b).g();
    }

    @Override // com.github.catvod.spider.merge.J8
    public final InterfaceC0098i0 b() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.github.catvod.spider.merge.J0, com.github.catvod.spider.merge.H8<?>] */
    @Override // com.github.catvod.spider.merge.J8
    public final G8 c() {
        int i;
        InterfaceC0098i0 interfaceC0098i0 = this.d;
        if (interfaceC0098i0 != null) {
            interfaceC0098i0.f();
            while (true) {
                try {
                    if (this.k) {
                        l();
                        break;
                    }
                    this.g = null;
                    this.l = 0;
                    this.h = this.d.g();
                    this.j = ((O4) this.b).g();
                    this.i = ((O4) this.b).h();
                    while (true) {
                        this.m = 0;
                        try {
                            i = ((O4) this.b).i(this.d, this.o);
                        } catch (X4 e) {
                            m(e);
                            if (this.d.e(1) != -1) {
                                ((O4) this.b).e(this.d);
                            }
                            i = -3;
                        }
                        if (this.d.e(1) == -1) {
                            this.k = true;
                        }
                        if (this.m == 0) {
                            this.m = i;
                        }
                        int i2 = this.m;
                        if (i2 == -3) {
                            break;
                        } else if (i2 != -2) {
                            if (this.g == null) {
                                this.g = this.f.b(this.e, i2, null, this.l, this.h, this.d.g() - 1, this.i, this.j);
                            }
                        }
                    }
                } finally {
                    this.d.a();
                }
            }
            return this.g;
        }
        throw new IllegalStateException("nextToken requires a non-null input stream.");
    }

    @Override // com.github.catvod.spider.merge.J8
    public final int d() {
        return ((O4) this.b).h();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.github.catvod.spider.merge.H8<?>, com.github.catvod.spider.merge.H8<? extends com.github.catvod.spider.merge.G8> */
    @Override // com.github.catvod.spider.merge.J8
    public final H8<? extends G8> e() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.J0, com.github.catvod.spider.merge.H8<?>] */
    public final G8 l() {
        int g = ((O4) this.b).g();
        G8 b = this.f.b(this.e, -1, null, 0, this.d.g(), this.d.g() - 1, ((O4) this.b).h(), g);
        this.g = b;
        return b;
    }

    public final void m(X4 x4) {
        char[] charArray;
        InterfaceC0098i0 interfaceC0098i0 = this.d;
        String j = interfaceC0098i0.j(C0281x4.b(this.h, interfaceC0098i0.g()));
        StringBuilder a = A.a("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : j.toCharArray()) {
            String valueOf = String.valueOf(c);
            if (c == 65535) {
                valueOf = "<EOF>";
            } else if (c == '\r') {
                valueOf = "\\r";
            } else if (c == '\t') {
                valueOf = "\\t";
            } else if (c == '\n') {
                valueOf = "\\n";
            }
            sb.append(valueOf);
        }
        a.append(sb.toString());
        a.append("'");
        ((C6) g()).a(this, null, this.i, this.j, a.toString(), x4);
    }
}
