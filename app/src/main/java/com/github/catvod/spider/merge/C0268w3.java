package com.github.catvod.spider.merge;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.w3  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0268w3 {
    private static final Pattern a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");
    private static final TimeZone b = new L3(false, 0, 0);
    public static final /* synthetic */ int c = 0;

    public static TimeZone a(String str) {
        if ("Z".equals(str) || "UTC".equals(str)) {
            return b;
        }
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(2);
            boolean z = false;
            int parseInt = group != null ? Integer.parseInt(group) : 0;
            String group2 = matcher.group(4);
            int parseInt2 = group2 != null ? Integer.parseInt(group2) : 0;
            if (parseInt == 0 && parseInt2 == 0) {
                return b;
            }
            String group3 = matcher.group(1);
            if (group3 != null && group3.charAt(0) == '-') {
                z = true;
            }
            return new L3(z, parseInt, parseInt2);
        }
        return null;
    }
}
