package com.github.catvod.spider.merge;

import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C4 {
    private F1 a;

    public C4(F1 f1) {
        this.a = f1;
    }

    public static C4 a(String str) {
        return new C4(D5.n(str).R());
    }

    public final List<D4> b(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            C0170o0 b = C0182p0.b(str.length());
            CharBuffer allocate = CharBuffer.allocate(str.length());
            allocate.put(str);
            allocate.flip();
            b.a(allocate);
            eb ebVar = new eb(new K0(new Ba(AbstractC0229t0.k(b.d()))));
            ebVar.v(new C0266w1());
            Aa aa = (Aa) ebVar.H().d(new gb(this.a));
            if (aa.n()) {
                Iterator<E1> it = aa.d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new D4(it.next()));
                }
                return linkedList;
            } else if (aa.p()) {
                for (String str2 : aa.e()) {
                    linkedList.add(new D4(str2));
                }
                return linkedList;
            } else if (aa.r()) {
                linkedList.add(new D4(aa.g()));
                return linkedList;
            } else if (aa.q()) {
                linkedList.add(new D4(aa.c()));
                return linkedList;
            } else if (aa.l()) {
                linkedList.add(new D4(aa.a()));
                return linkedList;
            } else if (aa.m()) {
                linkedList.add(new D4(aa.b()));
                return linkedList;
            } else {
                linkedList.add(new D4(aa.g()));
                return linkedList;
            }
        } catch (Exception e) {
            StringBuilder a = A.a("Please check the syntax of your xpath expr or commit a ");
            a.append(D5.l(e));
            throw new hb(a.toString(), e);
        }
    }
}
