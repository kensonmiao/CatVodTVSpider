package com.github.catvod.spider.merge;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class E1 extends A5 {
    private static final List<E1> j = Collections.emptyList();
    private static final String k;
    private C0022b8 f;
    @Nullable
    private WeakReference<List<E1>> g;
    List<A5> h;
    @Nullable
    private K i;

    static {
        Pattern.compile("\\s+");
        k = "/baseUri";
    }

    public E1(C0022b8 c0022b8, @Nullable String str, @Nullable K k2) {
        R0.p(c0022b8);
        this.h = A5.e;
        this.i = k2;
        this.f = c0022b8;
        if (str != null) {
            l(str);
        }
    }

    private static void K(E1 e1, F1 f1) {
        E1 e12 = (E1) e1.c;
        if (e12 == null || e12.n0().equals("#root")) {
            return;
        }
        f1.add(e12);
        K(e12, f1);
    }

    public static void N(StringBuilder sb, C0130k8 c0130k8) {
        String I = c0130k8.I();
        if (!i0(c0130k8.c) && !(c0130k8 instanceof C0050e0)) {
            boolean N = C0130k8.N(sb);
            int i = C0308z7.d;
            int length = I.length();
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            while (i2 < length) {
                int codePointAt = I.codePointAt(i2);
                if (!(codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160)) {
                    if (!(codePointAt == 8203 || codePointAt == 173)) {
                        sb.appendCodePoint(codePointAt);
                        z = true;
                        z2 = false;
                    }
                } else if ((!N || z) && !z2) {
                    sb.append(' ');
                    z2 = true;
                }
                i2 += Character.charCount(codePointAt);
            }
            return;
        }
        sb.append(I);
    }

    private static <E extends E1> int a0(E1 e1, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == e1) {
                return i;
            }
        }
        return 0;
    }

    public static boolean i0(@Nullable A5 a5) {
        if (a5 instanceof E1) {
            E1 e1 = (E1) a5;
            int i = 0;
            while (!e1.f.j()) {
                e1 = (E1) e1.c;
                i++;
                if (i < 6) {
                    if (e1 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.A5] */
    @Override // com.github.catvod.spider.merge.A5
    public final A5 F() {
        E1 e1 = this;
        while (true) {
            ?? r1 = e1.c;
            if (r1 == 0) {
                return e1;
            }
            e1 = r1;
        }
    }

    public final E1 L(A5 a5) {
        R0.p(a5);
        A5 a52 = a5.c;
        if (a52 != null) {
            a52.D(a5);
        }
        a5.c = this;
        n();
        this.h.add(a5);
        a5.d = this.h.size() - 1;
        return this;
    }

    public final E1 M(String str) {
        R0.q(this).getClass();
        E1 e1 = new E1(C0022b8.l(str, C0020b6.c), e(), null);
        L(e1);
        return e1;
    }

    public final E1 O(String str) {
        R0.p(str);
        L(new C0130k8(str));
        return this;
    }

    public final E1 P() {
        return Q().get(0);
    }

    public final List<E1> Q() {
        List<E1> list;
        if (h() == 0) {
            return j;
        }
        WeakReference<List<E1>> weakReference = this.g;
        if (weakReference == null || (list = weakReference.get()) == null) {
            int size = this.h.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                A5 a5 = this.h.get(i);
                if (a5 instanceof E1) {
                    arrayList.add((E1) a5);
                }
            }
            this.g = new WeakReference<>(arrayList);
            return arrayList;
        }
        return list;
    }

    public final F1 R() {
        return new F1(Q());
    }

    @Override // com.github.catvod.spider.merge.A5
    /* renamed from: S */
    public E1 j() {
        return (E1) super.clone();
    }

    public final String T() {
        String I;
        StringBuilder a = C0308z7.a();
        for (A5 a5 : this.h) {
            if (a5 instanceof C0123k1) {
                I = ((C0123k1) a5).I();
            } else if (a5 instanceof G0) {
                I = ((G0) a5).I();
            } else if (a5 instanceof E1) {
                I = ((E1) a5).T();
            } else if (a5 instanceof C0050e0) {
                I = ((C0050e0) a5).I();
            }
            a.append(I);
        }
        return C0308z7.g(a);
    }

    public final int U() {
        A5 a5 = this.c;
        if (((E1) a5) == null) {
            return 0;
        }
        return a0(this, ((E1) a5).Q());
    }

    public final F1 V() {
        return C0144la.d(new P1(), this);
    }

    public final boolean W(String str) {
        K k2 = this.i;
        if (k2 == null) {
            return false;
        }
        String k3 = k2.k("class");
        int length = k3.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(k3);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(k3.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && k3.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return k3.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public final boolean X() {
        for (A5 a5 : this.h) {
            if (a5 instanceof C0130k8) {
                if (!((C0130k8) a5).M()) {
                    return true;
                }
            } else if ((a5 instanceof E1) && ((E1) a5).X()) {
                return true;
            }
        }
        return false;
    }

    public final String Y() {
        StringBuilder a = C0308z7.a();
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            this.h.get(i).v(a);
        }
        String g = C0308z7.g(a);
        C0290y1 y = y();
        if (y == null) {
            y = new C0290y1();
        }
        return y.s0().f() ? g.trim() : g;
    }

    public final String Z() {
        K k2 = this.i;
        return k2 != null ? k2.k("id") : "";
    }

    public final boolean b0() {
        return this.f.c();
    }

    @Nullable
    public final E1 c0() {
        A5 a5 = this.c;
        if (a5 == null) {
            return null;
        }
        List<E1> Q = ((E1) a5).Q();
        int a0 = a0(this, Q) + 1;
        if (Q.size() > a0) {
            return Q.get(a0);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final K d() {
        if (this.i == null) {
            this.i = new K();
        }
        return this.i;
    }

    public final void d0() {
        this.g = null;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final String e() {
        String str = k;
        for (E1 e1 = this; e1 != null; e1 = (E1) e1.c) {
            K k2 = e1.i;
            if (k2 != null) {
                if (k2.o(str) != -1) {
                    return e1.i.j(str);
                }
            }
        }
        return "";
    }

    public final String e0() {
        return this.f.i();
    }

    public final String f0() {
        StringBuilder a = C0308z7.a();
        for (A5 a5 : this.h) {
            if (a5 instanceof C0130k8) {
                N(a, (C0130k8) a5);
            } else if ((a5 instanceof E1) && ((E1) a5).f.b().equals("br") && !C0130k8.N(a)) {
                a.append(" ");
            }
        }
        return C0308z7.g(a).trim();
    }

    public final E1 g0() {
        return (E1) this.c;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final int h() {
        return this.h.size();
    }

    public final F1 h0() {
        F1 f1 = new F1();
        K(this, f1);
        return f1;
    }

    @Nullable
    public final E1 j0() {
        List<E1> Q;
        int a0;
        A5 a5 = this.c;
        if (a5 != null && (a0 = a0(this, (Q = ((E1) a5).Q()))) > 0) {
            return Q.get(a0 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final A5 k(@Nullable A5 a5) {
        E1 e1 = (E1) super.k(a5);
        K k2 = this.i;
        e1.i = k2 != null ? k2.clone() : null;
        D1 d1 = new D1(e1, this.h.size());
        e1.h = d1;
        d1.addAll(this.h);
        return e1;
    }

    public final F1 k0(String str) {
        R0.n(str);
        AbstractC0255v2 h = F6.h(str);
        R0.p(h);
        return C0144la.d(h, this);
    }

    @Override // com.github.catvod.spider.merge.A5
    protected final void l(String str) {
        d().t(k, str);
    }

    public final F1 l0() {
        A5 a5 = this.c;
        if (a5 == null) {
            return new F1(0);
        }
        List<E1> Q = ((E1) a5).Q();
        F1 f1 = new F1(Q.size() - 1);
        for (E1 e1 : Q) {
            if (e1 != this) {
                f1.add(e1);
            }
        }
        return f1;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final A5 m() {
        this.h.clear();
        return this;
    }

    public final C0022b8 m0() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final List<A5> n() {
        if (this.h == A5.e) {
            this.h = new D1(this, 4);
        }
        return this.h;
    }

    public final String n0() {
        return this.f.b();
    }

    public E1 o0(String str) {
        R0.p(str);
        this.h.clear();
        C0290y1 y = y();
        L((y == null || !y.u0().b(e0())) ? new C0130k8(str) : new C0123k1(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.A5
    protected final boolean p() {
        return this.i != null;
    }

    public final String p0() {
        StringBuilder a = C0308z7.a();
        C0305z4.o(new C1(a), this);
        return C0308z7.g(a).trim();
    }

    public final List<C0130k8> q0() {
        ArrayList arrayList = new ArrayList();
        for (A5 a5 : this.h) {
            if (a5 instanceof C0130k8) {
                arrayList.add((C0130k8) a5);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.merge.A5
    public String t() {
        return this.f.b();
    }

    @Override // com.github.catvod.spider.merge.A5
    public void w(Appendable appendable, int i, C0278x1 c0278x1) {
        E1 e1;
        E1 e12;
        if (c0278x1.f()) {
            boolean z = false;
            if (this.f.a() || ((e12 = (E1) this.c) != null && e12.f.a())) {
                if (this.f.f() && !this.f.d() && ((e1 = (E1) this.c) == null || e1.b0())) {
                    A5 a5 = this.c;
                    A5 a52 = null;
                    if (a5 != null && this.d > 0) {
                        a52 = a5.n().get(this.d - 1);
                    }
                    if (a52 != null) {
                        z = true;
                    }
                }
                if (!z && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
                    r(appendable, i, c0278x1);
                }
            }
        }
        appendable.append('<').append(n0());
        K k2 = this.i;
        if (k2 != null) {
            k2.n(appendable, c0278x1);
        }
        if (this.h.isEmpty() && this.f.h() && (c0278x1.g() != 1 || !this.f.d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override // com.github.catvod.spider.merge.A5
    public void x(Appendable appendable, int i, C0278x1 c0278x1) {
        if (this.h.isEmpty() && this.f.h()) {
            return;
        }
        if (c0278x1.f() && !this.h.isEmpty() && this.f.a()) {
            r(appendable, i, c0278x1);
        }
        appendable.append("</").append(n0()).append('>');
    }

    @Override // com.github.catvod.spider.merge.A5
    public final A5 z() {
        return (E1) this.c;
    }

    public E1(String str) {
        this(C0022b8.l(str, C0020b6.d), "", null);
    }
}
