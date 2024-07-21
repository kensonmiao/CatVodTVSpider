package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

@Deprecated
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class J5 extends AbstractC0074g0 {
    private final EnumSet<I5> b;

    public J5(I5... i5Arr) {
        this.b = EnumSet.copyOf((Collection) (i5Arr.length > 0 ? Arrays.asList(i5Arr) : Collections.singletonList(I5.semiColonRequired)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r8.charAt(r3) != ';') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        r0 = 1;
     */
    @Override // com.github.catvod.spider.merge.AbstractC0074g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.CharSequence r8, int r9, java.io.Writer r10) {
        /*
            r7 = this;
            int r0 = r8.length()
            char r1 = r8.charAt(r9)
            r2 = 0
            r3 = 38
            if (r1 != r3) goto Ldc
            int r1 = r0 + (-2)
            if (r9 >= r1) goto Ldc
            int r1 = r9 + 1
            char r1 = r8.charAt(r1)
            r3 = 35
            if (r1 != r3) goto Ldc
            int r9 = r9 + 2
            char r1 = r8.charAt(r9)
            r3 = 120(0x78, float:1.68E-43)
            r4 = 1
            if (r1 == r3) goto L2d
            r3 = 88
            if (r1 != r3) goto L2b
            goto L2d
        L2b:
            r1 = 0
            goto L33
        L2d:
            int r9 = r9 + 1
            if (r9 != r0) goto L32
            return r2
        L32:
            r1 = 1
        L33:
            r3 = r9
        L34:
            if (r3 >= r0) goto L69
            char r5 = r8.charAt(r3)
            r6 = 48
            if (r5 < r6) goto L46
            char r5 = r8.charAt(r3)
            r6 = 57
            if (r5 <= r6) goto L66
        L46:
            char r5 = r8.charAt(r3)
            r6 = 97
            if (r5 < r6) goto L56
            char r5 = r8.charAt(r3)
            r6 = 102(0x66, float:1.43E-43)
            if (r5 <= r6) goto L66
        L56:
            char r5 = r8.charAt(r3)
            r6 = 65
            if (r5 < r6) goto L69
            char r5 = r8.charAt(r3)
            r6 = 70
            if (r5 > r6) goto L69
        L66:
            int r3 = r3 + 1
            goto L34
        L69:
            if (r3 == r0) goto L75
            char r0 = r8.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L75
            r0 = 1
            goto L76
        L75:
            r0 = 0
        L76:
            if (r0 != 0) goto La4
            com.github.catvod.spider.merge.I5 r5 = com.github.catvod.spider.merge.I5.semiColonRequired
            java.util.EnumSet<com.github.catvod.spider.merge.I5> r6 = r7.b
            if (r6 == 0) goto L86
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L86
            r5 = 1
            goto L87
        L86:
            r5 = 0
        L87:
            if (r5 == 0) goto L8a
            return r2
        L8a:
            com.github.catvod.spider.merge.I5 r5 = com.github.catvod.spider.merge.I5.errorIfNoSemiColon
            java.util.EnumSet<com.github.catvod.spider.merge.I5> r6 = r7.b
            if (r6 == 0) goto L98
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L98
            r5 = 1
            goto L99
        L98:
            r5 = 0
        L99:
            if (r5 != 0) goto L9c
            goto La4
        L9c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Semi-colon required at end of numeric entity"
            r8.<init>(r9)
            throw r8
        La4:
            if (r1 == 0) goto Lb5
            java.lang.CharSequence r8 = r8.subSequence(r9, r3)     // Catch: java.lang.NumberFormatException -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> Ldc
            r5 = 16
            int r8 = java.lang.Integer.parseInt(r8, r5)     // Catch: java.lang.NumberFormatException -> Ldc
            goto Lc3
        Lb5:
            java.lang.CharSequence r8 = r8.subSequence(r9, r3)     // Catch: java.lang.NumberFormatException -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> Ldc
            r5 = 10
            int r8 = java.lang.Integer.parseInt(r8, r5)     // Catch: java.lang.NumberFormatException -> Ldc
        Lc3:
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r8 <= r5) goto Ld3
            char[] r8 = java.lang.Character.toChars(r8)
            char r2 = r8[r2]
            r10.write(r2)
            char r8 = r8[r4]
        Ld3:
            r10.write(r8)
            int r3 = r3 + 2
            int r3 = r3 - r9
            int r3 = r3 + r1
            int r3 = r3 + r0
            return r3
        Ldc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.J5.a(java.lang.CharSequence, int, java.io.Writer):int");
    }
}
