package com.github.catvod.spider.merge;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.github.catvod.spider.merge.b1  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class ExecutorC0015b1 implements Executor, Closeable {
    private volatile int _isTerminated;
    public final K3 c;
    volatile long controlState;
    public final K3 d;
    public final AtomicReferenceArray<C0003a1> e;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    private volatile long parkedWorkersStack;
    public static final Z7 m = new Z7("NOT_IN_STACK");
    private static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(ExecutorC0015b1.class, "parkedWorkersStack");
    static final AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(ExecutorC0015b1.class, "controlState");
    private static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0015b1.class, "_isTerminated");

    public ExecutorC0015b1(int i, int i2, long j2, String str) {
        this.f = i;
        this.g = i2;
        this.h = j2;
        this.i = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.c = new K3();
        this.d = new K3();
        this.parkedWorkersStack = 0L;
        this.e = new AtomicReferenceArray<>(i2 + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    private final int a() {
        int i;
        synchronized (this.e) {
            if (e()) {
                i = -1;
            } else {
                long j2 = this.controlState;
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f) {
                    return 0;
                }
                if (i2 >= this.g) {
                    return 0;
                }
                int i4 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i4 > 0 && this.e.get(i4) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C0003a1 c0003a1 = new C0003a1(this, i4);
                this.e.set(i4, c0003a1);
                if (!(i4 == ((int) (2097151 & k.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c0003a1.start();
                i = i3 + 1;
            }
            return i;
        }
    }

    private final C0003a1 c() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C0003a1)) {
            currentThread = null;
        }
        C0003a1 c0003a1 = (C0003a1) currentThread;
        if (c0003a1 == null || !C0305z4.d(c0003a1.i, this)) {
            return null;
        }
        return c0003a1;
    }

    private final int f(C0003a1 c0003a1) {
        int b;
        do {
            Object c = c0003a1.c();
            if (c == m) {
                return -1;
            }
            if (c == null) {
                return 0;
            }
            c0003a1 = (C0003a1) c;
            b = c0003a1.b();
        } while (b == 0);
        return b;
    }

    private final boolean j(long j2) {
        int i = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f) {
            int a = a();
            if (a == 1 && this.f > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean k() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            C0003a1 c0003a1 = this.e.get((int) (2097151 & j2));
            if (c0003a1 != null) {
                long j3 = (2097152 + j2) & (-2097152);
                int f = f(c0003a1);
                if (f >= 0 && j.compareAndSet(this, j2, f | j3)) {
                    c0003a1.g(m);
                }
            } else {
                c0003a1 = null;
            }
            if (c0003a1 == null) {
                return false;
            }
            if (C0003a1.j.compareAndSet(c0003a1, -1, 0)) {
                LockSupport.unpark(c0003a1);
                return true;
            }
        }
    }

    public final AbstractRunnableC0034c8 b(Runnable runnable, InterfaceC0046d8 interfaceC0046d8) {
        C0070f8.e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC0034c8) {
            AbstractRunnableC0034c8 abstractRunnableC0034c8 = (AbstractRunnableC0034c8) runnable;
            abstractRunnableC0034c8.c = nanoTime;
            abstractRunnableC0034c8.d = interfaceC0046d8;
            return abstractRunnableC0034c8;
        }
        return new C0058e8(runnable, nanoTime, interfaceC0046d8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r1 != null) goto L25;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.github.catvod.spider.merge.ExecutorC0015b1.l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            com.github.catvod.spider.merge.a1 r0 = r7.c()
            java.util.concurrent.atomic.AtomicReferenceArray<com.github.catvod.spider.merge.a1> r1 = r7.e
            monitor-enter(r1)
            long r3 = r7.controlState     // Catch: java.lang.Throwable -> L8e
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L46
            r1 = 1
        L1e:
            java.util.concurrent.atomic.AtomicReferenceArray<com.github.catvod.spider.merge.a1> r3 = r7.e
            java.lang.Object r3 = r3.get(r1)
            com.github.catvod.spider.merge.C0305z4.f(r3)
            com.github.catvod.spider.merge.a1 r3 = (com.github.catvod.spider.merge.C0003a1) r3
            if (r3 == r0) goto L41
        L2b:
            boolean r5 = r3.isAlive()
            if (r5 == 0) goto L3a
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r5 = 10000(0x2710, double:4.9407E-320)
            r3.join(r5)
            goto L2b
        L3a:
            com.github.catvod.spider.merge.va r3 = r3.c
            com.github.catvod.spider.merge.K3 r5 = r7.d
            r3.d(r5)
        L41:
            if (r1 == r4) goto L46
            int r1 = r1 + 1
            goto L1e
        L46:
            com.github.catvod.spider.merge.K3 r1 = r7.d
            r1.b()
            com.github.catvod.spider.merge.K3 r1 = r7.c
            r1.b()
        L50:
            if (r0 == 0) goto L59
            com.github.catvod.spider.merge.c8 r1 = r0.a(r2)
            if (r1 == 0) goto L59
            goto L61
        L59:
            com.github.catvod.spider.merge.K3 r1 = r7.c
            java.lang.Object r1 = r1.d()
            com.github.catvod.spider.merge.c8 r1 = (com.github.catvod.spider.merge.AbstractRunnableC0034c8) r1
        L61:
            if (r1 == 0) goto L64
            goto L6c
        L64:
            com.github.catvod.spider.merge.K3 r1 = r7.d
            java.lang.Object r1 = r1.d()
            com.github.catvod.spider.merge.c8 r1 = (com.github.catvod.spider.merge.AbstractRunnableC0034c8) r1
        L6c:
            if (r1 == 0) goto L81
            r1.run()     // Catch: java.lang.Throwable -> L72
            goto L50
        L72:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L7f
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L7f
            r4.uncaughtException(r3, r1)     // Catch: java.lang.Throwable -> L7f
            goto L50
        L7f:
            r0 = move-exception
            throw r0
        L81:
            if (r0 == 0) goto L87
            r1 = 5
            r0.h(r1)
        L87:
            r0 = 0
            r7.parkedWorkersStack = r0
            r7.controlState = r0
        L8d:
            return
        L8e:
            r0 = move-exception
            monitor-exit(r1)
            goto L92
        L91:
            throw r0
        L92:
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.ExecutorC0015b1.close():void");
    }

    public final void d(Runnable runnable, InterfaceC0046d8 interfaceC0046d8, boolean z) {
        AbstractRunnableC0034c8 abstractRunnableC0034c8;
        AbstractRunnableC0034c8 b = b(runnable, interfaceC0046d8);
        C0003a1 c = c();
        boolean z2 = true;
        if (c == null || c.d == 5 || (b.d.b() == 0 && c.d == 2)) {
            abstractRunnableC0034c8 = b;
        } else {
            c.h = true;
            abstractRunnableC0034c8 = c.c.a(b, z);
        }
        if (abstractRunnableC0034c8 != null) {
            if (!(abstractRunnableC0034c8.d.b() == 1 ? this.d : this.c).a(abstractRunnableC0034c8)) {
                throw new RejectedExecutionException(C0158n0.a(new StringBuilder(), this.i, " was terminated"));
            }
        }
        z2 = (!z || c == null) ? false : false;
        if (b.d.b() == 0) {
            if (z2 || k() || j(this.controlState)) {
                return;
            }
            k();
            return;
        }
        long addAndGet = k.addAndGet(this, 2097152L);
        if (z2 || k() || j(addAndGet)) {
            return;
        }
        k();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean e() {
        return this._isTerminated;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(runnable, D5.c, false);
    }

    public final boolean g(C0003a1 c0003a1) {
        long j2;
        int b;
        if (c0003a1.c() != m) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            b = c0003a1.b();
            c0003a1.g(this.e.get((int) (2097151 & j2)));
        } while (!j.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | b));
        return true;
    }

    public final void h(C0003a1 c0003a1, int i, int i2) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? f(c0003a1) : i2;
            }
            if (i3 >= 0 && j.compareAndSet(this, j2, j3 | i3)) {
                return;
            }
        }
    }

    public final void i() {
        if (k() || j(this.controlState)) {
            return;
        }
        k();
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        int length = this.e.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C0003a1 c0003a1 = this.e.get(i6);
            if (c0003a1 != null) {
                int c = c0003a1.c.c();
                int b = C0158n0.b(c0003a1.d);
                if (b == 0) {
                    i++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(c));
                    str = "c";
                } else if (b == 1) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(c));
                    str = "b";
                } else if (b == 2) {
                    i3++;
                } else if (b == 3) {
                    i4++;
                    if (c > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(c));
                        str = "d";
                    }
                } else if (b == 4) {
                    i5++;
                }
                sb.append(str);
                arrayList.add(sb.toString());
            }
        }
        long j2 = this.controlState;
        return this.i + '@' + E.e(this) + "[Pool Size {core = " + this.f + ", max = " + this.g + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.c.c() + ", global blocking queue size = " + this.d.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }
}
