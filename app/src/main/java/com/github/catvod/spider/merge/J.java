package com.github.catvod.spider.merge;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class J implements Iterator<H> {
    int a = 0;
    final /* synthetic */ K b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(K k) {
        this.b = k;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0009 */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext() {
        /*
            r4 = this;
        L0:
            int r0 = r4.a
            com.github.catvod.spider.merge.K r1 = r4.b
            int r1 = com.github.catvod.spider.merge.K.a(r1)
            r2 = 1
            if (r0 >= r1) goto L1f
            com.github.catvod.spider.merge.K r0 = r4.b
            java.lang.String[] r1 = r0.d
            int r3 = r4.a
            r1 = r1[r3]
            boolean r0 = com.github.catvod.spider.merge.K.b(r0, r1)
            if (r0 == 0) goto L1f
            int r0 = r4.a
            int r0 = r0 + r2
            r4.a = r0
            goto L0
        L1f:
            int r0 = r4.a
            com.github.catvod.spider.merge.K r1 = r4.b
            int r1 = com.github.catvod.spider.merge.K.a(r1)
            if (r0 >= r1) goto L2a
            goto L2b
        L2a:
            r2 = 0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.J.hasNext():boolean");
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final H next() {
        K k = this.b;
        String[] strArr = k.d;
        int i = this.a;
        H h = new H(strArr[i], k.e[i], k);
        this.a++;
        return h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        K k = this.b;
        int i = this.a - 1;
        this.a = i;
        k.v(i);
    }
}
