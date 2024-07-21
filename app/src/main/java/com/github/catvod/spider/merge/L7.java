package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class L7 extends O7 {
    public L7(AbstractC0255v2 abstractC0255v2) {
        this.a = abstractC0255v2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        if (e1 == e12) {
            return false;
        }
        do {
            e12 = e12.g0();
            if (e12 == null) {
                break;
            } else if (this.a.a(e1, e12)) {
                return true;
            }
        } while (e12 != e1);
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.a);
    }
}
