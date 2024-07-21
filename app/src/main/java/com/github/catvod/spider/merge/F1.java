package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class F1 extends ArrayList<E1> {
    public F1() {
    }

    public F1(int i) {
        super(i);
    }

    public F1(List<E1> list) {
        super(list);
    }

    public F1(E1... e1Arr) {
        super(Arrays.asList(e1Arr));
    }

    public final String a(String str) {
        Iterator<E1> it = iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            if (next.o(str)) {
                return next.c(str);
            }
        }
        return "";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E1> it = iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            if (next.X()) {
                arrayList.add(next.p0());
            }
        }
        return arrayList;
    }

    public final String c() {
        StringBuilder a = C0308z7.a();
        Iterator<E1> it = iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            if (a.length() != 0) {
                a.append("\n");
            }
            a.append(next.Y());
        }
        return C0308z7.g(a);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        F1 f1 = new F1(size());
        Iterator<E1> it = iterator();
        while (it.hasNext()) {
            f1.add(it.next().j());
        }
        return f1;
    }

    @Nullable
    public final E1 d() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public final F1 e(String str) {
        R0.n(str);
        AbstractC0255v2 h = F6.h(str);
        F1 f1 = new F1();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<E1> it = iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            R0.p(h);
            R0.p(next);
            Iterator<E1> it2 = C0144la.d(h, next).iterator();
            while (it2.hasNext()) {
                E1 next2 = it2.next();
                if (identityHashMap.put(next2, Boolean.TRUE) == null) {
                    f1.add(next2);
                }
            }
        }
        return f1;
    }

    public final String f() {
        StringBuilder a = C0308z7.a();
        Iterator<E1> it = iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            if (a.length() != 0) {
                a.append(" ");
            }
            a.append(next.p0());
        }
        return C0308z7.g(a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder a = C0308z7.a();
        Iterator<E1> it = iterator();
        while (it.hasNext()) {
            E1 next = it.next();
            if (a.length() != 0) {
                a.append("\n");
            }
            a.append(next.u());
        }
        return C0308z7.g(a);
    }
}
