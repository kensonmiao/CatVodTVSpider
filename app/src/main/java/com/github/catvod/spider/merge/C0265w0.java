package com.github.catvod.spider.merge;

import java.util.Collections;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.w0 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0265w0 extends A0 {
    public static List w(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            List singletonList = Collections.singletonList(list.get(0));
            C0305z4.g(singletonList, "java.util.Collections.singletonList(element)");
            return singletonList;
        }
        return H1.c;
    }
}
