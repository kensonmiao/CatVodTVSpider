package com.github.catvod.spider.merge;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.z5  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0306z5 implements B5 {
    @Override // com.github.catvod.spider.merge.B5
    public final String a() {
        return "node";
    }

    @Override // com.github.catvod.spider.merge.B5
    public final Aa b(C0009a7 c0009a7) {
        F1 f1 = new F1();
        Iterator<E1> it = c0009a7.a().iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            f1.addAll(next.R());
            String f0 = next.f0();
            if (A7.d(f0)) {
                E1 e1 = new E1("");
                e1.O(f0);
                f1.add(e1);
            }
        }
        return new Aa(f1);
    }
}
