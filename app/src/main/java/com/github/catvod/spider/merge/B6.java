package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final /* synthetic */ class B6 {
    public static boolean a(C0085h c0085h) {
        Iterator<C0037d> it = c0085h.iterator();
        while (it.hasNext()) {
            if (!(it.next().a instanceof V6)) {
                return false;
            }
        }
        return true;
    }

    public static Collection b(C0085h c0085h) {
        A6 a6 = new A6();
        Iterator<C0037d> it = c0085h.iterator();
        while (it.hasNext()) {
            C0037d next = it.next();
            BitSet bitSet = (BitSet) a6.get(next);
            if (bitSet == null) {
                bitSet = new BitSet();
                a6.put(next, bitSet);
            }
            bitSet.set(next.b);
        }
        return a6.values();
    }

    public static int c(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.set(((BitSet) it.next()).nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }

    public static HashMap d(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static HashMap e(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }
}
