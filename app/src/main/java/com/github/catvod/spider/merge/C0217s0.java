package com.github.catvod.spider.merge;

import java.nio.charset.StandardCharsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.s0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0217s0 extends AbstractC0229t0 {
    private final byte[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0217s0(int i, int i2, byte[] bArr) {
        super(i2);
        this.c = bArr;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0245u4
    public final int e(int i) {
        byte b;
        int signum = Integer.signum(1);
        if (signum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            b = this.c[i2];
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
            b = this.c[i3];
        }
        return b & 255;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0098i0
    public final String j(C0281x4 c0281x4) {
        int min = Math.min(c0281x4.a, this.a);
        return new String(this.c, min, Math.min((c0281x4.b - c0281x4.a) + 1, this.a - min), StandardCharsets.ISO_8859_1);
    }
}
