package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.t7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0236t7 implements H3 {
    @Override // com.github.catvod.spider.merge.H3
    public final String a() {
        return "starts-with";
    }

    @Override // com.github.catvod.spider.merge.H3
    public final Aa b(C0009a7 c0009a7, List<Aa> list) {
        LinkedList linkedList = (LinkedList) list;
        return new Aa(Boolean.valueOf(((Aa) linkedList.get(0)).g().startsWith(((Aa) linkedList.get(1)).g())));
    }
}
