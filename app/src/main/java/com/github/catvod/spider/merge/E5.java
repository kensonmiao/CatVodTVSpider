package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class E5 implements H3 {
    @Override // com.github.catvod.spider.merge.H3
    public final String a() {
        return "not";
    }

    @Override // com.github.catvod.spider.merge.H3
    public final Aa b(C0009a7 c0009a7, List<Aa> list) {
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 1) {
            return new Aa(Boolean.valueOf(!((Aa) linkedList.get(0)).a().booleanValue()));
        }
        throw new fb("error param in not(bool) function.Please check.");
    }
}
