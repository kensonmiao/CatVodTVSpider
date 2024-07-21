package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.o7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0177o7 extends AbstractC0060ea {
    public final C0293y4 b;

    public C0177o7(AbstractC0133l abstractC0133l, C0293y4 c0293y4) {
        super(abstractC0133l);
        if (c0293y4 == null) {
            c0293y4 = new C0293y4(new int[0]);
            c0293y4.a(0);
        }
        this.b = c0293y4;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public final C0293y4 c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0060ea
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}
