package com.github.catvod.spider.merge;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.r0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0205r0 extends AbstractC0229t0 {
    private final int[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0205r0(int i, int i2, int[] iArr) {
        super(i2);
        this.c = iArr;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final int e(int i) {
        int signum = Integer.signum(1);
        if (signum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            return this.c[i2];
        } else if (signum != 0) {
            if (signum == 1) {
                int i3 = (this.b + 1) - 1;
                if (i3 >= this.a) {
                    return -1;
                }
                return this.c[i3];
            }
            throw new UnsupportedOperationException("Not reached");
        } else {
            return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0098i0
    public final String j(C0281x4 c0281x4) {
        int min = Math.min(c0281x4.a, this.a);
        return new String(this.c, min, Math.min((c0281x4.b - c0281x4.a) + 1, this.a - min));
    }
}
