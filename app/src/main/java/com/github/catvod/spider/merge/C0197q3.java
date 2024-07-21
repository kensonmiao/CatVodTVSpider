package com.github.catvod.spider.merge;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.q3  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0197q3 implements InterfaceC0065f3 {
    private final int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0197q3(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0065f3
    public final void a(Appendable appendable, int i) {
        if (i < 100) {
            C0256v3.a(appendable, i);
        } else {
            C0256v3.b(appendable, i, 2);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final int b() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final void c(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }
}
