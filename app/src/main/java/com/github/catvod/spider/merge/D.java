package com.github.catvod.spider.merge;

import java.util.Arrays;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class D extends AbstractC0283x6 {
    public final AbstractC0283x6[] c;
    public final int[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D(com.github.catvod.spider.merge.AbstractC0283x6[] r6, int[] r7) {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            r3 = 0
        L4:
            if (r3 >= r0) goto Lf
            r4 = r6[r3]
            int r2 = com.github.catvod.spider.merge.D5.p(r2, r4)
            int r3 = r3 + 1
            goto L4
        Lf:
            int r0 = r7.length
        L10:
            if (r1 >= r0) goto L1b
            r3 = r7[r1]
            int r2 = com.github.catvod.spider.merge.D5.o(r2, r3)
            int r1 = r1 + 1
            goto L10
        L1b:
            int r0 = r6.length
            int r0 = r0 * 2
            int r0 = com.github.catvod.spider.merge.D5.k(r2, r0)
            r5.<init>(r0)
            r5.c = r6
            r5.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.<init>(com.github.catvod.spider.merge.x6[], int[]):void");
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public final AbstractC0283x6 c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof D) && this.a == obj.hashCode()) {
            D d = (D) obj;
            return Arrays.equals(this.d, d.d) && Arrays.equals(this.c, d.c);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0283x6
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        String str;
        if (f()) {
            return "[]";
        }
        StringBuilder a = A.a("[");
        for (int i = 0; i < this.d.length; i++) {
            if (i > 0) {
                a.append(", ");
            }
            int[] iArr = this.d;
            if (iArr[i] == Integer.MAX_VALUE) {
                str = "$";
            } else {
                a.append(iArr[i]);
                if (this.c[i] != null) {
                    a.append(' ');
                    str = this.c[i].toString();
                } else {
                    str = "null";
                }
            }
            a.append(str);
        }
        a.append("]");
        return a.toString();
    }
}
