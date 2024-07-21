package com.github.catvod.spider.merge;

import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0 {
    private final E1 a;
    @Nullable
    private E1 b = null;
    private final AbstractC0255v2 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0(E1 e1, AbstractC0255v2 abstractC0255v2) {
        this.a = e1;
        this.c = abstractC0255v2;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.github.catvod.spider.merge.J0.e(java.lang.String, com.github.catvod.spider.merge.E1):com.github.catvod.spider.merge.E1] */
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ E1 a(C0 c0) {
        return c0.b;
    }

    public final int b(A5 a5) {
        if (a5 instanceof E1) {
            E1 e1 = (E1) a5;
            if (this.c.a(this.a, e1)) {
                this.b = e1;
                return 5;
            }
            return 1;
        }
        return 1;
    }
}
