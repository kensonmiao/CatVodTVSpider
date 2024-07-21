package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.m  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0145m implements T0 {
    private final U0<?> c;

    public AbstractC0145m(U0<?> u0) {
        this.c = u0;
    }

    @Override // com.github.catvod.spider.merge.T0
    public <E extends T0> E c(U0<E> u0) {
        C0305z4.h(u0, "key");
        if (C0305z4.d(this.c, u0)) {
            return this;
        }
        return null;
    }

    public final U0<?> e() {
        return this.c;
    }
}
