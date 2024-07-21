package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class I3 {
    public static final I3 g = new I3(4201, 4096, 1);
    public static final I3 h = new I3(1033, 1024, 1);
    public static final I3 i = new I3(67, 64, 1);
    public static final I3 j = new I3(19, 16, 1);
    public static final I3 k = new I3(285, 256, 0);
    public static final I3 l = new I3(301, 256, 1);
    private final int[] a;
    private final int[] b;
    private final J3 c;
    private final int d;
    private final int e;
    private final int f;

    public I3(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new J3(this, new int[]{0});
        new J3(this, new int[]{1});
    }

    public final J3 a(int i2, int i3) {
        if (i2 >= 0) {
            if (i3 == 0) {
                return this.c;
            }
            int[] iArr = new int[i2 + 1];
            iArr[0] = i3;
            return new J3(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i2) {
        return this.a[i2];
    }

    public final int c() {
        return this.f;
    }

    public final J3 d() {
        return this.c;
    }

    public final int e(int i2) {
        if (i2 != 0) {
            return this.a[(this.d - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int f(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    public final int g(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.d - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.e) + ',' + this.d + ')';
    }
}
