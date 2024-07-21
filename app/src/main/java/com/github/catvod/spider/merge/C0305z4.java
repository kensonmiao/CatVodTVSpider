package com.github.catvod.spider.merge;

import android.graphics.Bitmap;
import android.util.TypedValue;
import com.github.catvod.spider.Init;
import java.util.Arrays;
import java.util.EnumMap;

/* renamed from: com.github.catvod.spider.merge.z4 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0305z4 {
    private static final C0305z4 a = new C0305z4();
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    private static final Z7 c = new Z7("REMOVED_TASK");
    private static final Z7 d = new Z7("CLOSED_EMPTY");

    public static void c(Throwable th, Throwable th2) {
        h(th, "$this$addSuppressed");
        h(th2, "exception");
        if (th != th2) {
            C0164n6.a.a(th, th2);
        }
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static int e(EnumC0234t5 enumC0234t5, X x, X x2, C0215ra c0215ra) {
        return x2.f() + enumC0234t5.b(c0215ra) + x.f();
    }

    public static void f(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        n(nullPointerException);
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(C0288y.a(str, " must not be null"));
        n(nullPointerException);
        throw nullPointerException;
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        n(nullPointerException);
        throw nullPointerException;
    }

    private static C0215ra i(int i, int i2) {
        for (int i3 = 1; i3 <= 40; i3++) {
            C0215ra e = C0215ra.e(i3);
            if (p(i, e, i2)) {
                return e;
            }
        }
        throw new C0299ya("Data too big");
    }

    /* JADX WARN: Code restructure failed: missing block: B:376:0x007e, code lost:
        r7 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x00f5 A[LOOP:1: B:392:0x00c7->B:406:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.E6 j(java.lang.String r23, int r24, java.util.Map r25) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            com.github.catvod.spider.merge.t5 r3 = com.github.catvod.spider.merge.EnumC0234t5.BYTE
            com.github.catvod.spider.merge.J1 r4 = com.github.catvod.spider.merge.J1.CHARACTER_SET
            boolean r5 = r2.containsKey(r4)
            java.lang.String r6 = "ISO-8859-1"
            if (r5 == 0) goto L1b
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = r4.toString()
            goto L1c
        L1b:
            r4 = r6
        L1c:
            java.lang.String r5 = "Shift_JIS"
            boolean r7 = r5.equals(r4)
            r8 = -1
            r10 = 1
            if (r7 == 0) goto L53
            byte[] r7 = r0.getBytes(r5)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r11 = r7.length
            int r12 = r11 % 2
            if (r12 == 0) goto L30
            goto L4d
        L30:
            r12 = 0
        L31:
            if (r12 >= r11) goto L4b
            r13 = r7[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r14 = 129(0x81, float:1.81E-43)
            if (r13 < r14) goto L3f
            r14 = 159(0x9f, float:2.23E-43)
            if (r13 <= r14) goto L48
        L3f:
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 < r14) goto L4d
            r14 = 235(0xeb, float:3.3E-43)
            if (r13 <= r14) goto L48
            goto L4d
        L48:
            int r12 = r12 + 2
            goto L31
        L4b:
            r7 = 1
            goto L4e
        L4d:
            r7 = 0
        L4e:
            if (r7 == 0) goto L53
            com.github.catvod.spider.merge.t5 r7 = com.github.catvod.spider.merge.EnumC0234t5.KANJI
            goto L7f
        L53:
            r7 = 0
            r11 = 0
            r12 = 0
        L56:
            int r13 = r23.length()
            if (r7 >= r13) goto L74
            char r13 = r0.charAt(r7)
            r14 = 48
            if (r13 < r14) goto L6a
            r14 = 57
            if (r13 > r14) goto L6a
            r12 = 1
            goto L71
        L6a:
            int r11 = k(r13)
            if (r11 == r8) goto L7e
            r11 = 1
        L71:
            int r7 = r7 + 1
            goto L56
        L74:
            if (r11 == 0) goto L79
            com.github.catvod.spider.merge.t5 r7 = com.github.catvod.spider.merge.EnumC0234t5.ALPHANUMERIC
            goto L7f
        L79:
            if (r12 == 0) goto L7e
            com.github.catvod.spider.merge.t5 r7 = com.github.catvod.spider.merge.EnumC0234t5.NUMERIC
            goto L7f
        L7e:
            r7 = r3
        L7f:
            com.github.catvod.spider.merge.X r11 = new com.github.catvod.spider.merge.X
            r11.<init>()
            r12 = 4
            r13 = 8
            if (r7 != r3) goto La5
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto La5
            com.github.catvod.spider.merge.k0 r6 = com.github.catvod.spider.merge.EnumC0122k0.a(r4)
            if (r6 == 0) goto La5
            com.github.catvod.spider.merge.t5 r14 = com.github.catvod.spider.merge.EnumC0234t5.ECI
            int r14 = r14.a()
            r11.c(r14, r12)
            int r6 = r6.b()
            r11.c(r6, r13)
        La5:
            int r6 = r7.a()
            r11.c(r6, r12)
            com.github.catvod.spider.merge.X r6 = new com.github.catvod.spider.merge.X
            r6.<init>()
            int r14 = r7.ordinal()
            r9 = 10
            if (r14 == r10) goto L17b
            r10 = 6
            r15 = 2
            if (r14 == r15) goto L140
            if (r14 == r12) goto L128
            if (r14 != r10) goto L114
            byte[] r4 = r0.getBytes(r5)     // Catch: java.io.UnsupportedEncodingException -> L10c
            int r5 = r4.length
            r10 = 0
        Lc7:
            if (r10 >= r5) goto L1bd
            r14 = r4[r10]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r10 + 1
            r15 = r4[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r13
            r14 = r14 | r15
            r15 = 33088(0x8140, float:4.6366E-41)
            if (r14 < r15) goto Le3
            r15 = 40956(0x9ffc, float:5.7392E-41)
            if (r14 > r15) goto Le3
            r15 = 33088(0x8140, float:4.6366E-41)
            goto Lf0
        Le3:
            r15 = 57408(0xe040, float:8.0446E-41)
            if (r14 < r15) goto Lf2
            r15 = 60351(0xebbf, float:8.457E-41)
            if (r14 > r15) goto Lf2
            r15 = 49472(0xc140, float:6.9325E-41)
        Lf0:
            int r14 = r14 - r15
            goto Lf3
        Lf2:
            r14 = -1
        Lf3:
            if (r14 == r8) goto L104
            int r15 = r14 >> 8
            int r15 = r15 * 192
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r14
            r14 = 13
            r6.c(r15, r14)
            int r10 = r10 + 2
            goto Lc7
        L104:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "Invalid byte sequence"
            r0.<init>(r1)
            throw r0
        L10c:
            r0 = move-exception
            r1 = r0
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            r0.<init>(r1)
            throw r0
        L114:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid mode: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L128:
            byte[] r4 = r0.getBytes(r4)     // Catch: java.io.UnsupportedEncodingException -> L138
            int r5 = r4.length
            r10 = 0
        L12e:
            if (r10 >= r5) goto L1bd
            r14 = r4[r10]
            r6.c(r14, r13)
            int r10 = r10 + 1
            goto L12e
        L138:
            r0 = move-exception
            r1 = r0
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            r0.<init>(r1)
            throw r0
        L140:
            int r4 = r23.length()
            r5 = 0
        L145:
            if (r5 >= r4) goto L1bd
            char r14 = r0.charAt(r5)
            int r14 = k(r14)
            if (r14 == r8) goto L175
            int r15 = r5 + 1
            if (r15 >= r4) goto L170
            char r15 = r0.charAt(r15)
            int r15 = k(r15)
            if (r15 == r8) goto L16a
            int r14 = r14 * 45
            int r14 = r14 + r15
            r15 = 11
            r6.c(r14, r15)
            int r5 = r5 + 2
            goto L145
        L16a:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            r0.<init>()
            throw r0
        L170:
            r6.c(r14, r10)
            r5 = r15
            goto L145
        L175:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            r0.<init>()
            throw r0
        L17b:
            int r4 = r23.length()
            r5 = 0
        L180:
            if (r5 >= r4) goto L1bd
            char r10 = r0.charAt(r5)
            int r10 = r10 + (-48)
            int r14 = r5 + 2
            if (r14 >= r4) goto L1a6
            int r15 = r5 + 1
            char r15 = r0.charAt(r15)
            int r15 = r15 + (-48)
            char r14 = r0.charAt(r14)
            int r14 = r14 + (-48)
            int r10 = r10 * 100
            int r15 = r15 * 10
            int r15 = r15 + r10
            int r15 = r15 + r14
            r6.c(r15, r9)
            int r5 = r5 + 3
            goto L180
        L1a6:
            int r5 = r5 + 1
            if (r5 >= r4) goto L1b9
            char r5 = r0.charAt(r5)
            int r5 = r5 + (-48)
            int r10 = r10 * 10
            int r10 = r10 + r5
            r5 = 7
            r6.c(r10, r5)
            r5 = r14
            goto L180
        L1b9:
            r6.c(r10, r12)
            goto L180
        L1bd:
            com.github.catvod.spider.merge.J1 r4 = com.github.catvod.spider.merge.J1.QR_VERSION
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L1e8
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
            com.github.catvod.spider.merge.ra r2 = com.github.catvod.spider.merge.C0215ra.e(r2)
            int r4 = e(r7, r11, r6, r2)
            boolean r4 = p(r4, r2, r1)
            if (r4 == 0) goto L1e0
            goto L1fd
        L1e0:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "Data too big for requested version"
            r0.<init>(r1)
            throw r0
        L1e8:
            r2 = 1
            com.github.catvod.spider.merge.ra r4 = com.github.catvod.spider.merge.C0215ra.e(r2)
            int r2 = e(r7, r11, r6, r4)
            com.github.catvod.spider.merge.ra r2 = i(r2, r1)
            int r2 = e(r7, r11, r6, r2)
            com.github.catvod.spider.merge.ra r2 = i(r2, r1)
        L1fd:
            com.github.catvod.spider.merge.X r4 = new com.github.catvod.spider.merge.X
            r4.<init>()
            r4.b(r11)
            if (r7 != r3) goto L20c
            int r0 = r6.g()
            goto L210
        L20c:
            int r0 = r23.length()
        L210:
            int r3 = r7.b(r2)
            r5 = 1
            int r10 = r5 << r3
            if (r0 >= r10) goto L501
            r4.c(r0, r3)
            r4.b(r6)
            com.github.catvod.spider.merge.qa r0 = r2.c(r1)
            int r3 = r2.d()
            int r5 = r0.d()
            int r3 = r3 - r5
            int r5 = r3 << 3
            int r6 = r4.f()
            if (r6 > r5) goto L4e1
            r6 = 0
        L235:
            if (r6 >= r12) goto L244
            int r10 = r4.f()
            if (r10 >= r5) goto L244
            r10 = 0
            r4.a(r10)
            int r6 = r6 + 1
            goto L235
        L244:
            r10 = 0
            int r6 = r4.f()
            r11 = 7
            r6 = r6 & r11
            if (r6 <= 0) goto L256
        L24d:
            if (r6 >= r13) goto L256
            r4.a(r10)
            int r6 = r6 + 1
            r10 = 0
            goto L24d
        L256:
            int r6 = r4.g()
            int r6 = r3 - r6
            r10 = 0
        L25d:
            if (r10 >= r6) goto L26e
            r11 = r10 & 1
            if (r11 != 0) goto L266
            r11 = 236(0xec, float:3.31E-43)
            goto L268
        L266:
            r11 = 17
        L268:
            r4.c(r11, r13)
            int r10 = r10 + 1
            goto L25d
        L26e:
            int r6 = r4.f()
            if (r6 != r5) goto L4d9
            int r5 = r2.d()
            int r0 = r0.c()
            int r6 = r4.g()
            if (r6 != r3) goto L4d1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
        L28b:
            if (r10 >= r0) goto L370
            r15 = 1
            int[] r9 = new int[r15]
            int[] r8 = new int[r15]
            if (r10 >= r0) goto L368
            int r15 = r5 % r0
            int r13 = r0 - r15
            int r19 = r5 / r0
            int r20 = r19 + 1
            int r21 = r3 / r0
            int r22 = r21 + 1
            r25 = r2
            int r2 = r19 - r21
            r19 = r7
            int r7 = r20 - r22
            if (r2 != r7) goto L360
            int r1 = r13 + r15
            if (r0 != r1) goto L358
            int r1 = r21 + r2
            int r1 = r1 * r13
            int r20 = r22 + r7
            int r20 = r20 * r15
            int r1 = r20 + r1
            if (r5 != r1) goto L350
            r1 = 0
            if (r10 >= r13) goto L2c2
            r9[r1] = r21
            r8[r1] = r2
            goto L2c6
        L2c2:
            r9[r1] = r22
            r8[r1] = r7
        L2c6:
            r2 = r9[r1]
            byte[] r1 = new byte[r2]
            int r7 = r11 << 3
            r13 = 0
        L2cd:
            if (r13 >= r2) goto L2f9
            r23 = r0
            r20 = r5
            r0 = 0
            r5 = 8
            r15 = 0
        L2d7:
            if (r15 >= r5) goto L2ed
            boolean r5 = r4.e(r7)
            if (r5 == 0) goto L2e6
            int r5 = 7 - r15
            r17 = 1
            int r5 = r17 << r5
            r0 = r0 | r5
        L2e6:
            int r7 = r7 + 1
            int r15 = r15 + 1
            r5 = 8
            goto L2d7
        L2ed:
            int r5 = r13 + 0
            byte r0 = (byte) r0
            r1[r5] = r0
            int r13 = r13 + 1
            r0 = r23
            r5 = r20
            goto L2cd
        L2f9:
            r23 = r0
            r20 = r5
            r0 = 0
            r5 = r8[r0]
            int r0 = r2 + r5
            int[] r0 = new int[r0]
            r7 = 0
        L305:
            if (r7 >= r2) goto L310
            r8 = r1[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r0[r7] = r8
            int r7 = r7 + 1
            goto L305
        L310:
            com.github.catvod.spider.merge.N6 r7 = new com.github.catvod.spider.merge.N6
            com.github.catvod.spider.merge.I3 r8 = com.github.catvod.spider.merge.I3.k
            r7.<init>(r8)
            r7.a(r0, r5)
            byte[] r7 = new byte[r5]
            r8 = 0
        L31d:
            if (r8 >= r5) goto L329
            int r13 = r2 + r8
            r13 = r0[r13]
            byte r13 = (byte) r13
            r7[r8] = r13
            int r8 = r8 + 1
            goto L31d
        L329:
            com.github.catvod.spider.merge.a0 r0 = new com.github.catvod.spider.merge.a0
            r0.<init>(r1, r7)
            r6.add(r0)
            int r12 = java.lang.Math.max(r12, r2)
            int r14 = java.lang.Math.max(r14, r5)
            r0 = 0
            r1 = r9[r0]
            int r11 = r11 + r1
            int r10 = r10 + 1
            r0 = r23
            r1 = r24
            r2 = r25
            r7 = r19
            r5 = r20
            r8 = -1
            r9 = 10
            r13 = 8
            goto L28b
        L350:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "Total bytes mismatch"
            r0.<init>(r1)
            throw r0
        L358:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "RS blocks mismatch"
            r0.<init>(r1)
            throw r0
        L360:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "EC bytes mismatch"
            r0.<init>(r1)
            throw r0
        L368:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "Block ID too large"
            r0.<init>(r1)
            throw r0
        L370:
            r25 = r2
            r20 = r5
            r19 = r7
            r0 = 0
            if (r3 != r11) goto L4c9
            com.github.catvod.spider.merge.X r1 = new com.github.catvod.spider.merge.X
            r1.<init>()
            r10 = 0
        L37f:
            if (r10 >= r12) goto L3a3
            java.util.Iterator r2 = r6.iterator()
        L385:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a0
            java.lang.Object r3 = r2.next()
            com.github.catvod.spider.merge.a0 r3 = (com.github.catvod.spider.merge.C0002a0) r3
            byte[] r3 = r3.a()
            int r4 = r3.length
            if (r10 >= r4) goto L385
            r3 = r3[r10]
            r4 = 8
            r1.c(r3, r4)
            goto L385
        L3a0:
            int r10 = r10 + 1
            goto L37f
        L3a3:
            r10 = 0
        L3a4:
            if (r10 >= r14) goto L3c8
            java.util.Iterator r2 = r6.iterator()
        L3aa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c5
            java.lang.Object r3 = r2.next()
            com.github.catvod.spider.merge.a0 r3 = (com.github.catvod.spider.merge.C0002a0) r3
            byte[] r3 = r3.b()
            int r4 = r3.length
            if (r10 >= r4) goto L3aa
            r3 = r3[r10]
            r4 = 8
            r1.c(r3, r4)
            goto L3aa
        L3c5:
            int r10 = r10 + 1
            goto L3a4
        L3c8:
            int r2 = r1.g()
            r3 = r20
            if (r3 != r2) goto L4a4
            com.github.catvod.spider.merge.E6 r2 = new com.github.catvod.spider.merge.E6
            r2.<init>()
            r3 = r24
            r2.b(r3)
            r7 = r19
            r2.e(r7)
            r4 = r25
            r2.f(r4)
            int r5 = r4.b()
            com.github.catvod.spider.merge.d0 r6 = new com.github.catvod.spider.merge.d0
            r6.<init>(r5, r5)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r7 = -1
            r8 = 8
            r10 = 0
        L3f4:
            if (r10 >= r8) goto L49a
            com.github.catvod.spider.merge.C0144la.b(r1, r3, r4, r10, r6)
            int r9 = com.github.catvod.spider.merge.F.b(r6)
            byte[][] r11 = r6.c()
            int r12 = r6.e()
            int r13 = r6.d()
            r14 = 0
            r15 = 0
            r16 = -1
        L40d:
            int r0 = r13 + (-1)
            if (r14 >= r0) goto L440
            r0 = 0
        L412:
            int r8 = r12 + (-1)
            if (r0 >= r8) goto L439
            r8 = r11[r14]
            r8 = r8[r0]
            r18 = r11[r14]
            int r19 = r0 + 1
            r25 = r12
            r12 = r18[r19]
            if (r8 != r12) goto L434
            int r12 = r14 + 1
            r18 = r11[r12]
            r0 = r18[r0]
            if (r8 != r0) goto L434
            r0 = r11[r12]
            r0 = r0[r19]
            if (r8 != r0) goto L434
            int r15 = r15 + 1
        L434:
            r12 = r25
            r0 = r19
            goto L412
        L439:
            r25 = r12
            int r14 = r14 + 1
            r8 = 8
            goto L40d
        L440:
            int r15 = r15 * 3
            int r15 = r15 + r9
            int r0 = com.github.catvod.spider.merge.F.d(r6)
            int r15 = r15 + r0
            byte[][] r0 = r6.c()
            int r8 = r6.e()
            int r9 = r6.d()
            r11 = 0
            r12 = 0
        L456:
            if (r11 >= r9) goto L476
            r13 = r0[r11]
            r14 = r12
            r12 = 0
        L45c:
            r25 = r0
            if (r12 >= r8) goto L470
            r0 = r13[r12]
            r18 = r8
            r8 = 1
            if (r0 != r8) goto L469
            int r14 = r14 + 1
        L469:
            int r12 = r12 + 1
            r0 = r25
            r8 = r18
            goto L45c
        L470:
            r18 = r8
            int r11 = r11 + 1
            r12 = r14
            goto L456
        L476:
            int r0 = r6.d()
            int r8 = r6.e()
            int r8 = r8 * r0
            int r0 = r12 << 1
            int r0 = r0 - r8
            int r0 = java.lang.Math.abs(r0)
            r9 = 10
            int r0 = r0 * 10
            int r0 = r0 / r8
            int r0 = r0 * 10
            int r0 = r0 + r15
            if (r0 >= r5) goto L493
            r5 = r0
            r7 = r10
        L493:
            int r10 = r10 + 1
            r0 = 0
            r8 = 8
            goto L3f4
        L49a:
            r2.c(r7)
            com.github.catvod.spider.merge.C0144la.b(r1, r3, r4, r7, r6)
            r2.d(r6)
            return r2
        L4a4:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Interleaving error: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = " and "
            r2.append(r3)
            int r1 = r1.g()
            r2.append(r1)
            java.lang.String r1 = " differ."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L4c9:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "Data bytes does not match offset"
            r0.<init>(r1)
            throw r0
        L4d1:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "Number of bits and data bytes does not match"
            r0.<init>(r1)
            throw r0
        L4d9:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.String r1 = "Bits size does not equal capacity"
            r0.<init>(r1)
            throw r0
        L4e1:
            com.github.catvod.spider.merge.ya r0 = new com.github.catvod.spider.merge.ya
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "data bits cannot fit in the QR Code"
            r1.<init>(r2)
            int r2 = r4.f()
            r1.append(r2)
            java.lang.String r2 = " > "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L501:
            com.github.catvod.spider.merge.ya r1 = new com.github.catvod.spider.merge.ya
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is bigger than "
            r2.append(r0)
            r0 = 1
            int r10 = r10 - r0
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            goto L51e
        L51d:
            throw r1
        L51e:
            goto L51d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0305z4.j(java.lang.String, int, java.util.Map):com.github.catvod.spider.merge.E6");
    }

    static int k(int i) {
        int[] iArr = b;
        if (i < 96) {
            return iArr[i];
        }
        return -1;
    }

    public static Bitmap l(String str) {
        try {
            EnumMap enumMap = new EnumMap(J1.class);
            enumMap.put((EnumMap) J1.CHARACTER_SET, (J1) "UTF-8");
            enumMap.put((EnumMap) J1.MARGIN, (J1) 2);
            int i = C0156ma.a;
            float f = 240;
            Y b2 = new R0().b(str, M.QR_CODE, (int) TypedValue.applyDimension(1, f, Init.context().getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f, Init.context().getResources().getDisplayMetrics()), enumMap);
            int c2 = b2.c();
            int b3 = b2.b();
            int[] iArr = new int[c2 * b3];
            for (int i2 = 0; i2 < b3; i2++) {
                int i3 = i2 * c2;
                for (int i4 = 0; i4 < c2; i4++) {
                    iArr[i3 + i4] = b2.a(i4, i2) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(c2, b3, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, c2, 0, 0, c2, b3);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static C0305z4 m() {
        return a;
    }

    private static Throwable n(Throwable th) {
        String name = C0305z4.class.getName();
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    public static void o(C5 c5, A5 a5) {
        A5 a52 = a5;
        int i = 0;
        while (a52 != null) {
            A5 A = a52.A();
            c5.b(a52, i);
            if (A != null && !a52.q()) {
                a52 = A.g(a52.H());
            }
            if (a52.h() > 0) {
                a52 = a52.g(0);
                i++;
            } else {
                while (a52.s() == null && i > 0) {
                    c5.a(a52, i);
                    a52 = a52.A();
                    i--;
                }
                c5.a(a52, i);
                if (a52 == a5) {
                    return;
                }
                a52 = a52.s();
            }
        }
    }

    private static boolean p(int i, C0215ra c0215ra, int i2) {
        return c0215ra.d() - c0215ra.c(i2).d() >= (i + 7) / 8;
    }
}
