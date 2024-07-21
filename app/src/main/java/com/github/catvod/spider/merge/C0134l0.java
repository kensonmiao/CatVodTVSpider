package com.github.catvod.spider.merge;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.l0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0134l0 implements L {
    @Override // com.github.catvod.spider.merge.L
    public final String a() {
        return "child";
    }

    @Override // com.github.catvod.spider.merge.L
    public final Aa b(F1 f1) {
        F1 f12 = new F1();
        Iterator<E1> it = f1.iterator();
        while (it.hasNext()) {
            f12.addAll(it.next().R());
        }
        return new Aa(f12);
    }
}
