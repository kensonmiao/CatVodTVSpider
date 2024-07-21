package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class B0 implements C5 {
    private final E1 a;
    private final F1 b;
    private final AbstractC0255v2 c;

    public B0(E1 e1, F1 f1, AbstractC0255v2 abstractC0255v2) {
        this.a = e1;
        this.b = f1;
        this.c = abstractC0255v2;
    }

    @Override // com.github.catvod.spider.merge.C5
    public final void a(A5 a5, int i) {
    }

    @Override // com.github.catvod.spider.merge.C5
    public final void b(A5 a5, int i) {
        if (a5 instanceof E1) {
            E1 e1 = (E1) a5;
            if (this.c.a(this.a, e1)) {
                this.b.add(e1);
            }
        }
    }
}
