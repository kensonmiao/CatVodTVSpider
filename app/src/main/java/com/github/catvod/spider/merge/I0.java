package com.github.catvod.spider.merge;

import java.io.Serializable;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class I0 implements InterfaceC0275wa, Serializable {
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected W5<J8, InterfaceC0098i0> g;
    protected String h;
    protected int i = -1;
    protected int j;
    protected int k;

    public I0(W5<J8, InterfaceC0098i0> w5, int i, int i2, int i3, int i4) {
        this.e = -1;
        this.g = w5;
        this.c = i;
        this.f = i2;
        this.j = i3;
        this.k = i4;
        J8 j8 = w5.c;
        if (j8 != null) {
            this.d = j8.d();
            this.e = w5.c.a();
        }
    }

    @Override // com.github.catvod.spider.merge.G8
    public final int a() {
        return this.e;
    }

    @Override // com.github.catvod.spider.merge.G8
    public final J8 b() {
        return this.g.c;
    }

    @Override // com.github.catvod.spider.merge.G8
    public final String c() {
        int i;
        String str = this.h;
        if (str != null) {
            return str;
        }
        InterfaceC0098i0 interfaceC0098i0 = this.g.d;
        if (interfaceC0098i0 == null) {
            return null;
        }
        int size = interfaceC0098i0.size();
        int i2 = this.j;
        return (i2 >= size || (i = this.k) >= size) ? "<EOF>" : interfaceC0098i0.j(C0281x4.b(i2, i));
    }

    @Override // com.github.catvod.spider.merge.G8
    public final int d() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.G8
    public final int e() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0275wa
    public final void f(int i) {
        this.i = i;
    }

    @Override // com.github.catvod.spider.merge.G8
    public final int g() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.G8
    public final int h() {
        return this.i;
    }

    public final String toString() {
        String str;
        if (this.f > 0) {
            StringBuilder a = A.a(",channel=");
            a.append(this.f);
            str = a.toString();
        } else {
            str = "";
        }
        String c = c();
        String replace = c != null ? c.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String valueOf = String.valueOf(this.c);
        StringBuilder a2 = A.a("[@");
        a2.append(this.i);
        a2.append(",");
        a2.append(this.j);
        a2.append(":");
        a2.append(this.k);
        a2.append("='");
        a2.append(replace);
        a2.append("',<");
        a2.append(valueOf);
        a2.append(">");
        a2.append(str);
        a2.append(",");
        a2.append(this.d);
        a2.append(":");
        a2.append(this.e);
        a2.append("]");
        return a2.toString();
    }
}
