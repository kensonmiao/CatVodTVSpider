package com.github.catvod.spider.merge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class F3 implements H3 {
    @Override // com.github.catvod.spider.merge.H3
    public final String a() {
        return "format-date";
    }

    @Override // com.github.catvod.spider.merge.H3
    public final Aa b(C0009a7 c0009a7, List<Aa> list) {
        LinkedList linkedList = (LinkedList) list;
        String g = ((Aa) linkedList.get(0)).g();
        String g2 = ((Aa) linkedList.get(1)).g();
        try {
            if (linkedList.size() > 2 && linkedList.get(2) != null) {
                return new Aa(new SimpleDateFormat(g2, Locale.forLanguageTag(((Aa) linkedList.get(2)).g())).parse(g));
            }
            return new Aa(K2.b(g2).c(g));
        } catch (ParseException e) {
            throw new fb(e);
        }
    }
}
