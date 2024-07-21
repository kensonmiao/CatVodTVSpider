package com.github.catvod.spider.merge;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.p3  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0185p3 implements InterfaceC0065f3 {
    static final C0185p3 a = new C0185p3();

    C0185p3() {
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0065f3
    public final void a(Appendable appendable, int i) {
        C0256v3.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final int b() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final void c(Appendable appendable, Calendar calendar) {
        C0256v3.a(appendable, calendar.get(2) + 1);
    }
}
