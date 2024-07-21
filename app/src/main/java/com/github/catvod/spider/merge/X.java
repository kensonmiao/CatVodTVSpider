package com.github.catvod.spider.merge;

import java.util.Arrays;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class X implements Cloneable {
    private int[] c;
    private int d;

    public X() {
        this.d = 0;
        this.c = new int[1];
    }

    X(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    private void d(int i) {
        int[] iArr = this.c;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.c = iArr2;
        }
    }

    public final void a(boolean z) {
        d(this.d + 1);
        if (z) {
            int[] iArr = this.c;
            int i = this.d;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.d++;
    }

    public final void b(X x) {
        int i = x.d;
        d(this.d + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(x.e(i2));
        }
    }

    public final void c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        d(this.d + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final Object clone() {
        return new X((int[]) this.c.clone(), this.d);
    }

    public final boolean e(int i) {
        return ((1 << (i & 31)) & this.c[i / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            X x = (X) obj;
            return this.d == x.d && Arrays.equals(this.c, x.c);
        }
        return false;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return (this.d + 7) / 8;
    }

    public final void h(X x) {
        if (this.d != x.d) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ x.c[i];
            i++;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (this.d * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.d);
        for (int i = 0; i < this.d; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(e(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}
