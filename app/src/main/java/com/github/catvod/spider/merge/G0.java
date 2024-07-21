package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class G0 extends K4 {
    public G0(String str) {
        this.f = str;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final Object clone() {
        return (G0) super.clone();
    }

    @Override // com.github.catvod.spider.merge.K4, com.github.catvod.spider.merge.A5
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final A5 j() {
        return (G0) super.clone();
    }

    @Override // com.github.catvod.spider.merge.K4, com.github.catvod.spider.merge.A5
    public final A5 m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final String t() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.A5
    public final String toString() {
        return u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.A5
    public final void w(Appendable appendable, int i, C0278x1 c0278x1) {
        if (c0278x1.f() && this.d == 0) {
            A5 a5 = this.c;
            if ((a5 instanceof E1) && ((E1) a5).m0().a()) {
                r(appendable, i, c0278x1);
            }
        }
        appendable.append("<!--").append(I()).append("-->");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.A5
    public final void x(Appendable appendable, int i, C0278x1 c0278x1) {
    }
}
