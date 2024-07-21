package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.github.catvod.spider.merge.t6  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0235t6 implements L {
    @Override // com.github.catvod.spider.merge.L
    public final String a() {
        return "preceding";
    }

    @Override // com.github.catvod.spider.merge.L
    public final Aa b(F1 f1) {
        F1 f12 = new F1();
        LinkedList linkedList = new LinkedList();
        Iterator<E1> it = f1.iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            Iterator<E1> it2 = next.h0().iterator();
            while (it2.hasNext()) {
                F1 j = E.j(it2.next());
                if (j != null) {
                    linkedList.addAll(j);
                }
            }
            F1 j2 = E.j(next);
            if (j2 != null) {
                linkedList.addAll(j2);
            }
        }
        f12.addAll(linkedList);
        return new Aa(f12);
    }
}
