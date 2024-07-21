package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.x4  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0281x4 {
    static C0281x4[] c = new C0281x4[1001];
    public int a;
    public int b;

    public C0281x4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static C0281x4 b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C0281x4(i, i2);
        }
        C0281x4[] c0281x4Arr = c;
        if (c0281x4Arr[i] == null) {
            c0281x4Arr[i] = new C0281x4(i, i);
        }
        return c0281x4Arr[i];
    }

    public final boolean a(C0281x4 c0281x4) {
        int i = this.a;
        int i2 = c0281x4.a;
        if (!(i < i2 && this.b < i2)) {
            if (!(i > c0281x4.b)) {
                return false;
            }
        }
        return true;
    }

    public final C0281x4 c(C0281x4 c0281x4) {
        return b(Math.min(this.a, c0281x4.a), Math.max(this.b, c0281x4.b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0281x4)) {
            return false;
        }
        C0281x4 c0281x4 = (C0281x4) obj;
        return this.a == c0281x4.a && this.b == c0281x4.b;
    }

    public final int hashCode() {
        return ((713 + this.a) * 31) + this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
