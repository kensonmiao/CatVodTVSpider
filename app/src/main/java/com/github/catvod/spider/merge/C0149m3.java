package com.github.catvod.spider.merge;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.m3  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0149m3 implements InterfaceC0089h3 {
    static final C0149m3 b = new C0149m3(true);
    static final C0149m3 c = new C0149m3(false);
    final boolean a;

    C0149m3(boolean z) {
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final int b() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0089h3
    public final void c(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        C0256v3.a(appendable, i2);
        if (this.a) {
            ((StringBuilder) appendable).append(':');
        }
        C0256v3.a(appendable, (i / 60000) - (i2 * 60));
    }
}
