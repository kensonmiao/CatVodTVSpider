package com.github.catvod.spider.merge;

import java.util.Calendar;

/* renamed from: com.github.catvod.spider.merge.n3  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class C0161n3 implements InterfaceC0065f3 {
    private final InterfaceC0065f3 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0161n3(InterfaceC0065f3 interfaceC0065f3) {
        this.a = interfaceC0065f3;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0065f3
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final int b() {
        return this.a.b();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final void c(Appendable appendable, Calendar calendar) {
        int i = calendar.get(10);
        if (i == 0) {
            i = calendar.getLeastMaximum(10) + 1;
        }
        this.a.a(appendable, i);
    }
}
