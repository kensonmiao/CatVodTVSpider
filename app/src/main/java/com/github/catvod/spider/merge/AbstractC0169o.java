package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.o  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0169o implements InterfaceC0056e6 {
    public abstract boolean E(Object obj, Object obj2);

    public abstract int F(Object obj);

    @Override // com.github.catvod.spider.merge.InterfaceC0056e6
    public void a() {
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0056e6
    public Object f(T6 t6) {
        int f = t6.f();
        Object obj = null;
        for (int i = 0; i < f; i++) {
            obj = t6.e(i).d(this);
        }
        return obj;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0056e6
    public void s() {
    }
}
