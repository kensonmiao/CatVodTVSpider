package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class D8 extends E8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D8() {
        this.a = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.E8, com.github.catvod.spider.merge.F8
    public final /* bridge */ /* synthetic */ F8 g() {
        v();
        return this;
    }

    public final String toString() {
        StringBuilder a;
        String x;
        if (r() && this.j.size() > 0) {
            a = A.a("<");
            a.append(x());
            a.append(" ");
            x = this.j.toString();
        } else {
            a = A.a("<");
            x = x();
        }
        return C0158n0.a(a, x, ">");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.E8
    public final E8 v() {
        super.g();
        this.j = null;
        return this;
    }
}
