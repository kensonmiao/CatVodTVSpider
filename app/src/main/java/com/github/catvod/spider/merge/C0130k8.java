package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.k8  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0130k8 extends K4 {
    public C0130k8(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean N(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // com.github.catvod.spider.merge.A5
    /* renamed from: K */
    public C0130k8 j() {
        return (C0130k8) super.clone();
    }

    public final String L() {
        return I();
    }

    public final boolean M() {
        return C0308z7.c(I());
    }

    @Override // com.github.catvod.spider.merge.K4, com.github.catvod.spider.merge.A5
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.K4, com.github.catvod.spider.merge.A5
    public final A5 m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.A5
    public String t() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.A5
    public final String toString() {
        return u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.A5
    public void w(Appendable appendable, int i, C0278x1 c0278x1) {
        boolean f = c0278x1.f();
        if (f && this.d == 0) {
            A5 a5 = this.c;
            if ((a5 instanceof E1) && ((E1) a5).m0().a() && !M()) {
                r(appendable, i, c0278x1);
            }
        }
        L1.d(appendable, I(), c0278x1, false, f && !E1.i0(this.c), f && (this.c instanceof C0290y1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.A5
    public void x(Appendable appendable, int i, C0278x1 c0278x1) {
    }
}
