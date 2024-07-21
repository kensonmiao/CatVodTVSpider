package com.github.catvod.spider.merge;

import java.util.IdentityHashMap;

/* renamed from: com.github.catvod.spider.merge.x6 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0283x6 {
    public static final I1 b = new I1();
    public final int a;

    public AbstractC0283x6(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.l>, java.util.ArrayList] */
    public static AbstractC0283x6 a(C0025c c0025c, S6 s6) {
        if (s6 == null) {
            s6 = S6.c;
        }
        S6 s62 = s6.a;
        return (s62 == null || s6 == S6.c) ? b : C0189p7.i(a(c0025c, s62), ((W6) ((AbstractC0133l) c0025c.a.get(s6.b)).d(0)).c.b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.x6, com.github.catvod.spider.merge.x6>] */
    public static AbstractC0283x6 b(AbstractC0283x6 abstractC0283x6, C0295y6 c0295y6, IdentityHashMap<AbstractC0283x6, AbstractC0283x6> identityHashMap) {
        if (abstractC0283x6.f()) {
            return abstractC0283x6;
        }
        AbstractC0283x6 abstractC0283x62 = identityHashMap.get(abstractC0283x6);
        if (abstractC0283x62 != null) {
            return abstractC0283x62;
        }
        AbstractC0283x6 abstractC0283x63 = (AbstractC0283x6) c0295y6.a.get(abstractC0283x6);
        if (abstractC0283x63 != null) {
            identityHashMap.put(abstractC0283x6, abstractC0283x63);
            return abstractC0283x63;
        }
        AbstractC0283x6[] abstractC0283x6Arr = new AbstractC0283x6[abstractC0283x6.h()];
        boolean z = false;
        for (int i = 0; i < abstractC0283x6Arr.length; i++) {
            AbstractC0283x6 b2 = b(abstractC0283x6.c(i), c0295y6, identityHashMap);
            if (z || b2 != abstractC0283x6.c(i)) {
                if (!z) {
                    abstractC0283x6Arr = new AbstractC0283x6[abstractC0283x6.h()];
                    for (int i2 = 0; i2 < abstractC0283x6.h(); i2++) {
                        abstractC0283x6Arr[i2] = abstractC0283x6.c(i2);
                    }
                    z = true;
                }
                abstractC0283x6Arr[i] = b2;
            }
        }
        if (!z) {
            c0295y6.a(abstractC0283x6);
            identityHashMap.put(abstractC0283x6, abstractC0283x6);
            return abstractC0283x6;
        }
        AbstractC0283x6 i3 = abstractC0283x6Arr.length == 0 ? b : abstractC0283x6Arr.length == 1 ? C0189p7.i(abstractC0283x6Arr[0], abstractC0283x6.d(0)) : new D(abstractC0283x6Arr, ((D) abstractC0283x6).d);
        c0295y6.a(i3);
        identityHashMap.put(i3, i3);
        identityHashMap.put(abstractC0283x6, i3);
        return i3;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:260:0x0114 */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0042, code lost:
        if (r1 == r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x00da, code lost:
        if (r19 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00dc, code lost:
        r19.b(r0, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0104, code lost:
        if (r19 != 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0086  */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.github.catvod.spider.merge.D] */
    /* JADX WARN: Type inference failed for: r10v15, types: [com.github.catvod.spider.merge.D] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.github.catvod.spider.merge.A1, com.github.catvod.spider.merge.A1<com.github.catvod.spider.merge.x6, com.github.catvod.spider.merge.x6, com.github.catvod.spider.merge.x6>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.AbstractC0283x6 g(com.github.catvod.spider.merge.AbstractC0283x6 r16, com.github.catvod.spider.merge.AbstractC0283x6 r17, boolean r18, com.github.catvod.spider.merge.A1<com.github.catvod.spider.merge.AbstractC0283x6, com.github.catvod.spider.merge.AbstractC0283x6, com.github.catvod.spider.merge.AbstractC0283x6> r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            if (r0 == r1) goto L272
            boolean r4 = r16.equals(r17)
            if (r4 == 0) goto L12
            goto L272
        L12:
            boolean r4 = r0 instanceof com.github.catvod.spider.merge.C0189p7
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L108
            boolean r8 = r1 instanceof com.github.catvod.spider.merge.C0189p7
            if (r8 == 0) goto L108
            com.github.catvod.spider.merge.p7 r0 = (com.github.catvod.spider.merge.C0189p7) r0
            com.github.catvod.spider.merge.p7 r1 = (com.github.catvod.spider.merge.C0189p7) r1
            if (r3 == 0) goto L39
            java.lang.Object r4 = r3.a(r0, r1)
            com.github.catvod.spider.merge.x6 r4 = (com.github.catvod.spider.merge.AbstractC0283x6) r4
            if (r4 == 0) goto L30
        L2d:
            r0 = r4
            goto L107
        L30:
            java.lang.Object r4 = r3.a(r1, r0)
            com.github.catvod.spider.merge.x6 r4 = (com.github.catvod.spider.merge.AbstractC0283x6) r4
            if (r4 == 0) goto L39
            goto L2d
        L39:
            r4 = 0
            r8 = 2
            com.github.catvod.spider.merge.I1 r9 = com.github.catvod.spider.merge.AbstractC0283x6.b
            if (r2 == 0) goto L45
            if (r0 != r9) goto L42
            goto L7c
        L42:
            if (r1 != r9) goto L7b
            goto L7c
        L45:
            if (r0 != r9) goto L4a
            if (r1 != r9) goto L4a
            goto L7c
        L4a:
            if (r0 != r9) goto L63
            int[] r9 = new int[r8]
            int r10 = r1.d
            r9[r6] = r10
            r9[r7] = r5
            com.github.catvod.spider.merge.x6[] r5 = new com.github.catvod.spider.merge.AbstractC0283x6[r8]
            com.github.catvod.spider.merge.x6 r10 = r1.c
            r5[r6] = r10
            r5[r7] = r4
            com.github.catvod.spider.merge.D r10 = new com.github.catvod.spider.merge.D
            r10.<init>(r5, r9)
        L61:
            r9 = r10
            goto L7c
        L63:
            if (r1 != r9) goto L7b
            int[] r9 = new int[r8]
            int r10 = r0.d
            r9[r6] = r10
            r9[r7] = r5
            com.github.catvod.spider.merge.x6[] r5 = new com.github.catvod.spider.merge.AbstractC0283x6[r8]
            com.github.catvod.spider.merge.x6 r10 = r0.c
            r5[r6] = r10
            r5[r7] = r4
            com.github.catvod.spider.merge.D r10 = new com.github.catvod.spider.merge.D
            r10.<init>(r5, r9)
            goto L61
        L7b:
            r9 = r4
        L7c:
            if (r9 == 0) goto L86
            if (r3 == 0) goto L83
            r3.b(r0, r1, r9)
        L83:
            r0 = r9
            goto L107
        L86:
            int r5 = r0.d
            int r9 = r1.d
            if (r5 != r9) goto Lad
            com.github.catvod.spider.merge.x6 r4 = r0.c
            com.github.catvod.spider.merge.x6 r5 = r1.c
            com.github.catvod.spider.merge.x6 r2 = g(r4, r5, r2, r3)
            com.github.catvod.spider.merge.x6 r4 = r0.c
            if (r2 != r4) goto L9a
            goto L107
        L9a:
            com.github.catvod.spider.merge.x6 r4 = r1.c
            if (r2 != r4) goto La0
            r0 = r1
            goto L107
        La0:
            int r4 = r0.d
            com.github.catvod.spider.merge.p7 r2 = com.github.catvod.spider.merge.C0189p7.i(r2, r4)
            if (r3 == 0) goto Lab
            r3.b(r0, r1, r2)
        Lab:
            r0 = r2
            goto L107
        Lad:
            if (r0 == r1) goto Lbb
            com.github.catvod.spider.merge.x6 r2 = r0.c
            if (r2 == 0) goto Lbd
            com.github.catvod.spider.merge.x6 r5 = r1.c
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto Lbd
        Lbb:
            com.github.catvod.spider.merge.x6 r4 = r0.c
        Lbd:
            int[] r2 = new int[r8]
            if (r4 == 0) goto Le1
            int r5 = r0.d
            r2[r6] = r5
            int r9 = r1.d
            r2[r7] = r9
            if (r5 <= r9) goto Lcf
            r2[r6] = r9
            r2[r7] = r5
        Lcf:
            com.github.catvod.spider.merge.x6[] r5 = new com.github.catvod.spider.merge.AbstractC0283x6[r8]
            r5[r6] = r4
            r5[r7] = r4
            com.github.catvod.spider.merge.D r4 = new com.github.catvod.spider.merge.D
            r4.<init>(r5, r2)
            if (r3 == 0) goto L2d
        Ldc:
            r3.b(r0, r1, r4)
            goto L2d
        Le1:
            int r4 = r0.d
            r2[r6] = r4
            int r5 = r1.d
            r2[r7] = r5
            com.github.catvod.spider.merge.x6[] r9 = new com.github.catvod.spider.merge.AbstractC0283x6[r8]
            com.github.catvod.spider.merge.x6 r10 = r0.c
            r9[r6] = r10
            com.github.catvod.spider.merge.x6 r11 = r1.c
            r9[r7] = r11
            if (r4 <= r5) goto Lff
            r2[r6] = r5
            r2[r7] = r4
            com.github.catvod.spider.merge.x6[] r9 = new com.github.catvod.spider.merge.AbstractC0283x6[r8]
            r9[r6] = r11
            r9[r7] = r10
        Lff:
            com.github.catvod.spider.merge.D r4 = new com.github.catvod.spider.merge.D
            r4.<init>(r9, r2)
            if (r3 == 0) goto L2d
            goto Ldc
        L107:
            return r0
        L108:
            if (r2 == 0) goto L114
            boolean r8 = r0 instanceof com.github.catvod.spider.merge.I1
            if (r8 == 0) goto L10f
            return r0
        L10f:
            boolean r8 = r1 instanceof com.github.catvod.spider.merge.I1
            if (r8 == 0) goto L114
            return r1
        L114:
            if (r4 == 0) goto L12a
            com.github.catvod.spider.merge.D r4 = new com.github.catvod.spider.merge.D
            com.github.catvod.spider.merge.p7 r0 = (com.github.catvod.spider.merge.C0189p7) r0
            com.github.catvod.spider.merge.x6[] r8 = new com.github.catvod.spider.merge.AbstractC0283x6[r7]
            com.github.catvod.spider.merge.x6 r9 = r0.c
            r8[r6] = r9
            int[] r9 = new int[r7]
            int r0 = r0.d
            r9[r6] = r0
            r4.<init>(r8, r9)
            r0 = r4
        L12a:
            boolean r4 = r1 instanceof com.github.catvod.spider.merge.C0189p7
            if (r4 == 0) goto L142
            com.github.catvod.spider.merge.D r4 = new com.github.catvod.spider.merge.D
            com.github.catvod.spider.merge.p7 r1 = (com.github.catvod.spider.merge.C0189p7) r1
            com.github.catvod.spider.merge.x6[] r8 = new com.github.catvod.spider.merge.AbstractC0283x6[r7]
            com.github.catvod.spider.merge.x6 r9 = r1.c
            r8[r6] = r9
            int[] r9 = new int[r7]
            int r1 = r1.d
            r9[r6] = r1
            r4.<init>(r8, r9)
            r1 = r4
        L142:
            com.github.catvod.spider.merge.D r0 = (com.github.catvod.spider.merge.D) r0
            com.github.catvod.spider.merge.D r1 = (com.github.catvod.spider.merge.D) r1
            if (r3 == 0) goto L15c
            java.lang.Object r4 = r3.a(r0, r1)
            com.github.catvod.spider.merge.x6 r4 = (com.github.catvod.spider.merge.AbstractC0283x6) r4
            if (r4 == 0) goto L153
        L150:
            r0 = r4
            goto L272
        L153:
            java.lang.Object r4 = r3.a(r1, r0)
            com.github.catvod.spider.merge.x6 r4 = (com.github.catvod.spider.merge.AbstractC0283x6) r4
            if (r4 == 0) goto L15c
            goto L150
        L15c:
            int[] r4 = r0.d
            int r8 = r4.length
            int[] r9 = r1.d
            int r10 = r9.length
            int r8 = r8 + r10
            int[] r8 = new int[r8]
            int r4 = r4.length
            int r9 = r9.length
            int r4 = r4 + r9
            com.github.catvod.spider.merge.x6[] r9 = new com.github.catvod.spider.merge.AbstractC0283x6[r4]
            r10 = 0
            r11 = 0
            r12 = 0
        L16d:
            int[] r13 = r0.d
            int r14 = r13.length
            if (r10 >= r14) goto L1d7
            int[] r14 = r1.d
            int r15 = r14.length
            if (r11 >= r15) goto L1d7
            com.github.catvod.spider.merge.x6[] r15 = r0.c
            r15 = r15[r10]
            com.github.catvod.spider.merge.x6[] r6 = r1.c
            r6 = r6[r11]
            r7 = r13[r10]
            r5 = r14[r11]
            if (r7 != r5) goto L1b5
            r5 = r13[r10]
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r7) goto L192
            if (r15 != 0) goto L192
            if (r6 != 0) goto L192
            r13 = 1
            goto L193
        L192:
            r13 = 0
        L193:
            if (r15 == 0) goto L19f
            if (r6 == 0) goto L19f
            boolean r14 = r15.equals(r6)
            if (r14 == 0) goto L19f
            r14 = 1
            goto L1a0
        L19f:
            r14 = 0
        L1a0:
            if (r13 != 0) goto L1ae
            if (r14 == 0) goto L1a5
            goto L1ae
        L1a5:
            com.github.catvod.spider.merge.x6 r6 = g(r15, r6, r2, r3)
            r9[r12] = r6
            r8[r12] = r5
            goto L1b2
        L1ae:
            r9[r12] = r15
            r8[r12] = r5
        L1b2:
            int r10 = r10 + 1
            goto L1cd
        L1b5:
            r7 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13[r10]
            r7 = r14[r11]
            if (r5 >= r7) goto L1c7
            r9[r12] = r15
            r5 = r13[r10]
            r8[r12] = r5
            int r10 = r10 + 1
            goto L1cf
        L1c7:
            r9[r12] = r6
            r5 = r14[r11]
            r8[r12] = r5
        L1cd:
            int r11 = r11 + 1
        L1cf:
            int r12 = r12 + 1
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = 1
            goto L16d
        L1d7:
            int r2 = r13.length
            if (r10 >= r2) goto L1ee
        L1da:
            int[] r2 = r0.d
            int r5 = r2.length
            if (r10 >= r5) goto L202
            com.github.catvod.spider.merge.x6[] r5 = r0.c
            r5 = r5[r10]
            r9[r12] = r5
            r2 = r2[r10]
            r8[r12] = r2
            int r12 = r12 + 1
            int r10 = r10 + 1
            goto L1da
        L1ee:
            int[] r2 = r1.d
            int r5 = r2.length
            if (r11 >= r5) goto L202
            com.github.catvod.spider.merge.x6[] r5 = r1.c
            r5 = r5[r11]
            r9[r12] = r5
            r2 = r2[r11]
            r8[r12] = r2
            int r12 = r12 + 1
            int r11 = r11 + 1
            goto L1ee
        L202:
            if (r12 >= r4) goto L224
            r2 = 1
            if (r12 != r2) goto L217
            r2 = 0
            r4 = r9[r2]
            r2 = r8[r2]
            com.github.catvod.spider.merge.p7 r2 = com.github.catvod.spider.merge.C0189p7.i(r4, r2)
            if (r3 == 0) goto L215
            r3.b(r0, r1, r2)
        L215:
            r0 = r2
            goto L272
        L217:
            r2 = 0
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r9, r12)
            r9 = r4
            com.github.catvod.spider.merge.x6[] r9 = (com.github.catvod.spider.merge.AbstractC0283x6[]) r9
            int[] r8 = java.util.Arrays.copyOf(r8, r12)
            goto L225
        L224:
            r2 = 0
        L225:
            com.github.catvod.spider.merge.D r4 = new com.github.catvod.spider.merge.D
            r4.<init>(r9, r8)
            boolean r5 = r4.equals(r0)
            if (r5 == 0) goto L236
            if (r3 == 0) goto L272
            r3.b(r0, r1, r0)
            goto L272
        L236:
            boolean r5 = r4.equals(r1)
            if (r5 == 0) goto L243
            if (r3 == 0) goto L241
            r3.b(r0, r1, r1)
        L241:
            r0 = r1
            goto L272
        L243:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6 = 0
        L249:
            int r7 = r9.length
            if (r6 >= r7) goto L25a
            r7 = r9[r6]
            boolean r8 = r5.containsKey(r7)
            if (r8 != 0) goto L257
            r5.put(r7, r7)
        L257:
            int r6 = r6 + 1
            goto L249
        L25a:
            r6 = 0
        L25b:
            int r2 = r9.length
            if (r6 >= r2) goto L26b
            r2 = r9[r6]
            java.lang.Object r2 = r5.get(r2)
            com.github.catvod.spider.merge.x6 r2 = (com.github.catvod.spider.merge.AbstractC0283x6) r2
            r9[r6] = r2
            int r6 = r6 + 1
            goto L25b
        L26b:
            if (r3 == 0) goto L150
            r3.b(r0, r1, r4)
            goto L150
        L272:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AbstractC0283x6.g(com.github.catvod.spider.merge.x6, com.github.catvod.spider.merge.x6, boolean, com.github.catvod.spider.merge.A1):com.github.catvod.spider.merge.x6");
    }

    public abstract AbstractC0283x6 c(int i);

    public abstract int d(int i);

    public final boolean e() {
        return d(h() - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    public boolean f() {
        return this == b;
    }

    public abstract int h();

    public final int hashCode() {
        return this.a;
    }
}
