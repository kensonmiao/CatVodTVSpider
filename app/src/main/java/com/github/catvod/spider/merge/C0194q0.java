package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.q0 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0194q0 extends AbstractC0229t0 {
    private final char[] c;

    public C0194q0(int i, int i2, char[] cArr) {
        super(i2);
        this.c = cArr;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final int e(int i) {
        char c;
        int signum = Integer.signum(1);
        if (signum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            c = this.c[i2];
        } else if (signum == 0) {
            return 0;
        } else {
            if (signum != 1) {
                throw new UnsupportedOperationException("Not reached");
            }
            int i3 = (this.b + 1) - 1;
            if (i3 >= this.a) {
                return -1;
            }
            c = this.c[i3];
        }
        return c & 65535;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0098i0
    public final String j(C0281x4 c0281x4) {
        int min = Math.min(c0281x4.a, this.a);
        return new String(this.c, min, Math.min((c0281x4.b - c0281x4.a) + 1, this.a - min));
    }
}
