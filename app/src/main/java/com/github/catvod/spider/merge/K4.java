package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class K4 extends A5 {
    Object f;

    private void J() {
        Object obj = this.f;
        if (obj instanceof K) {
            return;
        }
        K k = new K();
        this.f = k;
        if (obj != null) {
            k.t(t(), (String) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String I() {
        return c(t());
    }

    @Override // com.github.catvod.spider.merge.A5
    public String a(String str) {
        J();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.A5
    public A5 b(String str, String str2) {
        if ((this.f instanceof K) || !str.equals("#doctype")) {
            J();
            super.b(str, str2);
        } else {
            this.f = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.A5
    public String c(String str) {
        R0.p(str);
        return !(this.f instanceof K) ? str.equals(t()) ? (String) this.f : "" : super.c(str);
    }

    @Override // com.github.catvod.spider.merge.A5
    public final K d() {
        J();
        return (K) this.f;
    }

    @Override // com.github.catvod.spider.merge.A5
    public String e() {
        A5 a5 = this.c;
        return a5 != null ? a5.e() : "";
    }

    @Override // com.github.catvod.spider.merge.A5
    public int h() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.A5
    public final A5 k(A5 a5) {
        K4 k4 = (K4) super.k(a5);
        Object obj = this.f;
        if (obj instanceof K) {
            k4.f = ((K) obj).clone();
        }
        return k4;
    }

    @Override // com.github.catvod.spider.merge.A5
    protected final void l(String str) {
    }

    @Override // com.github.catvod.spider.merge.A5
    public A5 m() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.A5
    public final List<A5> n() {
        return A5.e;
    }

    @Override // com.github.catvod.spider.merge.A5
    protected final boolean p() {
        return this.f instanceof K;
    }
}
