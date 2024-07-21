package com.github.catvod.spider.merge;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.u1  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0242u1<T> extends kotlinx.coroutines.b<T> implements Q0<T> {
    private volatile Object _reusableCancellableContinuation;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C0242u1.class, Object.class, "_reusableCancellableContinuation");
    }

    @Override // com.github.catvod.spider.merge.Q0
    public final T0 a() {
        throw null;
    }

    public final Q0<T> b() {
        return this;
    }

    public final String toString() {
        Object e;
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append((Object) null);
        sb.append(", ");
        try {
            e = ((Object) null) + '@' + E.e(null);
        } catch (Throwable th) {
            e = F.e(th);
        }
        if (R6.a(e) == null) {
            sb.append((String) e);
            sb.append(']');
            return sb.toString();
        }
        throw null;
    }
}
