package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class A3 implements L {
    @Override // com.github.catvod.spider.merge.L
    public final String a() {
        return "following";
    }

    @Override // com.github.catvod.spider.merge.L
    public final Aa b(F1 f1) {
        LinkedList linkedList = new LinkedList();
        Iterator<E1> it = f1.iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            Iterator<E1> it2 = next.h0().iterator();
            while (it2.hasNext()) {
                F1 a = E.a(it2.next());
                if (a != null) {
                    Iterator<E1> it3 = a.iterator();
                    while (it3.hasNext()) {
                        linkedList.addAll(it3.next().V());
                    }
                }
            }
            F1 a2 = E.a(next);
            if (a2 != null) {
                Iterator<E1> it4 = a2.iterator();
                while (it4.hasNext()) {
                    linkedList.addAll(it4.next().V());
                }
            }
        }
        return new Aa(new F1(linkedList));
    }
}
