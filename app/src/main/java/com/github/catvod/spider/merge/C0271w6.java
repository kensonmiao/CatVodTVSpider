package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.w6  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0271w6 extends AbstractC0193q {
    public final int b;
    public final int c;
    public final boolean d;

    public C0271w6(AbstractC0133l abstractC0133l, int i, int i2, boolean z) {
        super(abstractC0133l);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder a = A.a("pred_");
        a.append(this.b);
        a.append(":");
        a.append(this.c);
        return a.toString();
    }
}
