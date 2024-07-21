package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class D4 {
    private Object a;

    public D4(Object obj) {
        this.a = obj;
    }

    public final String a() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof E1) {
            E1 e1 = (E1) obj;
            String n0 = e1.n0();
            return n0 == "JX_TEXT" || (n0 != null && n0.equals("JX_TEXT")) ? e1.f0() : e1.u();
        }
        return String.valueOf(obj);
    }

    public final List<D4> b(String str) {
        if (this.a instanceof E1) {
            return new C4(new F1((E1) this.a)).b(str);
        }
        return null;
    }

    public final D4 c(String str) {
        List<D4> b = b(str);
        if (b != null) {
            LinkedList linkedList = (LinkedList) b;
            if (linkedList.size() > 0) {
                return (D4) linkedList.get(0);
            }
            return null;
        }
        return null;
    }

    public final String toString() {
        return a();
    }
}
