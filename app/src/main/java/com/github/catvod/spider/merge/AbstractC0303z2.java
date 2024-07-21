package com.github.catvod.spider.merge;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.github.catvod.spider.merge.z2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0303z2 extends A2 {
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(AbstractC0303z2.class, Object.class, "_queue");
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(AbstractC0303z2.class, Object.class, "_delayed");
    private volatile Object _queue = null;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;

    private final boolean m(Runnable runnable) {
        Z7 z7;
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (n()) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof C0079g5) {
                C0079g5 c0079g5 = (C0079g5) obj;
                int a = c0079g5.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    C0079g5 e = c0079g5.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a == 2) {
                    return false;
                }
            } else {
                z7 = C0305z4.d;
                if (obj == z7) {
                    return false;
                }
                C0079g5 c0079g52 = new C0079g5(8, true);
                c0079g52.a((Runnable) obj);
                c0079g52.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = h;
                while (true) {
                    if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c0079g52)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    private final boolean n() {
        return this._isCompleted;
    }

    public final void l(Runnable runnable) {
        if (m(runnable)) {
            Thread k = k();
            if (Thread.currentThread() != k) {
                LockSupport.unpark(k);
                return;
            }
            return;
        }
        RunnableC0195q1.k.l(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean o() {
        Z7 z7;
        if (i()) {
            C0291y2 c0291y2 = (C0291y2) this._delayed;
            if (c0291y2 == null || c0291y2.b()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof C0079g5) {
                        return ((C0079g5) obj).d();
                    }
                    z7 = C0305z4.d;
                    if (obj != z7) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0040 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0095 A[EDGE_INSN: B:99:0x0095->B:61:0x0095 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p() {
        /*
            r12 = this;
            boolean r0 = r12.j()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r12._delayed
            com.github.catvod.spider.merge.y2 r0 = (com.github.catvod.spider.merge.C0291y2) r0
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L4c
            boolean r6 = r0.b()
            if (r6 != 0) goto L4c
            long r6 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            com.github.catvod.spider.merge.n8 r8 = r0.a()     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L42
            com.github.catvod.spider.merge.x2 r8 = (com.github.catvod.spider.merge.AbstractRunnableC0279x2) r8     // Catch: java.lang.Throwable -> L49
            long r9 = r8.d     // Catch: java.lang.Throwable -> L49
            long r9 = r6 - r9
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 < 0) goto L2f
            r9 = 1
            goto L30
        L2f:
            r9 = 0
        L30:
            if (r9 == 0) goto L37
            boolean r8 = r12.m(r8)     // Catch: java.lang.Throwable -> L49
            goto L38
        L37:
            r8 = 0
        L38:
            if (r8 == 0) goto L3f
            com.github.catvod.spider.merge.n8 r8 = r0.c()     // Catch: java.lang.Throwable -> L49
            goto L40
        L3f:
            r8 = r3
        L40:
            monitor-exit(r0)
            goto L44
        L42:
            monitor-exit(r0)
            r8 = r3
        L44:
            com.github.catvod.spider.merge.x2 r8 = (com.github.catvod.spider.merge.AbstractRunnableC0279x2) r8
            if (r8 == 0) goto L4c
            goto L1c
        L49:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L4c:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L51
            goto L95
        L51:
            boolean r6 = r0 instanceof com.github.catvod.spider.merge.C0079g5
            if (r6 == 0) goto L78
            r6 = r0
            com.github.catvod.spider.merge.g5 r6 = (com.github.catvod.spider.merge.C0079g5) r6
            java.lang.Object r7 = r6.f()
            com.github.catvod.spider.merge.Z7 r8 = com.github.catvod.spider.merge.C0079g5.g
            if (r7 == r8) goto L64
            r3 = r7
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            goto L95
        L64:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = com.github.catvod.spider.merge.AbstractC0303z2.h
            com.github.catvod.spider.merge.g5 r6 = r6.e()
        L6a:
            boolean r8 = r7.compareAndSet(r12, r0, r6)
            if (r8 == 0) goto L71
            goto L4c
        L71:
            java.lang.Object r8 = r7.get(r12)
            if (r8 == r0) goto L6a
            goto L4c
        L78:
            com.github.catvod.spider.merge.Z7 r6 = com.github.catvod.spider.merge.C0305z4.a()
            if (r0 != r6) goto L7f
            goto L95
        L7f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = com.github.catvod.spider.merge.AbstractC0303z2.h
        L81:
            boolean r7 = r6.compareAndSet(r12, r0, r3)
            if (r7 == 0) goto L89
            r6 = 1
            goto L90
        L89:
            java.lang.Object r7 = r6.get(r12)
            if (r7 == r0) goto L81
            r6 = 0
        L90:
            if (r6 == 0) goto L4c
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
        L95:
            if (r3 == 0) goto L9b
            r3.run()
            return r1
        L9b:
            long r3 = super.g()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La4
            goto Le1
        La4:
            java.lang.Object r0 = r12._queue
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto Lae
            goto Lbb
        Lae:
            boolean r5 = r0 instanceof com.github.catvod.spider.merge.C0079g5
            if (r5 == 0) goto Lda
            com.github.catvod.spider.merge.g5 r0 = (com.github.catvod.spider.merge.C0079g5) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto Lbb
            goto Le1
        Lbb:
            java.lang.Object r0 = r12._delayed
            com.github.catvod.spider.merge.y2 r0 = (com.github.catvod.spider.merge.C0291y2) r0
            if (r0 == 0) goto Le0
            monitor-enter(r0)
            com.github.catvod.spider.merge.n8 r5 = r0.a()     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r0)
            com.github.catvod.spider.merge.x2 r5 = (com.github.catvod.spider.merge.AbstractRunnableC0279x2) r5
            if (r5 == 0) goto Le0
            long r3 = r5.d
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Le0
            goto Le1
        Ld7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lda:
            com.github.catvod.spider.merge.Z7 r5 = com.github.catvod.spider.merge.C0305z4.a()
            if (r0 != r5) goto Le1
        Le0:
            r1 = r3
        Le1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AbstractC0303z2.p():long");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        this._queue = null;
        this._delayed = null;
    }
}
