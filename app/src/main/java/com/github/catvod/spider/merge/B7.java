package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class B7 extends G7 {
    public static int r(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r2 == '+') goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer s(java.lang.String r9) {
        /*
            int r0 = r9.length()
            if (r0 != 0) goto L7
            goto L54
        L7:
            r1 = 0
            char r2 = r9.charAt(r1)
            r3 = 48
            r4 = 1
            if (r2 >= r3) goto L13
            r3 = -1
            goto L18
        L13:
            if (r2 != r3) goto L17
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r3 >= 0) goto L2d
            if (r0 != r4) goto L20
            goto L54
        L20:
            r3 = 45
            if (r2 != r3) goto L28
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            goto L30
        L28:
            r3 = 43
            if (r2 != r3) goto L54
            goto L2e
        L2d:
            r4 = 0
        L2e:
            r2 = r4
            r4 = 0
        L30:
            r3 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L36:
            if (r2 >= r0) goto L5a
            char r7 = r9.charAt(r2)
            r8 = 10
            int r7 = java.lang.Character.digit(r7, r8)
            if (r7 >= 0) goto L45
            goto L54
        L45:
            if (r1 >= r6) goto L4e
            if (r6 != r3) goto L54
            int r6 = r5 / 10
            if (r1 >= r6) goto L4e
            goto L54
        L4e:
            int r1 = r1 * 10
            int r8 = r5 + r7
            if (r1 >= r8) goto L56
        L54:
            r9 = 0
            goto L66
        L56:
            int r1 = r1 - r7
            int r2 = r2 + 1
            goto L36
        L5a:
            if (r4 == 0) goto L61
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            goto L66
        L61:
            int r9 = -r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L66:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.B7.s(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r3 == '+') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Long t(java.lang.String r17) {
        /*
            r0 = r17
            int r1 = r17.length()
            if (r1 != 0) goto L9
            goto L63
        L9:
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 48
            r5 = 1
            if (r3 >= r4) goto L15
            r4 = -1
            goto L1a
        L15:
            if (r3 != r4) goto L19
            r4 = 0
            goto L1a
        L19:
            r4 = 1
        L1a:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= 0) goto L31
            if (r1 != r5) goto L24
            goto L63
        L24:
            r4 = 45
            if (r3 != r4) goto L2c
            r6 = -9223372036854775808
            r2 = 1
            goto L32
        L2c:
            r4 = 43
            if (r3 != r4) goto L63
            goto L32
        L31:
            r5 = 0
        L32:
            r3 = 0
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = r8
        L3a:
            if (r5 >= r1) goto L69
            char r12 = r0.charAt(r5)
            r13 = 10
            int r12 = java.lang.Character.digit(r12, r13)
            if (r12 >= 0) goto L49
            goto L63
        L49:
            int r14 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r14 >= 0) goto L59
            int r14 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r14 != 0) goto L63
            long r10 = (long) r13
            long r10 = r6 / r10
            int r14 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r14 >= 0) goto L59
            goto L63
        L59:
            long r13 = (long) r13
            long r3 = r3 * r13
            long r12 = (long) r12
            long r14 = r6 + r12
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 >= 0) goto L65
        L63:
            r0 = 0
            goto L75
        L65:
            long r3 = r3 - r12
            int r5 = r5 + 1
            goto L3a
        L69:
            if (r2 == 0) goto L70
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L75
        L70:
            long r0 = -r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.B7.t(java.lang.String):java.lang.Long");
    }
}
