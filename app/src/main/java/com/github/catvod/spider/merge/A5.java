package com.github.catvod.spider.merge;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class A5 implements Cloneable {
    static final List<A5> e = Collections.emptyList();
    @Nullable
    A5 c;
    int d;

    private void B(int i) {
        List<A5> n = n();
        while (i < n.size()) {
            n.get(i).d = i;
            i++;
        }
    }

    @Nullable
    public final A5 A() {
        return this.c;
    }

    public final void C() {
        R0.p(this.c);
        this.c.D(this);
    }

    public void D(A5 a5) {
        R0.m(a5.c == this);
        int i = a5.d;
        n().remove(i);
        B(i);
        a5.c = null;
    }

    public final void E(A5 a5) {
        R0.p(this.c);
        A5 a52 = this.c;
        a52.getClass();
        R0.m(this.c == a52);
        A5 a53 = a5.c;
        if (a53 != null) {
            a53.D(a5);
        }
        int i = this.d;
        a52.n().set(i, a5);
        a5.c = a52;
        a5.d = i;
        this.c = null;
    }

    public A5 F() {
        A5 a5 = this;
        while (true) {
            A5 a52 = a5.c;
            if (a52 == null) {
                return a5;
            }
            a5 = a52;
        }
    }

    public final void G(String str) {
        l(str);
    }

    public final int H() {
        return this.d;
    }

    public String a(String str) {
        R0.n(str);
        String str2 = "";
        if (p() && d().m(str)) {
            String e2 = e();
            String k = d().k(str);
            int i = C0308z7.d;
            try {
                try {
                    str2 = C0308z7.h(new URL(e2), k).toExternalForm();
                } catch (MalformedURLException unused) {
                    str2 = new URL(k).toExternalForm();
                }
            } catch (MalformedURLException unused2) {
            }
        }
        return str2;
    }

    public A5 b(String str, String str2) {
        R0.q(this).getClass();
        d().u(C0020b6.c.a(str), str2);
        return this;
    }

    public String c(String str) {
        R0.p(str);
        if (p()) {
            String k = d().k(str);
            return k.length() > 0 ? k : str.startsWith("abs:") ? a(str.substring(4)) : "";
        }
        return "";
    }

    public abstract K d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final A5 f(A5 a5) {
        boolean z;
        R0.p(this.c);
        A5 a52 = this.c;
        int i = this.d;
        int i2 = 1;
        A5[] a5Arr = {a5};
        a52.getClass();
        List<A5> n = a52.n();
        A5 z2 = a5Arr[0].z();
        if (z2 != null && z2.h() == 1) {
            List<A5> n2 = z2.n();
            int i3 = 1;
            while (true) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    z = true;
                    break;
                } else if (a5Arr[i4] != n2.get(i4)) {
                    z = false;
                    break;
                } else {
                    i3 = i4;
                }
            }
            if (z) {
                z2.m();
                n.addAll(i, Arrays.asList(a5Arr));
                while (true) {
                    int i5 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    a5Arr[i5].c = a52;
                    i2 = i5;
                }
                a52.B(i);
                return this;
            }
        }
        for (int i6 = 0; i6 < 1; i6++) {
            if (a5Arr[i6] == null) {
                throw new IllegalArgumentException("Array must not contain any null objects");
            }
        }
        for (int i7 = 0; i7 < 1; i7++) {
            A5 a53 = a5Arr[i7];
            a53.getClass();
            A5 a54 = a53.c;
            if (a54 != null) {
                a54.D(a53);
            }
            a53.c = a52;
        }
        n.addAll(i, Arrays.asList(a5Arr));
        a52.B(i);
        return this;
    }

    public final A5 g(int i) {
        return n().get(i);
    }

    public abstract int h();

    public final List<A5> i() {
        if (h() == 0) {
            return e;
        }
        List<A5> n = n();
        ArrayList arrayList = new ArrayList(n.size());
        arrayList.addAll(n);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* renamed from: j */
    public A5 clone() {
        A5 k = k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(k);
        while (!linkedList.isEmpty()) {
            A5 a5 = (A5) linkedList.remove();
            int h = a5.h();
            for (int i = 0; i < h; i++) {
                List<A5> n = a5.n();
                A5 k2 = n.get(i).k(a5);
                n.set(i, k2);
                linkedList.add(k2);
            }
        }
        return k;
    }

    public A5 k(@Nullable A5 a5) {
        try {
            A5 a52 = (A5) super.clone();
            a52.c = a5;
            a52.d = a5 == null ? 0 : this.d;
            return a52;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    protected abstract void l(String str);

    public abstract A5 m();

    public abstract List<A5> n();

    public final boolean o(String str) {
        R0.p(str);
        if (p()) {
            if (str.startsWith("abs:")) {
                String substring = str.substring(4);
                if (d().m(substring) && !a(substring).isEmpty()) {
                    return true;
                }
            }
            return d().m(str);
        }
        return false;
    }

    protected abstract boolean p();

    public final boolean q() {
        return this.c != null;
    }

    public final void r(Appendable appendable, int i, C0278x1 c0278x1) {
        appendable.append('\n').append(C0308z7.f(c0278x1.d() * i));
    }

    @Nullable
    public final A5 s() {
        A5 a5 = this.c;
        if (a5 == null) {
            return null;
        }
        List<A5> n = a5.n();
        int i = this.d + 1;
        if (n.size() > i) {
            return n.get(i);
        }
        return null;
    }

    public abstract String t();

    public String toString() {
        return u();
    }

    public String u() {
        StringBuilder a = C0308z7.a();
        v(a);
        return C0308z7.g(a);
    }

    public final void v(Appendable appendable) {
        C0290y1 y = y();
        if (y == null) {
            y = new C0290y1();
        }
        C0305z4.o(new C0294y5(appendable, y.s0()), this);
    }

    public abstract void w(Appendable appendable, int i, C0278x1 c0278x1);

    public abstract void x(Appendable appendable, int i, C0278x1 c0278x1);

    @Nullable
    public final C0290y1 y() {
        A5 F = F();
        if (F instanceof C0290y1) {
            return (C0290y1) F;
        }
        return null;
    }

    @Nullable
    public A5 z() {
        return this.c;
    }
}
