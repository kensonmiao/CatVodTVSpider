package com.github.catvod.spider.merge;

import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.v4  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0257v4 {
    private static int[] c = new int[0];
    private int[] a = c;
    private int b;

    public final void a(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = this.b;
        if (length == i2) {
            int i3 = i2 + 1;
            if (i3 < 0 || i3 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArr.length == 0 ? 4 : iArr.length;
            while (length2 < i3) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.a = Arrays.copyOf(this.a, length2);
        }
        int[] iArr2 = this.a;
        int i4 = this.b;
        iArr2[i4] = i;
        this.b = i4 + 1;
    }

    public final void b() {
        Arrays.fill(this.a, 0, this.b, 0);
        this.b = 0;
    }

    public final int c(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[i];
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final int e(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
            int[] iArr2 = this.a;
            int i4 = this.b;
            iArr2[i4 - 1] = 0;
            this.b = i4 - 1;
            return i3;
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0257v4) {
            C0257v4 c0257v4 = (C0257v4) obj;
            if (this.b != c0257v4.b) {
                return false;
            }
            for (int i = 0; i < this.b; i++) {
                if (this.a[i] != c0257v4.a[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.b;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        return Arrays.toString(i == 0 ? c : Arrays.copyOf(this.a, i));
    }
}
