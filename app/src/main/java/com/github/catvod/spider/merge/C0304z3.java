package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.z3 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0304z3<K, V> implements Map<K, V> {
    protected final AbstractC0169o c;
    protected int e = 0;
    protected int f = 12;
    protected LinkedList<C0292y3<K, V>>[] d = new LinkedList[8];

    public C0304z3(AbstractC0169o abstractC0169o) {
        this.c = abstractC0169o;
    }

    @Override // java.util.Map
    public final void clear() {
        this.d = new LinkedList[16];
        this.e = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int F = this.c.F(obj);
        LinkedList<C0292y3<K, V>>[] linkedListArr = this.d;
        LinkedList<C0292y3<K, V>> linkedList = linkedListArr[F & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        Iterator<C0292y3<K, V>> it = linkedList.iterator();
        while (it.hasNext()) {
            C0292y3<K, V> next = it.next();
            if (this.c.E(next.a, obj)) {
                return next.b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        LinkedList<C0292y3<K, V>>[] linkedListArr;
        C0292y3<K, V> next;
        int i = 0;
        for (LinkedList<C0292y3<K, V>> linkedList : this.d) {
            if (linkedList != null) {
                Iterator<C0292y3<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    i = D5.o(i, this.c.F(next.a));
                }
            }
        }
        return D5.k(i, this.e);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        C0292y3<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.e > this.f) {
            LinkedList<C0292y3<K, V>>[] linkedListArr = this.d;
            int length = linkedListArr.length * 2;
            this.d = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f = (int) (d * 0.75d);
            int i = this.e;
            for (LinkedList<C0292y3<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<C0292y3<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.a, next.b);
                    }
                }
            }
            this.e = i;
        }
        int F = this.c.F(k);
        LinkedList<C0292y3<K, V>>[] linkedListArr2 = this.d;
        int length2 = F & (linkedListArr2.length - 1);
        LinkedList<C0292y3<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        Iterator<C0292y3<K, V>> it2 = linkedList2.iterator();
        while (it2.hasNext()) {
            C0292y3<K, V> next2 = it2.next();
            if (this.c.E(next2.a, k)) {
                V v2 = next2.b;
                next2.b = v;
                this.e++;
                return v2;
            }
        }
        linkedList2.add(new C0292y3<>(k, v));
        this.e++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }

    public final String toString() {
        LinkedList<C0292y3<K, V>>[] linkedListArr;
        C0292y3<K, V> next;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<C0292y3<K, V>> linkedList : this.d) {
            if (linkedList != null) {
                Iterator<C0292y3<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(next.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        LinkedList<C0292y3<K, V>>[] linkedListArr;
        ArrayList arrayList = new ArrayList(this.e);
        for (LinkedList<C0292y3<K, V>> linkedList : this.d) {
            if (linkedList != null) {
                Iterator<C0292y3<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b);
                }
            }
        }
        return arrayList;
    }
}
