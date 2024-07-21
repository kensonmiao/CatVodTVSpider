package com.github.catvod.spider.merge;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.q2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0196q2 extends AbstractC0255v2 {
    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        E1 g0 = e12.g0();
        if (g0 == null || (g0 instanceof C0290y1)) {
            return false;
        }
        Iterator<E1> it = g0.R().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m0().equals(e12.m0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return ":only-of-type";
    }
}
