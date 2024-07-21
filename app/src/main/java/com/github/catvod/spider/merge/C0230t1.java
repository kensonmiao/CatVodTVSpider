package com.github.catvod.spider.merge;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.t1  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0230t1 implements L {
    @Override // com.github.catvod.spider.merge.L
    public final String a() {
        return "descendant";
    }

    @Override // com.github.catvod.spider.merge.L
    public final Aa b(F1 f1) {
        HashSet hashSet = new HashSet();
        F1 f12 = new F1();
        Iterator<E1> it = f1.iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            F1 V = next.V();
            V.remove(next);
            hashSet.addAll(V);
        }
        f12.addAll(hashSet);
        return new Aa(f12);
    }
}
