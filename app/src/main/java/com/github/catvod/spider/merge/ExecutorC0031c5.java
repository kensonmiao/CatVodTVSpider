package com.github.catvod.spider.merge;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.c5 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class ExecutorC0031c5 extends E2 implements InterfaceC0046d8, Executor {
    private static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0031c5.class, "inFlightTasks");
    private final F2 f;
    private final int g;
    private final String h = "Dispatchers.IO";
    private final int i = 1;
    private final ConcurrentLinkedQueue<Runnable> e = new ConcurrentLinkedQueue<>();
    private volatile int inFlightTasks = 0;

    public ExecutorC0031c5(F2 f2, int i) {
        this.f = f2;
        this.g = i;
    }

    private final void f(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.g) {
                this.f.f(runnable, this, z);
                return;
            }
            this.e.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.g) {
                return;
            }
            runnable = this.e.poll();
        } while (runnable != null);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0046d8
    public final int b() {
        return this.i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0046d8
    public final void d() {
        Runnable poll = this.e.poll();
        if (poll != null) {
            this.f.f(poll, this, true);
            return;
        }
        j.decrementAndGet(this);
        Runnable poll2 = this.e.poll();
        if (poll2 != null) {
            f(poll2, true);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(runnable, false);
    }

    @Override // com.github.catvod.spider.merge.Y0
    public final String toString() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f + ']';
    }
}
