package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class G extends AbstractC0060ea {
    public final int b;

    public G(AbstractC0133l abstractC0133l, int i) {
        super(abstractC0133l);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final C0293y4 c() {
        int i = this.b;
        C0293y4 c0293y4 = new C0293y4(new int[0]);
        c0293y4.a(i);
        return c0293y4;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
