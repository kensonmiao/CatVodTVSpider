package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.o2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0172o2 extends AbstractC0016b2 {
    public C0172o2(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0016b2
    protected final int b(E1 e1) {
        int i = 0;
        if (e1.g0() == null) {
            return 0;
        }
        F1 R = e1.g0().R();
        for (int U = e1.U(); U < R.size(); U++) {
            if (R.get(U).m0().equals(e1.m0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0016b2
    protected final String c() {
        return "nth-last-of-type";
    }
}
