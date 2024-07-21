package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class D0 extends F0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D0(Collection<AbstractC0255v2> collection) {
        this.a.addAll(collection);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D0(AbstractC0255v2... abstractC0255v2Arr) {
        this(Arrays.asList(abstractC0255v2Arr));
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(e1, e12)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C0308z7.e(this.a, "");
    }
}
