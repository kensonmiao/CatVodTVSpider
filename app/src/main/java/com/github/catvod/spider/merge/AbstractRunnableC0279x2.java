package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.x2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractRunnableC0279x2 implements Runnable, Comparable<AbstractRunnableC0279x2>, InterfaceC0166n8 {
    private C0154m8 c;
    public long d;

    @Override // com.github.catvod.spider.merge.InterfaceC0166n8
    public final void a(C0154m8<?> c0154m8) {
        Z7 z7;
        C0154m8 c0154m82 = this.c;
        z7 = C0305z4.c;
        if (!(c0154m82 != z7)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.c = c0154m8;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0166n8
    public final void b() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final int compareTo(AbstractRunnableC0279x2 abstractRunnableC0279x2) {
        long j = this.d - abstractRunnableC0279x2.d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final String toString() {
        StringBuilder a = A.a("Delayed[nanos=");
        a.append(this.d);
        a.append(']');
        return a.toString();
    }
}
