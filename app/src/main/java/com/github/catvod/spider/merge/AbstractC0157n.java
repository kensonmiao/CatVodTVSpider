package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.T0;

/* renamed from: com.github.catvod.spider.merge.n  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0157n<B extends T0, E extends B> implements U0<E> {
    private final U0<?> c;
    private final G3<T0, E> d;

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.github.catvod.spider.merge.U0<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.github.catvod.spider.merge.G3<? super com.github.catvod.spider.merge.T0, ? extends E extends B>, com.github.catvod.spider.merge.G3<com.github.catvod.spider.merge.T0, E extends B>] */
    public AbstractC0157n(U0<B> u0, G3<? super T0, ? extends E> g3) {
        C0305z4.h(u0, "baseKey");
        this.d = g3;
        this.c = u0 instanceof AbstractC0157n ? (U0<B>) ((AbstractC0157n) u0).c : u0;
    }

    public final boolean a(U0<?> u0) {
        C0305z4.h(u0, "key");
        return u0 == this || this.c == u0;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/T0;)TE; */
    public final T0 b(T0 t0) {
        C0305z4.h(t0, "element");
        return (T0) this.d.a(t0);
    }
}
