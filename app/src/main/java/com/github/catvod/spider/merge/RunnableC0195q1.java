package com.github.catvod.spider.merge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.github.catvod.spider.merge.q1 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class RunnableC0195q1 extends AbstractC0303z2 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    private static final long j;
    public static final RunnableC0195q1 k;

    static {
        Long l;
        RunnableC0195q1 runnableC0195q1 = new RunnableC0195q1();
        k = runnableC0195q1;
        AbstractC0267w2.h(runnableC0195q1, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        j = timeUnit.toNanos(l.longValue());
    }

    private RunnableC0195q1() {
    }

    private final synchronized void r() {
        if (s()) {
            debugStatus = 3;
            q();
            notifyAll();
        }
    }

    private final boolean s() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // com.github.catvod.spider.merge.A2
    public final Thread k() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[SPUT, INVOKE, INVOKE]}, finally: {[SPUT, INVOKE, INVOKE, INVOKE, IF] complete} */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean o;
        C0142l8 c0142l8 = C0142l8.b;
        C0142l8.a(this);
        try {
            synchronized (this) {
                if (s()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z) {
                if (o) {
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long p = p();
                if (p == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = j + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        r();
                        if (o()) {
                            return;
                        }
                        k();
                        return;
                    } else if (p > j3) {
                        p = j3;
                    }
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (p > 0) {
                    if (s()) {
                        _thread = null;
                        r();
                        if (o()) {
                            return;
                        }
                        k();
                        return;
                    }
                    LockSupport.parkNanos(this, p);
                }
            }
        } finally {
            _thread = null;
            r();
            if (!o()) {
                k();
            }
        }
    }
}
