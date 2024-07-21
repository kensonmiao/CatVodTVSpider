package com.github.catvod.spider.merge;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.s3  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0220s3 implements InterfaceC0065f3 {
    static final C0220s3 a = new C0220s3();

    C0220s3() {
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0065f3
    public final void a(Appendable appendable, int i) {
        if (i >= 10) {
            C0256v3.a(appendable, i);
            return;
        }
        ((StringBuilder) appendable).append((char) (i + 48));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final int b() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final void c(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(2) + 1);
    }
}
