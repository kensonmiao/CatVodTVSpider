package com.github.catvod.spider.merge;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.l3  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0137l3 implements InterfaceC0089h3 {
    private final Locale a;
    private final int b;
    private final String c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0137l3(TimeZone timeZone, Locale locale, int i) {
        this.a = C0043d5.a(locale);
        this.b = i;
        this.c = C0256v3.h(timeZone, false, i, locale);
        this.d = C0256v3.h(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final int b() {
        return Math.max(this.c.length(), this.d.length());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final void c(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) C0256v3.h(calendar.getTimeZone(), calendar.get(16) != 0, this.b, this.a));
    }
}
