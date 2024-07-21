package com.github.catvod.spider.merge;

import java.util.Arrays;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class Y implements Cloneable {
    private final int c;
    private final int d;
    private final int e;
    private final int[] f;

    public Y(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.c = i;
        this.d = i2;
        int i3 = (i + 31) / 32;
        this.e = i3;
        this.f = new int[i3 * i2];
    }

    private Y(int i, int i2, int i3, int[] iArr) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = iArr;
    }

    public final boolean a(int i, int i2) {
        return ((this.f[(i / 32) + (i2 * this.e)] >>> (i & 31)) & 1) != 0;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final Object clone() {
        return new Y(this.c, this.d, this.e, (int[]) this.f.clone());
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.d || i5 > this.c) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.e * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            Y y = (Y) obj;
            return this.c == y.c && this.d == y.d && this.e == y.e && Arrays.equals(this.f, y.f);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        return Arrays.hashCode(this.f) + (((((((i * 31) + i) * 31) + this.d) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.c + 1) * this.d);
        for (int i = 0; i < this.d; i++) {
            for (int i2 = 0; i2 < this.c; i2++) {
                sb.append(a(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
