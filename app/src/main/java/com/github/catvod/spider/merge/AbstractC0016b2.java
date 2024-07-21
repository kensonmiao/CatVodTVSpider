package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.b2 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0016b2 extends AbstractC0255v2 {
    protected final int a;
    protected final int b;

    public AbstractC0016b2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        E1 g0 = e12.g0();
        if (g0 != null && !(g0 instanceof C0290y1)) {
            int b = b(e12);
            int i = this.a;
            if (i == 0) {
                return b == this.b;
            }
            int i2 = b - this.b;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    protected abstract int b(E1 e1);

    protected abstract String c();

    public String toString() {
        return this.a == 0 ? String.format(":%s(%d)", c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(this.a)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
