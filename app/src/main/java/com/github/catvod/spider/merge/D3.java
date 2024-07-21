package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class D3 extends E1 {
    private final F1 l;

    public D3(C0022b8 c0022b8, K k) {
        super(c0022b8, null, k);
        this.l = new F1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.A5
    public final void D(A5 a5) {
        super.D(a5);
        this.l.remove(a5);
    }

    public final D3 r0(E1 e1) {
        this.l.add(e1);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // com.github.catvod.spider.merge.E1, com.github.catvod.spider.merge.A5
    /* renamed from: s0 */
    public final D3 j() {
        return (D3) super.j();
    }
}
