package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.github.catvod.spider.merge.v6  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0259v6 implements L {
    @Override // com.github.catvod.spider.merge.L
    public final String a() {
        return "preceding-sibling";
    }

    @Override // com.github.catvod.spider.merge.L
    public final Aa b(F1 f1) {
        LinkedList linkedList = new LinkedList();
        Iterator<E1> it = f1.iterator();
        while (it.hasNext()) {
            F1 j = E.j(it.next());
            if (j != null) {
                linkedList.addAll(j);
            }
        }
        F1 f12 = new F1();
        f12.addAll(linkedList);
        return new Aa(f12);
    }
}
