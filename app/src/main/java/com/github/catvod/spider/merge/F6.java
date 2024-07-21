package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class F6 {
    private static final String[] d = {",", ">", "+", "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final I8 a;
    private final String b;
    private final List<AbstractC0255v2> c = new ArrayList();

    private F6(String str) {
        R0.n(str);
        String trim = str.trim();
        this.b = trim;
        this.a = new I8(trim);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            r9 = this;
            com.github.catvod.spider.merge.I8 r0 = r9.a
            r0.h()
            java.lang.StringBuilder r0 = com.github.catvod.spider.merge.C0308z7.a()
        L9:
            com.github.catvod.spider.merge.I8 r1 = r9.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L63
            com.github.catvod.spider.merge.I8 r1 = r9.a
            java.lang.String r2 = "("
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L2e
            r0.append(r2)
            com.github.catvod.spider.merge.I8 r1 = r9.a
            r2 = 40
            r3 = 41
            java.lang.String r1 = r1.a(r2, r3)
            r0.append(r1)
            java.lang.String r1 = ")"
            goto L4a
        L2e:
            com.github.catvod.spider.merge.I8 r1 = r9.a
            java.lang.String r2 = "["
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L4e
            r0.append(r2)
            com.github.catvod.spider.merge.I8 r1 = r9.a
            r2 = 91
            r3 = 93
            java.lang.String r1 = r1.a(r2, r3)
            r0.append(r1)
            java.lang.String r1 = "]"
        L4a:
            r0.append(r1)
            goto L9
        L4e:
            com.github.catvod.spider.merge.I8 r1 = r9.a
            java.lang.String[] r2 = com.github.catvod.spider.merge.F6.d
            boolean r1 = r1.l(r2)
            if (r1 == 0) goto L59
            goto L63
        L59:
            com.github.catvod.spider.merge.I8 r1 = r9.a
            char r1 = r1.c()
            r0.append(r1)
            goto L9
        L63:
            java.lang.String r0 = com.github.catvod.spider.merge.C0308z7.g(r0)
            com.github.catvod.spider.merge.v2 r0 = h(r0)
            java.util.List<com.github.catvod.spider.merge.v2> r1 = r9.c
            int r1 = r1.size()
            r2 = 44
            r3 = 0
            r4 = 1
            if (r1 != r4) goto L9a
            java.util.List<com.github.catvod.spider.merge.v2> r1 = r9.c
            java.lang.Object r1 = r1.get(r3)
            com.github.catvod.spider.merge.v2 r1 = (com.github.catvod.spider.merge.AbstractC0255v2) r1
            boolean r5 = r1 instanceof com.github.catvod.spider.merge.E0
            if (r5 == 0) goto La1
            if (r10 == r2) goto La1
            r5 = r1
            com.github.catvod.spider.merge.E0 r5 = (com.github.catvod.spider.merge.E0) r5
            int r6 = r5.b
            if (r6 <= 0) goto L97
            java.util.ArrayList<com.github.catvod.spider.merge.v2> r5 = r5.a
            int r6 = r6 + (-1)
            java.lang.Object r5 = r5.get(r6)
            com.github.catvod.spider.merge.v2 r5 = (com.github.catvod.spider.merge.AbstractC0255v2) r5
            goto L98
        L97:
            r5 = 0
        L98:
            r6 = 1
            goto La3
        L9a:
            com.github.catvod.spider.merge.D0 r1 = new com.github.catvod.spider.merge.D0
            java.util.List<com.github.catvod.spider.merge.v2> r5 = r9.c
            r1.<init>(r5)
        La1:
            r5 = r1
            r6 = 0
        La3:
            java.util.List<com.github.catvod.spider.merge.v2> r7 = r9.c
            r7.clear()
            r7 = 32
            r8 = 2
            if (r10 == r7) goto L125
            r7 = 62
            if (r10 == r7) goto L114
            r7 = 126(0x7e, float:1.77E-43)
            if (r10 == r7) goto L103
            r7 = 43
            if (r10 == r7) goto Lf2
            if (r10 != r2) goto Ld9
            boolean r10 = r5 instanceof com.github.catvod.spider.merge.E0
            if (r10 == 0) goto Lc2
            com.github.catvod.spider.merge.E0 r5 = (com.github.catvod.spider.merge.E0) r5
            goto Ld0
        Lc2:
            com.github.catvod.spider.merge.E0 r10 = new com.github.catvod.spider.merge.E0
            r10.<init>()
            java.util.ArrayList<com.github.catvod.spider.merge.v2> r2 = r10.a
            r2.add(r5)
            r10.b()
            r5 = r10
        Ld0:
            java.util.ArrayList<com.github.catvod.spider.merge.v2> r10 = r5.a
            r10.add(r0)
            r5.b()
            goto L136
        Ld9:
            com.github.catvod.spider.merge.b7 r0 = new com.github.catvod.spider.merge.b7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown combinator: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0.<init>(r10, r1)
            throw r0
        Lf2:
            com.github.catvod.spider.merge.D0 r10 = new com.github.catvod.spider.merge.D0
            com.github.catvod.spider.merge.v2[] r2 = new com.github.catvod.spider.merge.AbstractC0255v2[r8]
            com.github.catvod.spider.merge.J7 r7 = new com.github.catvod.spider.merge.J7
            r7.<init>(r5)
            r2[r3] = r7
            r2[r4] = r0
            r10.<init>(r2)
            goto L135
        L103:
            com.github.catvod.spider.merge.D0 r10 = new com.github.catvod.spider.merge.D0
            com.github.catvod.spider.merge.v2[] r2 = new com.github.catvod.spider.merge.AbstractC0255v2[r8]
            com.github.catvod.spider.merge.M7 r7 = new com.github.catvod.spider.merge.M7
            r7.<init>(r5)
            r2[r3] = r7
            r2[r4] = r0
            r10.<init>(r2)
            goto L135
        L114:
            com.github.catvod.spider.merge.D0 r10 = new com.github.catvod.spider.merge.D0
            com.github.catvod.spider.merge.v2[] r2 = new com.github.catvod.spider.merge.AbstractC0255v2[r8]
            com.github.catvod.spider.merge.I7 r7 = new com.github.catvod.spider.merge.I7
            r7.<init>(r5)
            r2[r3] = r7
            r2[r4] = r0
            r10.<init>(r2)
            goto L135
        L125:
            com.github.catvod.spider.merge.D0 r10 = new com.github.catvod.spider.merge.D0
            com.github.catvod.spider.merge.v2[] r2 = new com.github.catvod.spider.merge.AbstractC0255v2[r8]
            com.github.catvod.spider.merge.L7 r7 = new com.github.catvod.spider.merge.L7
            r7.<init>(r5)
            r2[r3] = r7
            r2[r4] = r0
            r10.<init>(r2)
        L135:
            r5 = r10
        L136:
            if (r6 == 0) goto L145
            r10 = r1
            com.github.catvod.spider.merge.E0 r10 = (com.github.catvod.spider.merge.E0) r10
            java.util.ArrayList<com.github.catvod.spider.merge.v2> r0 = r10.a
            int r10 = r10.b
            int r10 = r10 + (-1)
            r0.set(r10, r5)
            goto L146
        L145:
            r1 = r5
        L146:
            java.util.List<com.github.catvod.spider.merge.v2> r10 = r9.c
            r10.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F6.a(char):void");
    }

    private int b() {
        String trim = this.a.b().trim();
        int i = C0308z7.d;
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else if (!Character.isDigit(trim.codePointAt(i2))) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z) {
            return Integer.parseInt(trim);
        }
        throw new IllegalArgumentException("Index must be numeric");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private void c(boolean z) {
        AbstractC0255v2 c0004a2;
        ?? r4;
        this.a.d(z ? ":containsOwn" : ":contains");
        String o = I8.o(this.a.a('(', ')'));
        R0.o(o, ":contains(text) query must not be empty");
        if (z) {
            List<AbstractC0255v2> list = this.c;
            c0004a2 = new Z1(o);
            r4 = list;
        } else {
            List<AbstractC0255v2> list2 = this.c;
            c0004a2 = new C0004a2(o);
            r4 = list2;
        }
        r4.add(c0004a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.I8 r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.F.k(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.F6.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.F6.g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "odd"
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L24
            r0 = 1
        L22:
            r4 = 2
            goto L74
        L24:
            java.lang.String r3 = "even"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r0 = 0
            goto L22
        L2e:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "^\\+"
            if (r3 == 0) goto L62
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L4b:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L5f
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L5f:
            r0 = r4
            r4 = r5
            goto L74
        L62:
            boolean r1 = r2.matches()
            if (r1 == 0) goto L9d
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L74:
            if (r10 == 0) goto L88
            if (r9 == 0) goto L80
            java.util.List<com.github.catvod.spider.merge.v2> r9 = r8.c
            com.github.catvod.spider.merge.o2 r10 = new com.github.catvod.spider.merge.o2
            r10.<init>(r4, r0)
            goto L99
        L80:
            java.util.List<com.github.catvod.spider.merge.v2> r9 = r8.c
            com.github.catvod.spider.merge.p2 r10 = new com.github.catvod.spider.merge.p2
            r10.<init>(r4, r0)
            goto L99
        L88:
            if (r9 == 0) goto L92
            java.util.List<com.github.catvod.spider.merge.v2> r9 = r8.c
            com.github.catvod.spider.merge.n2 r10 = new com.github.catvod.spider.merge.n2
            r10.<init>(r4, r0)
            goto L99
        L92:
            java.util.List<com.github.catvod.spider.merge.v2> r9 = r8.c
            com.github.catvod.spider.merge.m2 r10 = new com.github.catvod.spider.merge.m2
            r10.<init>(r4, r0)
        L99:
            r9.add(r10)
            return
        L9d:
            com.github.catvod.spider.merge.b7 r9 = new com.github.catvod.spider.merge.b7
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "Could not parse nth-index '%s': unexpected format"
            r9.<init>(r0, r10)
            goto Laa
        La9:
            throw r9
        Laa:
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F6.d(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    private void e() {
        AbstractC0255v2 c0207r2;
        AbstractC0255v2 c0124k2;
        ?? r0;
        ?? r02;
        AbstractC0255v2 w1;
        ?? r1;
        AbstractC0255v2 q1;
        ?? r03;
        if (this.a.j("#")) {
            String e2 = this.a.e();
            R0.n(e2);
            this.c.add(new C0028c2(e2));
        } else if (this.a.j(".")) {
            String e3 = this.a.e();
            R0.n(e3);
            this.c.add(new Q1(e3.trim(), 1));
        } else if (this.a.m() || this.a.k("*|")) {
            String k = F.k(this.a.f());
            R0.n(k);
            if (k.startsWith("*|")) {
                this.c.add(new E0(new C0243u2(k), new Q1(k.replace("*|", ":"), 2)));
                return;
            }
            if (k.contains("|")) {
                k = k.replace("|", ":");
            }
            this.c.add(new C0243u2(k));
        } else if (this.a.k("[")) {
            I8 i8 = new I8(this.a.a('[', ']'));
            String g2 = i8.g(e);
            R0.n(g2);
            i8.h();
            if (i8.i()) {
                if (g2.startsWith("^")) {
                    List<AbstractC0255v2> list = this.c;
                    q1 = new S1(g2.substring(1), 0);
                    r03 = list;
                } else {
                    List<AbstractC0255v2> list2 = this.c;
                    q1 = new Q1(g2, 0);
                    r03 = list2;
                }
                r03.add(q1);
                return;
            }
            if (i8.j("=")) {
                List<AbstractC0255v2> list3 = this.c;
                w1 = new T1(g2, i8.n());
                r1 = list3;
            } else if (i8.j("!=")) {
                List<AbstractC0255v2> list4 = this.c;
                w1 = new X1(g2, i8.n());
                r1 = list4;
            } else if (i8.j("^=")) {
                List<AbstractC0255v2> list5 = this.c;
                w1 = new Y1(g2, i8.n());
                r1 = list5;
            } else if (i8.j("$=")) {
                List<AbstractC0255v2> list6 = this.c;
                w1 = new V1(g2, i8.n());
                r1 = list6;
            } else if (i8.j("*=")) {
                List<AbstractC0255v2> list7 = this.c;
                w1 = new U1(g2, i8.n());
                r1 = list7;
            } else if (!i8.j("~=")) {
                throw new C0021b7("Could not parse attribute query '%s': unexpected token at '%s'", this.b, i8.n());
            } else {
                List<AbstractC0255v2> list8 = this.c;
                w1 = new W1(g2, Pattern.compile(i8.n()));
                r1 = list8;
            }
            r1.add(w1);
        } else if (this.a.j("*")) {
            this.c.add(new P1());
        } else if (this.a.j(":lt(")) {
            this.c.add(new C0076g2(b()));
        } else if (this.a.j(":gt(")) {
            this.c.add(new C0064f2(b()));
        } else if (this.a.j(":eq(")) {
            this.c.add(new C0040d2(b()));
        } else if (this.a.k(":has(")) {
            this.a.d(":has");
            String a = this.a.a('(', ')');
            R0.o(a, ":has(el) subselect must not be empty");
            this.c.add(new H7(h(a)));
        } else if (this.a.k(":contains(")) {
            c(false);
        } else if (this.a.k(":containsOwn(")) {
            c(true);
        } else if (this.a.k(":containsData(")) {
            this.a.d(":containsData");
            String o = I8.o(this.a.a('(', ')'));
            R0.o(o, ":containsData(text) query must not be empty");
            this.c.add(new S1(o, 1));
        } else if (this.a.k(":matches(")) {
            f(false);
        } else if (this.a.k(":matchesOwn(")) {
            f(true);
        } else if (this.a.k(":not(")) {
            this.a.d(":not");
            String a2 = this.a.a('(', ')');
            R0.o(a2, ":not(selector) subselect must not be empty");
            this.c.add(new K7(h(a2)));
        } else if (this.a.j(":nth-child(")) {
            d(false, false);
        } else if (this.a.j(":nth-last-child(")) {
            d(true, false);
        } else if (this.a.j(":nth-of-type(")) {
            d(false, true);
        } else if (this.a.j(":nth-last-of-type(")) {
            d(true, true);
        } else {
            if (this.a.j(":first-child")) {
                List<AbstractC0255v2> list9 = this.c;
                c0207r2 = new C0100i2(0);
                r02 = list9;
            } else if (this.a.j(":last-child")) {
                List<AbstractC0255v2> list10 = this.c;
                c0207r2 = new C0124k2(0);
                r02 = list10;
            } else if (this.a.j(":first-of-type")) {
                List<AbstractC0255v2> list11 = this.c;
                c0207r2 = new C0112j2();
                r02 = list11;
            } else if (!this.a.j(":last-of-type")) {
                if (this.a.j(":only-child")) {
                    List<AbstractC0255v2> list12 = this.c;
                    c0124k2 = new C0100i2(1);
                    r0 = list12;
                } else if (this.a.j(":only-of-type")) {
                    List<AbstractC0255v2> list13 = this.c;
                    c0207r2 = new C0196q2();
                    r02 = list13;
                } else if (this.a.j(":empty")) {
                    List<AbstractC0255v2> list14 = this.c;
                    c0207r2 = new C0088h2();
                    r02 = list14;
                } else if (this.a.j(":root")) {
                    List<AbstractC0255v2> list15 = this.c;
                    c0124k2 = new C0124k2(1);
                    r0 = list15;
                } else if (!this.a.j(":matchText")) {
                    throw new C0021b7("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.n());
                } else {
                    List<AbstractC0255v2> list16 = this.c;
                    c0207r2 = new C0207r2();
                    r02 = list16;
                }
                r0.add(c0124k2);
                return;
            } else {
                List<AbstractC0255v2> list17 = this.c;
                c0207r2 = new C0136l2();
                r02 = list17;
            }
            r02.add(c0207r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private void f(boolean z) {
        AbstractC0255v2 c0219s2;
        ?? r4;
        this.a.d(z ? ":matchesOwn" : ":matches");
        String a = this.a.a('(', ')');
        R0.o(a, ":matches(regex) query must not be empty");
        if (z) {
            List<AbstractC0255v2> list = this.c;
            c0219s2 = new C0231t2(Pattern.compile(a));
            r4 = list;
        } else {
            List<AbstractC0255v2> list2 = this.c;
            c0219s2 = new C0219s2(Pattern.compile(a));
            r4 = list2;
        }
        r4.add(c0219s2);
    }

    public static AbstractC0255v2 h(String str) {
        try {
            return new F6(str).g();
        } catch (IllegalArgumentException e2) {
            throw new C0021b7(e2.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.v2>, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0042). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x001c -> B:7:0x001f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.github.catvod.spider.merge.AbstractC0255v2 g() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.I8 r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.I8 r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.F6.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.v2> r0 = r4.c
            com.github.catvod.spider.merge.N7 r1 = new com.github.catvod.spider.merge.N7
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.e()
        L1f:
            com.github.catvod.spider.merge.I8 r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.I8 r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.I8 r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.F6.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.I8 r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.v2> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.v2> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.v2 r0 = (com.github.catvod.spider.merge.AbstractC0255v2) r0
            return r0
        L59:
            com.github.catvod.spider.merge.D0 r1 = new com.github.catvod.spider.merge.D0
            java.util.List<com.github.catvod.spider.merge.v2> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F6.g():com.github.catvod.spider.merge.v2");
    }

    public final String toString() {
        return this.b;
    }
}
