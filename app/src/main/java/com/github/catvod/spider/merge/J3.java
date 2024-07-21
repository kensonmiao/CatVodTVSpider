package com.github.catvod.spider.merge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class J3 {
    private final I3 a;
    private final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(I3 i3, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = i3;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    final J3 a(J3 j3) {
        if (this.a.equals(j3.a)) {
            if (e()) {
                return j3;
            }
            if (j3.e()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = j3.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = iArr2[i - length] ^ iArr[i];
            }
            return new J3(this.a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final J3[] b(J3 j3) {
        if (this.a.equals(j3.a)) {
            if (j3.e()) {
                throw new IllegalArgumentException("Divide by 0");
            }
            J3 d = this.a.d();
            int e = this.a.e(j3.c(j3.b.length - 1));
            J3 j32 = this;
            while (j32.b.length - 1 >= j3.b.length - 1 && !j32.e()) {
                int[] iArr = j32.b;
                int length = (iArr.length - 1) - (j3.b.length - 1);
                int g = this.a.g(j32.c(iArr.length - 1), e);
                J3 g2 = j3.g(length, g);
                d = d.a(this.a.a(length, g));
                j32 = j32.a(g2);
            }
            return new J3[]{d, j32};
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    final int c(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] d() {
        return this.b;
    }

    final boolean e() {
        return this.b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final J3 f(J3 j3) {
        if (this.a.equals(j3.a)) {
            if (e() || j3.e()) {
                return this.a.d();
            }
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = j3.b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = iArr3[i4] ^ this.a.g(i2, iArr2[i3]);
                }
            }
            return new J3(this.a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final J3 g(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.a.d();
            }
            int length = this.b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.g(this.b[i3], i2);
            }
            return new J3(this.a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder((this.b.length - 1) * 8);
        int length = this.b.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb.toString();
            }
            int c2 = c(length);
            if (c2 != 0) {
                if (c2 < 0) {
                    sb.append(" - ");
                    c2 = -c2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || c2 != 1) {
                    int f = this.a.f(c2);
                    if (f == 0) {
                        c = '1';
                    } else if (f == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(f);
                    }
                    sb.append(c);
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
    }
}
