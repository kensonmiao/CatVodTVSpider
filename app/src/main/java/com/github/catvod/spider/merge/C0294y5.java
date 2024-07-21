package com.github.catvod.spider.merge;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.y5  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0294y5 implements C5 {
    private final Appendable a;
    private final C0278x1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0294y5(Appendable appendable, C0278x1 c0278x1) {
        this.a = appendable;
        this.b = c0278x1;
        c0278x1.e();
    }

    @Override // com.github.catvod.spider.merge.C5
    public final void a(A5 a5, int i) {
        if (a5.t().equals("#text")) {
            return;
        }
        try {
            a5.x(this.a, i, this.b);
        } catch (IOException e) {
            throw new C0165n7(e);
        }
    }

    @Override // com.github.catvod.spider.merge.C5
    public final void b(A5 a5, int i) {
        try {
            a5.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new C0165n7(e);
        }
    }
}
