package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.n6 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0164n6 {
    public static final C0152m6 a;

    /* JADX WARN: Removed duplicated region for block: B:127:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<com.github.catvod.spider.merge.m6> r0 = com.github.catvod.spider.merge.C0152m6.class
            java.lang.String r1 = "java.specification.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 == 0) goto L46
            r2 = 6
            r3 = 46
            r4 = 0
            int r2 = com.github.catvod.spider.merge.B7.r(r1, r3, r4, r2)
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= 0) goto L1d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L46
            int r1 = r1 * r5
            goto L49
        L1d:
            int r6 = r2 + 1
            r7 = 4
            int r3 = com.github.catvod.spider.merge.B7.r(r1, r3, r6, r7)
            if (r3 >= 0) goto L2a
            int r3 = r1.length()
        L2a:
            java.lang.String r2 = r1.substring(r4, r2)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            com.github.catvod.spider.merge.C0305z4.g(r2, r4)
            java.lang.String r1 = r1.substring(r6, r3)
            com.github.catvod.spider.merge.C0305z4.g(r1, r4)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L46
            int r2 = r2 * r5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L46
            int r1 = r1 + r2
            goto L49
        L46:
            r1 = 65542(0x10006, float:9.1844E-41)
        L49:
            r2 = 65544(0x10008, float:9.1847E-41)
            java.lang.String r3 = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)"
            java.lang.String r4 = ", base type classloader: "
            java.lang.String r5 = "Instance classloader: "
            java.lang.String r6 = "Class.forName(\"kotlin.in…entations\").newInstance()"
            if (r1 < r2) goto Ld3
            java.lang.Class<com.github.catvod.spider.merge.B4> r2 = com.github.catvod.spider.merge.B4.class
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.ClassNotFoundException -> L92
            com.github.catvod.spider.merge.C0305z4.g(r2, r6)     // Catch: java.lang.ClassNotFoundException -> L92
            com.github.catvod.spider.merge.m6 r2 = (com.github.catvod.spider.merge.C0152m6) r2     // Catch: java.lang.ClassCastException -> L63 java.lang.ClassNotFoundException -> L92
            goto L159
        L63:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L92
            r10.<init>()     // Catch: java.lang.ClassNotFoundException -> L92
            r10.append(r5)     // Catch: java.lang.ClassNotFoundException -> L92
            r10.append(r2)     // Catch: java.lang.ClassNotFoundException -> L92
            r10.append(r4)     // Catch: java.lang.ClassNotFoundException -> L92
            r10.append(r8)     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.String r2 = r10.toString()     // Catch: java.lang.ClassNotFoundException -> L92
            r9.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.Throwable r2 = r9.initCause(r7)     // Catch: java.lang.ClassNotFoundException -> L92
            com.github.catvod.spider.merge.C0305z4.g(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L92
            throw r2     // Catch: java.lang.ClassNotFoundException -> L92
        L92:
            java.lang.String r2 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> Ld2
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.ClassNotFoundException -> Ld2
            com.github.catvod.spider.merge.C0305z4.g(r2, r6)     // Catch: java.lang.ClassNotFoundException -> Ld2
            com.github.catvod.spider.merge.m6 r2 = (com.github.catvod.spider.merge.C0152m6) r2     // Catch: java.lang.ClassCastException -> La3 java.lang.ClassNotFoundException -> Ld2
            goto L159
        La3:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> Ld2
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Ld2
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Ld2
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch: java.lang.ClassNotFoundException -> Ld2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> Ld2
            r10.<init>()     // Catch: java.lang.ClassNotFoundException -> Ld2
            r10.append(r5)     // Catch: java.lang.ClassNotFoundException -> Ld2
            r10.append(r2)     // Catch: java.lang.ClassNotFoundException -> Ld2
            r10.append(r4)     // Catch: java.lang.ClassNotFoundException -> Ld2
            r10.append(r8)     // Catch: java.lang.ClassNotFoundException -> Ld2
            java.lang.String r2 = r10.toString()     // Catch: java.lang.ClassNotFoundException -> Ld2
            r9.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> Ld2
            java.lang.Throwable r2 = r9.initCause(r7)     // Catch: java.lang.ClassNotFoundException -> Ld2
            com.github.catvod.spider.merge.C0305z4.g(r2, r3)     // Catch: java.lang.ClassNotFoundException -> Ld2
            throw r2     // Catch: java.lang.ClassNotFoundException -> Ld2
        Ld2:
        Ld3:
            r2 = 65543(0x10007, float:9.1845E-41)
            if (r1 < r2) goto L154
            java.lang.Class<com.github.catvod.spider.merge.A4> r1 = com.github.catvod.spider.merge.A4.class
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.ClassNotFoundException -> L114
            com.github.catvod.spider.merge.C0305z4.g(r1, r6)     // Catch: java.lang.ClassNotFoundException -> L114
            r2 = r1
            com.github.catvod.spider.merge.m6 r2 = (com.github.catvod.spider.merge.C0152m6) r2     // Catch: java.lang.ClassCastException -> Le5 java.lang.ClassNotFoundException -> L114
            goto L159
        Le5:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L114
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L114
            java.lang.ClassLoader r7 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L114
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch: java.lang.ClassNotFoundException -> L114
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L114
            r9.<init>()     // Catch: java.lang.ClassNotFoundException -> L114
            r9.append(r5)     // Catch: java.lang.ClassNotFoundException -> L114
            r9.append(r1)     // Catch: java.lang.ClassNotFoundException -> L114
            r9.append(r4)     // Catch: java.lang.ClassNotFoundException -> L114
            r9.append(r7)     // Catch: java.lang.ClassNotFoundException -> L114
            java.lang.String r1 = r9.toString()     // Catch: java.lang.ClassNotFoundException -> L114
            r8.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L114
            java.lang.Throwable r1 = r8.initCause(r2)     // Catch: java.lang.ClassNotFoundException -> L114
            com.github.catvod.spider.merge.C0305z4.g(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L114
            throw r1     // Catch: java.lang.ClassNotFoundException -> L114
        L114:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L154
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.ClassNotFoundException -> L154
            com.github.catvod.spider.merge.C0305z4.g(r1, r6)     // Catch: java.lang.ClassNotFoundException -> L154
            r2 = r1
            com.github.catvod.spider.merge.m6 r2 = (com.github.catvod.spider.merge.C0152m6) r2     // Catch: java.lang.ClassCastException -> L125 java.lang.ClassNotFoundException -> L154
            goto L159
        L125:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L154
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L154
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L154
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch: java.lang.ClassNotFoundException -> L154
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L154
            r7.<init>()     // Catch: java.lang.ClassNotFoundException -> L154
            r7.append(r5)     // Catch: java.lang.ClassNotFoundException -> L154
            r7.append(r1)     // Catch: java.lang.ClassNotFoundException -> L154
            r7.append(r4)     // Catch: java.lang.ClassNotFoundException -> L154
            r7.append(r0)     // Catch: java.lang.ClassNotFoundException -> L154
            java.lang.String r0 = r7.toString()     // Catch: java.lang.ClassNotFoundException -> L154
            r6.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L154
            java.lang.Throwable r0 = r6.initCause(r2)     // Catch: java.lang.ClassNotFoundException -> L154
            com.github.catvod.spider.merge.C0305z4.g(r0, r3)     // Catch: java.lang.ClassNotFoundException -> L154
            throw r0     // Catch: java.lang.ClassNotFoundException -> L154
        L154:
            com.github.catvod.spider.merge.m6 r2 = new com.github.catvod.spider.merge.m6
            r2.<init>()
        L159:
            com.github.catvod.spider.merge.C0164n6.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0164n6.<clinit>():void");
    }
}
