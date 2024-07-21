package com.github.catvod.spider.merge;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class J2 {
    private final ConcurrentMap<E3, K2> a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.E3, com.github.catvod.spider.merge.K2>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.E3, com.github.catvod.spider.merge.K2>, java.util.concurrent.ConcurrentHashMap] */
    public final Format a(String str, Locale locale) {
        C0180oa.a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale a = C0043d5.a(locale);
        E3 e3 = new E3(str, timeZone, a);
        Format format = (Format) this.a.get(e3);
        if (format == null) {
            K2 k2 = new K2(str, timeZone, a);
            Format format2 = (Format) this.a.putIfAbsent(e3, k2);
            return format2 != null ? format2 : k2;
        }
        return format;
    }
}
