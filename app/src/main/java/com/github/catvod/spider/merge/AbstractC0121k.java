package com.github.catvod.spider.merge;

import java.util.UUID;

/* renamed from: com.github.catvod.spider.merge.k */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0121k {
    public static final C0099i1 c;
    public final C0025c a;
    protected final C0295y6 b;

    static {
        UUID uuid = C0109j.f;
        UUID uuid2 = C0109j.f;
        C0099i1 c0099i1 = new C0099i1(new C0085h(true));
        c = c0099i1;
        c0099i1.a = Integer.MAX_VALUE;
    }

    public AbstractC0121k(C0025c c0025c, C0295y6 c0295y6) {
        this.a = c0025c;
        this.b = c0295y6;
    }

    public abstract void a();
}
