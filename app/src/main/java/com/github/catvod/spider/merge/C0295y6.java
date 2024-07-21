package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.y6  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0295y6 {
    protected final Map<AbstractC0283x6, AbstractC0283x6> a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.x6, com.github.catvod.spider.merge.x6>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.x6, com.github.catvod.spider.merge.x6>] */
    public final AbstractC0283x6 a(AbstractC0283x6 abstractC0283x6) {
        I1 i1 = AbstractC0283x6.b;
        if (abstractC0283x6 == i1) {
            return i1;
        }
        AbstractC0283x6 abstractC0283x62 = (AbstractC0283x6) this.a.get(abstractC0283x6);
        if (abstractC0283x62 != null) {
            return abstractC0283x62;
        }
        this.a.put(abstractC0283x6, abstractC0283x6);
        return abstractC0283x6;
    }
}
