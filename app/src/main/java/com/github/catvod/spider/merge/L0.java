package com.github.catvod.spider.merge;

import java.util.List;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class L0 implements H3 {
    @Override // com.github.catvod.spider.merge.H3
    public final String a() {
        return "concat";
    }

    @Override // com.github.catvod.spider.merge.H3
    public final Aa b(C0009a7 c0009a7, List<Aa> list) {
        StringBuilder sb = new StringBuilder();
        for (Aa aa : list) {
            sb.append(aa.g());
        }
        return new Aa(sb.toString());
    }
}
