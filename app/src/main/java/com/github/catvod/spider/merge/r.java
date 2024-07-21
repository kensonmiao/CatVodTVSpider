package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class r extends AbstractC0060ea {
    public final int b;
    public final int c;

    public r(AbstractC0133l abstractC0133l, int i, int i2) {
        super(abstractC0133l);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder a = A.a("action_");
        a.append(this.b);
        a.append(":");
        a.append(this.c);
        return a.toString();
    }
}
