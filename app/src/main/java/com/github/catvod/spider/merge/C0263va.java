package com.github.catvod.spider.merge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.va  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0263va {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C0263va.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C0263va.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C0263va.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C0263va.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<AbstractRunnableC0034c8> a = new AtomicReferenceArray<>(128);
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;
    private volatile int consumerIndex = 0;
    private volatile int blockingTasksInBuffer = 0;

    private final AbstractRunnableC0034c8 b(AbstractRunnableC0034c8 abstractRunnableC0034c8) {
        if (abstractRunnableC0034c8.d.b() == 1) {
            e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return abstractRunnableC0034c8;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, abstractRunnableC0034c8);
        c.incrementAndGet(this);
        return null;
    }

    private final AbstractRunnableC0034c8 f() {
        AbstractRunnableC0034c8 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                if (andSet.d.b() == 1) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    private final long i(C0263va c0263va, boolean z) {
        AbstractRunnableC0034c8 abstractRunnableC0034c8;
        boolean z2;
        do {
            abstractRunnableC0034c8 = (AbstractRunnableC0034c8) c0263va.lastScheduledTask;
            if (abstractRunnableC0034c8 == null) {
                return -2L;
            }
            z2 = true;
            if (z) {
                if (!(abstractRunnableC0034c8.d.b() == 1)) {
                    return -2L;
                }
            }
            C0070f8.e.getClass();
            long nanoTime = System.nanoTime() - abstractRunnableC0034c8.c;
            long j = C0070f8.a;
            if (nanoTime < j) {
                return j - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(c0263va, abstractRunnableC0034c8, null)) {
                    if (atomicReferenceFieldUpdater.get(c0263va) != abstractRunnableC0034c8) {
                        z2 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z2);
        a(abstractRunnableC0034c8, false);
        return -1L;
    }

    public final AbstractRunnableC0034c8 a(AbstractRunnableC0034c8 abstractRunnableC0034c8, boolean z) {
        if (z) {
            return b(abstractRunnableC0034c8);
        }
        AbstractRunnableC0034c8 abstractRunnableC0034c82 = (AbstractRunnableC0034c8) b.getAndSet(this, abstractRunnableC0034c8);
        if (abstractRunnableC0034c82 != null) {
            return b(abstractRunnableC0034c82);
        }
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final void d(K3 k3) {
        boolean z;
        AbstractRunnableC0034c8 abstractRunnableC0034c8 = (AbstractRunnableC0034c8) b.getAndSet(this, null);
        if (abstractRunnableC0034c8 != null) {
            k3.a(abstractRunnableC0034c8);
        }
        do {
            AbstractRunnableC0034c8 f = f();
            if (f != null) {
                k3.a(f);
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
        } while (z);
    }

    public final AbstractRunnableC0034c8 e() {
        AbstractRunnableC0034c8 abstractRunnableC0034c8 = (AbstractRunnableC0034c8) b.getAndSet(this, null);
        return abstractRunnableC0034c8 != null ? abstractRunnableC0034c8 : f();
    }

    public final long g(C0263va c0263va) {
        int i = c0263va.consumerIndex;
        int i2 = c0263va.producerIndex;
        AtomicReferenceArray<AbstractRunnableC0034c8> atomicReferenceArray = c0263va.a;
        while (true) {
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (c0263va.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC0034c8 abstractRunnableC0034c8 = atomicReferenceArray.get(i3);
            if (abstractRunnableC0034c8 != null) {
                if ((abstractRunnableC0034c8.d.b() == 1) && atomicReferenceArray.compareAndSet(i3, abstractRunnableC0034c8, null)) {
                    e.decrementAndGet(c0263va);
                    a(abstractRunnableC0034c8, false);
                    return -1L;
                }
            }
            i++;
        }
        return i(c0263va, true);
    }

    public final long h(C0263va c0263va) {
        AbstractRunnableC0034c8 f = c0263va.f();
        if (f != null) {
            a(f, false);
            return -1L;
        }
        return i(c0263va, false);
    }
}
