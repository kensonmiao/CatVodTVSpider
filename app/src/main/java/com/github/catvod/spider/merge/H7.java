package com.github.catvod.spider.merge;

import java.util.Iterator;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class H7 extends O7 {
    public H7(AbstractC0255v2 abstractC0255v2) {
        this.a = abstractC0255v2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        Iterator<E1> it = e12.V().iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            if (next != e12 && this.a.a(e12, next)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
