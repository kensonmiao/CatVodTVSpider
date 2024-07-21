package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.List;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class E0 extends F0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public E0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public E0(AbstractC0255v2... abstractC0255v2Arr) {
        List asList = Arrays.asList(abstractC0255v2Arr);
        if (this.b > 1) {
            this.a.add(new D0(asList));
        } else {
            this.a.addAll(asList);
        }
        b();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        for (int i = 0; i < this.b; i++) {
            if (this.a.get(i).a(e1, e12)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0308z7.e(this.a, ", ");
    }
}
