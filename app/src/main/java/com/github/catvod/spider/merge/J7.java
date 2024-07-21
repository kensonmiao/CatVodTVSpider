package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class J7 extends O7 {
    public J7(AbstractC0255v2 abstractC0255v2) {
        this.a = abstractC0255v2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        E1 j0;
        return (e1 == e12 || (j0 = e12.j0()) == null || !this.a.a(e1, j0)) ? false : true;
    }

    public final String toString() {
        return String.format("%s + ", this.a);
    }
}
