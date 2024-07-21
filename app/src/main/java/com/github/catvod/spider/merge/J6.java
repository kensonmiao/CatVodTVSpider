package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class J6 extends AbstractC0060ea {
    public final int b;
    public final int c;

    public J6(AbstractC0133l abstractC0133l, int i, int i2) {
        super(abstractC0133l);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final C0293y4 c() {
        return C0293y4.g(this.b, this.c);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final boolean d(int i, int i2) {
        return i >= this.b && i <= this.c;
    }

    public final String toString() {
        StringBuilder appendCodePoint = new StringBuilder("'").appendCodePoint(this.b);
        appendCodePoint.append("'..'");
        StringBuilder appendCodePoint2 = appendCodePoint.appendCodePoint(this.c);
        appendCodePoint2.append("'");
        return appendCodePoint2.toString();
    }
}
