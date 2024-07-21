package com.github.catvod.spider.merge;

import java.util.List;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class ab extends C0116j6 {
    public ab(C0116j6 c0116j6, int i) {
        super(c0116j6, i);
    }

    @Override // com.github.catvod.spider.merge.S6
    public final int b() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.S6, com.github.catvod.spider.merge.InterfaceC0032c6
    public final <T> T d(InterfaceC0056e6<? extends T> interfaceC0056e6) {
        return interfaceC0056e6 instanceof ib ? (T) ((ib) interfaceC0056e6).A(this) : interfaceC0056e6.f(this);
    }

    @Override // com.github.catvod.spider.merge.C0116j6
    public final void i(InterfaceC0044d6 interfaceC0044d6) {
        if (interfaceC0044d6 instanceof Ca) {
            ((Ca) interfaceC0044d6).K();
        }
    }

    @Override // com.github.catvod.spider.merge.C0116j6
    public final void j(InterfaceC0044d6 interfaceC0044d6) {
        if (interfaceC0044d6 instanceof Ca) {
            ((Ca) interfaceC0044d6).u();
        }
    }

    public final Da n() {
        return (Da) k(Da.class);
    }

    public final Ha o() {
        return (Ha) k(Ha.class);
    }

    public final Sa p() {
        return (Sa) k(Sa.class);
    }

    public final List<Va> q() {
        return l(Va.class);
    }
}
