package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.k7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0129k7 extends C0153m7 {
    public static InterfaceC0117j7 m(Iterator it) {
        C0305z4.h(it, "$this$asSequence");
        C0141l7 c0141l7 = new C0141l7(it);
        return c0141l7 instanceof O0 ? c0141l7 : new O0(c0141l7);
    }

    public static List n(InterfaceC0117j7 interfaceC0117j7) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : interfaceC0117j7) {
            arrayList.add(obj);
        }
        return C0265w0.w(arrayList);
    }
}
