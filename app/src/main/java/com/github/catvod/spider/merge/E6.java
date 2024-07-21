package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class E6 {
    private EnumC0234t5 a;
    private int b;
    private C0215ra c;
    private int d = -1;
    private C0038d0 e;

    public final C0038d0 a() {
        return this.e;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final void c(int i) {
        this.d = i;
    }

    public final void d(C0038d0 c0038d0) {
        this.e = c0038d0;
    }

    public final void e(EnumC0234t5 enumC0234t5) {
        this.a = enumC0234t5;
    }

    public final void f(C0215ra c0215ra) {
        this.c = c0215ra;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(C0300z.c(this.b));
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
