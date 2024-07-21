package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.github.catvod.spider.merge.y4 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0293y4 implements InterfaceC0233t4 {
    protected List<C0281x4> a;
    protected boolean b;

    static {
        g(0, 1114111).i();
        new C0293y4(new int[0]).i();
    }

    public C0293y4(int... iArr) {
        this.a = new ArrayList(iArr.length);
        for (int i : iArr) {
            a(i);
        }
    }

    public static C0293y4 g(int i, int i2) {
        C0293y4 c0293y4 = new C0293y4(new int[0]);
        c0293y4.b(i, i2);
        return c0293y4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public static C0293y4 k(C0293y4 c0293y4, C0293y4 c0293y42) {
        int i = 0;
        if (c0293y4.f()) {
            return new C0293y4(new int[0]);
        }
        C0293y4 c0293y43 = new C0293y4(new int[0]);
        c0293y43.c(c0293y4);
        if (!c0293y42.f()) {
            int i2 = 0;
            while (i < c0293y43.a.size() && i2 < c0293y42.a.size()) {
                C0281x4 c0281x4 = (C0281x4) c0293y43.a.get(i);
                C0281x4 c0281x42 = (C0281x4) c0293y42.a.get(i2);
                int i3 = c0281x42.b;
                int i4 = c0281x4.a;
                if (i3 >= i4) {
                    int i5 = c0281x42.a;
                    int i6 = c0281x4.b;
                    if (i5 <= i6) {
                        C0281x4 c0281x43 = i5 > i4 ? new C0281x4(i4, i5 - 1) : null;
                        C0281x4 c0281x44 = i3 < i6 ? new C0281x4(i3 + 1, i6) : null;
                        ?? r2 = c0293y43.a;
                        if (c0281x43 != null) {
                            r2.set(i, c0281x43);
                            if (c0281x44 != null) {
                                i++;
                                c0293y43.a.add(i, c0281x44);
                            }
                        } else if (c0281x44 != null) {
                            r2.set(i, c0281x44);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c0293y43;
    }

    public final void a(int i) {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        b(i, i);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final void b(int i, int i2) {
        C0281x4 b = C0281x4.b(i, i2);
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (b.b < b.a) {
            return;
        }
        ListIterator listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            C0281x4 c0281x4 = (C0281x4) listIterator.next();
            if (b.equals(c0281x4)) {
                return;
            }
            boolean z = true;
            if ((b.a == c0281x4.b + 1 || b.b == c0281x4.a - 1) || !b.a(c0281x4)) {
                C0281x4 c = b.c(c0281x4);
                listIterator.set(c);
                while (listIterator.hasNext()) {
                    C0281x4 c0281x42 = (C0281x4) listIterator.next();
                    if (!(c.a == c0281x42.b + 1 || c.b == c0281x42.a - 1) && c.a(c0281x42)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(c.c(c0281x42));
                    listIterator.next();
                }
                return;
            }
            int i3 = b.a;
            int i4 = c0281x4.a;
            if (i3 >= i4 || b.b >= i4) {
                z = false;
                continue;
            }
            if (z) {
                listIterator.previous();
                listIterator.add(b);
                return;
            }
        }
        this.a.add(b);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final C0293y4 c(InterfaceC0233t4 interfaceC0233t4) {
        if (interfaceC0233t4 == null) {
            return this;
        }
        int i = 0;
        if (interfaceC0233t4 instanceof C0293y4) {
            C0293y4 c0293y4 = (C0293y4) interfaceC0233t4;
            int size = c0293y4.a.size();
            while (i < size) {
                C0281x4 c0281x4 = (C0281x4) c0293y4.a.get(i);
                b(c0281x4.a, c0281x4.b);
                i++;
            }
        } else {
            C0293y4 c0293y42 = (C0293y4) interfaceC0233t4;
            ArrayList arrayList = new ArrayList();
            int size2 = c0293y42.a.size();
            while (i < size2) {
                C0281x4 c0281x42 = (C0281x4) c0293y42.a.get(i);
                int i2 = c0281x42.b;
                for (int i3 = c0281x42.a; i3 <= i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(((Integer) it.next()).intValue());
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final boolean d(int i) {
        int size = this.a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C0281x4 c0281x4 = (C0281x4) this.a.get(i3);
            int i4 = c0281x4.a;
            if (c0281x4.b < i) {
                i2 = i3 + 1;
            } else if (i4 <= i) {
                return true;
            } else {
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final int e() {
        if (f()) {
            throw new RuntimeException("set is empty");
        }
        return ((C0281x4) this.a.get(0)).a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0293y4)) {
            return false;
        }
        return this.a.equals(((C0293y4) obj).a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final boolean f() {
        ?? r0 = this.a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final void h() {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            C0281x4 c0281x4 = (C0281x4) this.a.get(i);
            int i2 = c0281x4.a;
            int i3 = c0281x4.b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.a.remove(i);
                return;
            } else if (-2 == i2) {
                c0281x4.a = i2 + 1;
                return;
            } else if (-2 == i3) {
                c0281x4.b = i3 - 1;
                return;
            } else {
                if (-2 > i2 && -2 < i3) {
                    c0281x4.b = -3;
                    b(-1, i3);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final int hashCode() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0281x4 c0281x4 = (C0281x4) it.next();
            i = D5.o(D5.o(i, c0281x4.a), c0281x4.b);
        }
        return D5.k(i, this.a.size() * 2);
    }

    public final void i() {
        boolean z = this.b;
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final int j() {
        int size = this.a.size();
        if (size == 1) {
            C0281x4 c0281x4 = (C0281x4) this.a.get(0);
            return (c0281x4.b - c0281x4.a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0281x4 c0281x42 = (C0281x4) this.a.get(i2);
            i += (c0281x42.b - c0281x42.a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final String l(InterfaceC0227sa interfaceC0227sa) {
        String a;
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (j() > 1) {
            sb.append("{");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C0281x4 c0281x4 = (C0281x4) it.next();
            int i = c0281x4.a;
            int i2 = c0281x4.b;
            String str = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    str = "<EOF>";
                } else if (i != -2) {
                    str = ((C0239ta) interfaceC0227sa).a(i);
                }
                sb.append(str);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        a = "<EOF>";
                    } else {
                        a = i3 == -2 ? "<EPSILON>" : ((C0239ta) interfaceC0227sa).a(i3);
                    }
                    sb.append(a);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.x4>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (j() > 1) {
            sb.append("{");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C0281x4 c0281x4 = (C0281x4) it.next();
            int i = c0281x4.a;
            int i2 = c0281x4.b;
            if (i != i2) {
                sb.append(i);
                sb.append("..");
                sb.append(i2);
            } else if (i == -1) {
                sb.append("<EOF>");
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }
}
