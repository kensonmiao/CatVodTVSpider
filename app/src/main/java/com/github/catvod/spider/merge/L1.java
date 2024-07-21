package com.github.catvod.spider.merge;

import java.io.StringReader;
import java.util.HashMap;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class L1 {
    private static final char[] a = {',', ';'};
    private static final HashMap<String, String> b = new HashMap<>();

    static {
        new C0278x1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(K1 k1, String str, int i) {
        int i2;
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        k1.c = new String[i];
        k1.d = new int[i];
        k1.e = new int[i];
        k1.f = new String[i];
        C0110j0 c0110j0 = new C0110j0(new StringReader(str), str.length());
        int i3 = 0;
        while (!c0110j0.t()) {
            String o = c0110j0.o('=');
            c0110j0.a();
            int parseInt = Integer.parseInt(c0110j0.p(a), 36);
            char s = c0110j0.s();
            c0110j0.a();
            if (s == ',') {
                i2 = Integer.parseInt(c0110j0.o(';'), 36);
                c0110j0.a();
            } else {
                i2 = -1;
            }
            int parseInt2 = Integer.parseInt(c0110j0.o('&'), 36);
            c0110j0.a();
            strArr = k1.c;
            strArr[i3] = o;
            iArr = k1.d;
            iArr[i3] = parseInt;
            iArr2 = k1.e;
            iArr2[parseInt2] = parseInt;
            strArr2 = k1.f;
            strArr2[parseInt2] = o;
            if (i2 != -1) {
                b.put(o, new String(new int[]{parseInt, i2}, 0, 2));
            }
            i3++;
        }
        if (!(i3 == i)) {
            throw new IllegalArgumentException("Unexpected count of entities loaded");
        }
    }

    private static void b(Appendable appendable, K1 k1, int i) {
        Appendable append;
        String j = k1.j(i);
        if ("".equals(j)) {
            append = appendable.append("&#x");
            j = Integer.toHexString(i);
        } else {
            append = appendable.append('&');
        }
        append.append(j).append(';');
    }

    public static int c(String str, int[] iArr) {
        String str2 = b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int i = K1.extended.i(str);
        if (i != -1) {
            iArr[0] = i;
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
        if (r12 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009f, code lost:
        if (r2.canEncode(r12) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a5, code lost:
        b(r15, r1, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.Appendable r15, java.lang.String r16, com.github.catvod.spider.merge.C0278x1 r17, boolean r18, boolean r19, boolean r20) {
        /*
            r0 = r15
            com.github.catvod.spider.merge.K1 r1 = r17.c()
            java.nio.charset.CharsetEncoder r2 = r17.b()
            r3 = r17
            int r4 = r3.f
            int r5 = r16.length()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L15:
            if (r7 >= r5) goto Laf
            r10 = r16
            int r11 = r10.codePointAt(r7)
            r12 = 1
            if (r19 == 0) goto L38
            boolean r13 = com.github.catvod.spider.merge.C0308z7.d(r11)
            if (r13 == 0) goto L36
            if (r20 == 0) goto L2a
            if (r8 == 0) goto La8
        L2a:
            if (r9 == 0) goto L2e
            goto La8
        L2e:
            r9 = 32
            r15.append(r9)
            r9 = 1
            goto La8
        L36:
            r8 = 1
            r9 = 0
        L38:
            r13 = 65536(0x10000, float:9.18355E-41)
            if (r11 >= r13) goto L92
            char r13 = (char) r11
            r14 = 34
            if (r13 == r14) goto L89
            r14 = 38
            if (r13 == r14) goto L86
            r14 = 60
            if (r13 == r14) goto L76
            r14 = 62
            if (r13 == r14) goto L71
            r14 = 160(0xa0, float:2.24E-43)
            if (r13 == r14) goto L67
            int r14 = com.github.catvod.spider.merge.C0158n0.b(r4)
            if (r14 == 0) goto L5e
            if (r14 == r12) goto L64
            boolean r12 = r2.canEncode(r13)
            goto L64
        L5e:
            r14 = 128(0x80, float:1.794E-43)
            if (r13 >= r14) goto L63
            goto L64
        L63:
            r12 = 0
        L64:
            if (r12 == 0) goto La5
            goto L8e
        L67:
            com.github.catvod.spider.merge.K1 r12 = com.github.catvod.spider.merge.K1.xhtml
            if (r1 == r12) goto L6e
            java.lang.String r12 = "&nbsp;"
            goto La1
        L6e:
            java.lang.String r12 = "&#xa0;"
            goto La1
        L71:
            if (r18 != 0) goto L8e
            java.lang.String r12 = "&gt;"
            goto La1
        L76:
            if (r18 == 0) goto L83
            com.github.catvod.spider.merge.K1 r12 = com.github.catvod.spider.merge.K1.xhtml
            if (r1 == r12) goto L83
            int r12 = r17.g()
            r14 = 2
            if (r12 != r14) goto L8e
        L83:
            java.lang.String r12 = "&lt;"
            goto La1
        L86:
            java.lang.String r12 = "&amp;"
            goto La1
        L89:
            if (r18 == 0) goto L8e
            java.lang.String r12 = "&quot;"
            goto La1
        L8e:
            r15.append(r13)
            goto La8
        L92:
            java.lang.String r12 = new java.lang.String
            char[] r13 = java.lang.Character.toChars(r11)
            r12.<init>(r13)
            boolean r13 = r2.canEncode(r12)
            if (r13 == 0) goto La5
        La1:
            r15.append(r12)
            goto La8
        La5:
            b(r15, r1, r11)
        La8:
            int r11 = java.lang.Character.charCount(r11)
            int r7 = r7 + r11
            goto L15
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L1.d(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.x1, boolean, boolean, boolean):void");
    }

    public static boolean e(String str) {
        return K1.base.i(str) != -1;
    }

    public static boolean f(String str) {
        return K1.extended.i(str) != -1;
    }
}
