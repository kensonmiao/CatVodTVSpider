package com.github.catvod.spider.merge;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class K2 extends Format {
    private static final J2 e = new J2();
    private final C0256v3 c;
    private final C0017b3 d;

    /* JADX INFO: Access modifiers changed from: protected */
    public K2(String str, TimeZone timeZone, Locale locale) {
        this.c = new C0256v3(str, timeZone, locale);
        this.d = new C0017b3(str, timeZone, locale);
    }

    public static K2 a() {
        return (K2) e.a("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    public static K2 b(String str) {
        return (K2) e.a(str, null);
    }

    public final Date c(String str) {
        return this.d.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K2) {
            return this.c.equals(((K2) obj).c);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.c.d(obj));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.d.i(str, parsePosition);
    }

    public final String toString() {
        StringBuilder a = A.a("FastDateFormat[");
        a.append(this.c.f());
        a.append(",");
        a.append(this.c.e());
        a.append(",");
        a.append(this.c.g().getID());
        a.append("]");
        return a.toString();
    }
}
