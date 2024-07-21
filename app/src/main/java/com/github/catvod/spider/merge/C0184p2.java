package com.github.catvod.spider.merge;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.p2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0184p2 extends AbstractC0016b2 {
    public C0184p2(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0016b2
    protected final int b(E1 e1) {
        int i = 0;
        if (e1.g0() == null) {
            return 0;
        }
        Iterator<E1> it = e1.g0().R().iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            if (next.m0().equals(e1.m0())) {
                i++;
                continue;
            }
            if (next == e1) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0016b2
    protected final String c() {
        return "nth-of-type";
    }
}
