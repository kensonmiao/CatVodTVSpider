package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.n2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0160n2 extends AbstractC0016b2 {
    public C0160n2(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0016b2
    protected final int b(E1 e1) {
        if (e1.g0() == null) {
            return 0;
        }
        return e1.g0().R().size() - e1.U();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0016b2
    protected final String c() {
        return "nth-last-child";
    }
}
