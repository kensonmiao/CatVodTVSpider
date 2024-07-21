package com.github.catvod.spider.merge;

import java.util.Queue;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class B2 implements InterfaceC0091h5 {
    String c;
    V7 d;
    Queue<X7> e;

    public B2(V7 v7, Queue<X7> queue) {
        this.d = v7;
        this.c = v7.b();
        this.e = queue;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0091h5
    public final void a(String str, Throwable th) {
        X7 x7 = new X7();
        System.currentTimeMillis();
        x7.a = this.d;
        Thread.currentThread().getName();
        this.e.add(x7);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0091h5
    public final String b() {
        return this.c;
    }
}
