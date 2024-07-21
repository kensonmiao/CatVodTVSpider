package com.github.catvod.spider.merge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C1 implements C5 {
    final /* synthetic */ StringBuilder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(StringBuilder sb) {
        this.a = sb;
    }

    @Override // com.github.catvod.spider.merge.C5
    public final void a(A5 a5, int i) {
        if ((a5 instanceof E1) && ((E1) a5).b0() && (a5.s() instanceof C0130k8) && !C0130k8.N(this.a)) {
            this.a.append(' ');
        }
    }

    @Override // com.github.catvod.spider.merge.C5
    public final void b(A5 a5, int i) {
        C0022b8 c0022b8;
        if (a5 instanceof C0130k8) {
            E1.N(this.a, (C0130k8) a5);
        } else if (a5 instanceof E1) {
            E1 e1 = (E1) a5;
            if (this.a.length() > 0) {
                if (!e1.b0()) {
                    c0022b8 = e1.f;
                    if (!c0022b8.b().equals("br")) {
                        return;
                    }
                }
                if (C0130k8.N(this.a)) {
                    return;
                }
                this.a.append(' ');
            }
        }
    }
}
