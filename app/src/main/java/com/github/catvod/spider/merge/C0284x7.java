package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.x7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0284x7 implements H3 {
    @Override // com.github.catvod.spider.merge.H3
    public final String a() {
        return "string-length";
    }

    @Override // com.github.catvod.spider.merge.H3
    public final Aa b(C0009a7 c0009a7, List<Aa> list) {
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 0) {
            return new Aa(0);
        }
        return new Aa(Integer.valueOf(((Aa) linkedList.get(0)).g().length()));
    }
}
