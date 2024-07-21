package com.github.catvod.spider.merge;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class F2 extends E2 {
    private ExecutorC0015b1 e = new ExecutorC0015b1(C0070f8.b, C0070f8.c, C0070f8.d, "DefaultDispatcher");

    public final void f(Runnable runnable, InterfaceC0046d8 interfaceC0046d8, boolean z) {
        try {
            this.e.d(runnable, interfaceC0046d8, z);
        } catch (RejectedExecutionException unused) {
            RunnableC0195q1.k.l(this.e.b(runnable, interfaceC0046d8));
        }
    }
}
