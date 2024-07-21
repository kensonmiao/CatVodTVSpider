package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.p7 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0189p7 extends AbstractC0283x6 {
    public final AbstractC0283x6 c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0189p7(com.github.catvod.spider.merge.AbstractC0283x6 r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L11
            int r0 = com.github.catvod.spider.merge.D5.p(r0, r3)
            int r0 = com.github.catvod.spider.merge.D5.o(r0, r4)
            r1 = 2
            int r0 = com.github.catvod.spider.merge.D5.k(r0, r1)
            goto L16
        L11:
            r1 = 0
            int r0 = com.github.catvod.spider.merge.D5.k(r0, r1)
        L16:
            r2.<init>(r0)
            r2.c = r3
            r2.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0189p7.<init>(com.github.catvod.spider.merge.x6, int):void");
    }

    public static C0189p7 i(AbstractC0283x6 abstractC0283x6, int i) {
        return (i == Integer.MAX_VALUE && abstractC0283x6 == null) ? AbstractC0283x6.b : new C0189p7(abstractC0283x6, i);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public AbstractC0283x6 c(int i) {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public int d(int i) {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public boolean equals(Object obj) {
        AbstractC0283x6 abstractC0283x6;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0189p7) && this.a == obj.hashCode()) {
            C0189p7 c0189p7 = (C0189p7) obj;
            return this.d == c0189p7.d && (abstractC0283x6 = this.c) != null && abstractC0283x6.equals(c0189p7.c);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public int h() {
        return 1;
    }

    public String toString() {
        AbstractC0283x6 abstractC0283x6 = this.c;
        String obj = abstractC0283x6 != null ? abstractC0283x6.toString() : "";
        if (obj.length() == 0) {
            int i = this.d;
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(this.d) + " " + obj;
    }
}
