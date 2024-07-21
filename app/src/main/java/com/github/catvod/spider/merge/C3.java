package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C3 implements L {
    @Override // com.github.catvod.spider.merge.L
    public final String a() {
        return "following-sibling";
    }

    @Override // com.github.catvod.spider.merge.L
    public final Aa b(F1 f1) {
        LinkedList linkedList = new LinkedList();
        Iterator<E1> it = f1.iterator();
        while (it.hasNext()) {
            F1 a = E.a(it.next());
            if (a != null) {
                linkedList.addAll(a);
            }
        }
        F1 f12 = new F1();
        f12.addAll(linkedList);
        return new Aa(f12);
    }
}
