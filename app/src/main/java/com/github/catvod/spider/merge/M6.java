package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0121k;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class M6<Symbol, ATNInterpreter extends AbstractC0121k> {
    protected ATNInterpreter b;
    private List<InterfaceC0013b> a = new L6();
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract C0025c f();

    public final InterfaceC0013b g() {
        return new C6(this.a);
    }

    public final ATNInterpreter h() {
        return this.b;
    }

    public final int i() {
        return this.c;
    }

    public boolean j(int i) {
        return true;
    }

    public final void k(int i) {
        this.c = i;
    }
}
