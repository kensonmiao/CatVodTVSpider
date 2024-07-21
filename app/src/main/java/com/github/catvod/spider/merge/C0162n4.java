package com.github.catvod.spider.merge;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.n4  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public enum C0162n4 extends EnumC0186p4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0162n4() {
        super("Text", 7, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.EnumC0186p4
    public final boolean d(F8 f8, R3 r3) {
        if (f8.a()) {
            r3.E((C0297y8) f8);
            return true;
        } else if (f8.d()) {
            r3.n(this);
            r3.U();
            r3.j0(r3.T());
            return r3.c(f8);
        } else if (f8.e()) {
            r3.U();
            r3.j0(r3.T());
            return true;
        } else {
            return true;
        }
    }
}
