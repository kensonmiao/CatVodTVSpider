package com.github.catvod.spider.merge;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class G5 implements B5 {
    private static Pattern a = Pattern.compile("\\d*\\.?\\d+");

    @Override // com.github.catvod.spider.merge.B5
    public final String a() {
        return "num";
    }

    @Override // com.github.catvod.spider.merge.B5
    public final Aa b(C0009a7 c0009a7) {
        Matcher matcher = a.matcher(A7.e(Z6.b("allText").b(c0009a7).e(), ""));
        return matcher.find() ? new Aa(Double.valueOf(new BigDecimal(matcher.group()).doubleValue())) : new Aa(null);
    }
}
