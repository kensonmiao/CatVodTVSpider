package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.ra */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0215ra {
    private static final C0215ra[] d = a();
    private final int a;
    private final C0204qa[] b;
    private final int c;

    private C0215ra(int i, C0204qa... c0204qaArr) {
        C0192pa[] a;
        this.a = i;
        this.b = c0204qaArr;
        int b = c0204qaArr[0].b();
        int i2 = 0;
        for (C0192pa c0192pa : c0204qaArr[0].a()) {
            i2 += (c0192pa.b() + b) * c0192pa.a();
        }
        this.c = i2;
    }

    private static C0215ra[] a() {
        return new C0215ra[]{new C0215ra(1, new C0204qa(7, new C0192pa(1, 19)), new C0204qa(10, new C0192pa(1, 16)), new C0204qa(13, new C0192pa(1, 13)), new C0204qa(17, new C0192pa(1, 9))), new C0215ra(2, new C0204qa(10, new C0192pa(1, 34)), new C0204qa(16, new C0192pa(1, 28)), new C0204qa(22, new C0192pa(1, 22)), new C0204qa(28, new C0192pa(1, 16))), new C0215ra(3, new C0204qa(15, new C0192pa(1, 55)), new C0204qa(26, new C0192pa(1, 44)), new C0204qa(18, new C0192pa(2, 17)), new C0204qa(22, new C0192pa(2, 13))), new C0215ra(4, new C0204qa(20, new C0192pa(1, 80)), new C0204qa(18, new C0192pa(2, 32)), new C0204qa(26, new C0192pa(2, 24)), new C0204qa(16, new C0192pa(4, 9))), new C0215ra(5, new C0204qa(26, new C0192pa(1, 108)), new C0204qa(24, new C0192pa(2, 43)), new C0204qa(18, new C0192pa(2, 15), new C0192pa(2, 16)), new C0204qa(22, new C0192pa(2, 11), new C0192pa(2, 12))), new C0215ra(6, new C0204qa(18, new C0192pa(2, 68)), new C0204qa(16, new C0192pa(4, 27)), new C0204qa(24, new C0192pa(4, 19)), new C0204qa(28, new C0192pa(4, 15))), new C0215ra(7, new C0204qa(20, new C0192pa(2, 78)), new C0204qa(18, new C0192pa(4, 31)), new C0204qa(18, new C0192pa(2, 14), new C0192pa(4, 15)), new C0204qa(26, new C0192pa(4, 13), new C0192pa(1, 14))), new C0215ra(8, new C0204qa(24, new C0192pa(2, 97)), new C0204qa(22, new C0192pa(2, 38), new C0192pa(2, 39)), new C0204qa(22, new C0192pa(4, 18), new C0192pa(2, 19)), new C0204qa(26, new C0192pa(4, 14), new C0192pa(2, 15))), new C0215ra(9, new C0204qa(30, new C0192pa(2, 116)), new C0204qa(22, new C0192pa(3, 36), new C0192pa(2, 37)), new C0204qa(20, new C0192pa(4, 16), new C0192pa(4, 17)), new C0204qa(24, new C0192pa(4, 12), new C0192pa(4, 13))), new C0215ra(10, new C0204qa(18, new C0192pa(2, 68), new C0192pa(2, 69)), new C0204qa(26, new C0192pa(4, 43), new C0192pa(1, 44)), new C0204qa(24, new C0192pa(6, 19), new C0192pa(2, 20)), new C0204qa(28, new C0192pa(6, 15), new C0192pa(2, 16))), new C0215ra(11, new C0204qa(20, new C0192pa(4, 81)), new C0204qa(30, new C0192pa(1, 50), new C0192pa(4, 51)), new C0204qa(28, new C0192pa(4, 22), new C0192pa(4, 23)), new C0204qa(24, new C0192pa(3, 12), new C0192pa(8, 13))), new C0215ra(12, new C0204qa(24, new C0192pa(2, 92), new C0192pa(2, 93)), new C0204qa(22, new C0192pa(6, 36), new C0192pa(2, 37)), new C0204qa(26, new C0192pa(4, 20), new C0192pa(6, 21)), new C0204qa(28, new C0192pa(7, 14), new C0192pa(4, 15))), new C0215ra(13, new C0204qa(26, new C0192pa(4, 107)), new C0204qa(22, new C0192pa(8, 37), new C0192pa(1, 38)), new C0204qa(24, new C0192pa(8, 20), new C0192pa(4, 21)), new C0204qa(22, new C0192pa(12, 11), new C0192pa(4, 12))), new C0215ra(14, new C0204qa(30, new C0192pa(3, 115), new C0192pa(1, 116)), new C0204qa(24, new C0192pa(4, 40), new C0192pa(5, 41)), new C0204qa(20, new C0192pa(11, 16), new C0192pa(5, 17)), new C0204qa(24, new C0192pa(11, 12), new C0192pa(5, 13))), new C0215ra(15, new C0204qa(22, new C0192pa(5, 87), new C0192pa(1, 88)), new C0204qa(24, new C0192pa(5, 41), new C0192pa(5, 42)), new C0204qa(30, new C0192pa(5, 24), new C0192pa(7, 25)), new C0204qa(24, new C0192pa(11, 12), new C0192pa(7, 13))), new C0215ra(16, new C0204qa(24, new C0192pa(5, 98), new C0192pa(1, 99)), new C0204qa(28, new C0192pa(7, 45), new C0192pa(3, 46)), new C0204qa(24, new C0192pa(15, 19), new C0192pa(2, 20)), new C0204qa(30, new C0192pa(3, 15), new C0192pa(13, 16))), new C0215ra(17, new C0204qa(28, new C0192pa(1, 107), new C0192pa(5, 108)), new C0204qa(28, new C0192pa(10, 46), new C0192pa(1, 47)), new C0204qa(28, new C0192pa(1, 22), new C0192pa(15, 23)), new C0204qa(28, new C0192pa(2, 14), new C0192pa(17, 15))), new C0215ra(18, new C0204qa(30, new C0192pa(5, 120), new C0192pa(1, 121)), new C0204qa(26, new C0192pa(9, 43), new C0192pa(4, 44)), new C0204qa(28, new C0192pa(17, 22), new C0192pa(1, 23)), new C0204qa(28, new C0192pa(2, 14), new C0192pa(19, 15))), new C0215ra(19, new C0204qa(28, new C0192pa(3, 113), new C0192pa(4, 114)), new C0204qa(26, new C0192pa(3, 44), new C0192pa(11, 45)), new C0204qa(26, new C0192pa(17, 21), new C0192pa(4, 22)), new C0204qa(26, new C0192pa(9, 13), new C0192pa(16, 14))), new C0215ra(20, new C0204qa(28, new C0192pa(3, 107), new C0192pa(5, 108)), new C0204qa(26, new C0192pa(3, 41), new C0192pa(13, 42)), new C0204qa(30, new C0192pa(15, 24), new C0192pa(5, 25)), new C0204qa(28, new C0192pa(15, 15), new C0192pa(10, 16))), new C0215ra(21, new C0204qa(28, new C0192pa(4, 116), new C0192pa(4, 117)), new C0204qa(26, new C0192pa(17, 42)), new C0204qa(28, new C0192pa(17, 22), new C0192pa(6, 23)), new C0204qa(30, new C0192pa(19, 16), new C0192pa(6, 17))), new C0215ra(22, new C0204qa(28, new C0192pa(2, 111), new C0192pa(7, 112)), new C0204qa(28, new C0192pa(17, 46)), new C0204qa(30, new C0192pa(7, 24), new C0192pa(16, 25)), new C0204qa(24, new C0192pa(34, 13))), new C0215ra(23, new C0204qa(30, new C0192pa(4, 121), new C0192pa(5, 122)), new C0204qa(28, new C0192pa(4, 47), new C0192pa(14, 48)), new C0204qa(30, new C0192pa(11, 24), new C0192pa(14, 25)), new C0204qa(30, new C0192pa(16, 15), new C0192pa(14, 16))), new C0215ra(24, new C0204qa(30, new C0192pa(6, 117), new C0192pa(4, 118)), new C0204qa(28, new C0192pa(6, 45), new C0192pa(14, 46)), new C0204qa(30, new C0192pa(11, 24), new C0192pa(16, 25)), new C0204qa(30, new C0192pa(30, 16), new C0192pa(2, 17))), new C0215ra(25, new C0204qa(26, new C0192pa(8, 106), new C0192pa(4, 107)), new C0204qa(28, new C0192pa(8, 47), new C0192pa(13, 48)), new C0204qa(30, new C0192pa(7, 24), new C0192pa(22, 25)), new C0204qa(30, new C0192pa(22, 15), new C0192pa(13, 16))), new C0215ra(26, new C0204qa(28, new C0192pa(10, 114), new C0192pa(2, 115)), new C0204qa(28, new C0192pa(19, 46), new C0192pa(4, 47)), new C0204qa(28, new C0192pa(28, 22), new C0192pa(6, 23)), new C0204qa(30, new C0192pa(33, 16), new C0192pa(4, 17))), new C0215ra(27, new C0204qa(30, new C0192pa(8, 122), new C0192pa(4, 123)), new C0204qa(28, new C0192pa(22, 45), new C0192pa(3, 46)), new C0204qa(30, new C0192pa(8, 23), new C0192pa(26, 24)), new C0204qa(30, new C0192pa(12, 15), new C0192pa(28, 16))), new C0215ra(28, new C0204qa(30, new C0192pa(3, 117), new C0192pa(10, 118)), new C0204qa(28, new C0192pa(3, 45), new C0192pa(23, 46)), new C0204qa(30, new C0192pa(4, 24), new C0192pa(31, 25)), new C0204qa(30, new C0192pa(11, 15), new C0192pa(31, 16))), new C0215ra(29, new C0204qa(30, new C0192pa(7, 116), new C0192pa(7, 117)), new C0204qa(28, new C0192pa(21, 45), new C0192pa(7, 46)), new C0204qa(30, new C0192pa(1, 23), new C0192pa(37, 24)), new C0204qa(30, new C0192pa(19, 15), new C0192pa(26, 16))), new C0215ra(30, new C0204qa(30, new C0192pa(5, 115), new C0192pa(10, 116)), new C0204qa(28, new C0192pa(19, 47), new C0192pa(10, 48)), new C0204qa(30, new C0192pa(15, 24), new C0192pa(25, 25)), new C0204qa(30, new C0192pa(23, 15), new C0192pa(25, 16))), new C0215ra(31, new C0204qa(30, new C0192pa(13, 115), new C0192pa(3, 116)), new C0204qa(28, new C0192pa(2, 46), new C0192pa(29, 47)), new C0204qa(30, new C0192pa(42, 24), new C0192pa(1, 25)), new C0204qa(30, new C0192pa(23, 15), new C0192pa(28, 16))), new C0215ra(32, new C0204qa(30, new C0192pa(17, 115)), new C0204qa(28, new C0192pa(10, 46), new C0192pa(23, 47)), new C0204qa(30, new C0192pa(10, 24), new C0192pa(35, 25)), new C0204qa(30, new C0192pa(19, 15), new C0192pa(35, 16))), new C0215ra(33, new C0204qa(30, new C0192pa(17, 115), new C0192pa(1, 116)), new C0204qa(28, new C0192pa(14, 46), new C0192pa(21, 47)), new C0204qa(30, new C0192pa(29, 24), new C0192pa(19, 25)), new C0204qa(30, new C0192pa(11, 15), new C0192pa(46, 16))), new C0215ra(34, new C0204qa(30, new C0192pa(13, 115), new C0192pa(6, 116)), new C0204qa(28, new C0192pa(14, 46), new C0192pa(23, 47)), new C0204qa(30, new C0192pa(44, 24), new C0192pa(7, 25)), new C0204qa(30, new C0192pa(59, 16), new C0192pa(1, 17))), new C0215ra(35, new C0204qa(30, new C0192pa(12, 121), new C0192pa(7, 122)), new C0204qa(28, new C0192pa(12, 47), new C0192pa(26, 48)), new C0204qa(30, new C0192pa(39, 24), new C0192pa(14, 25)), new C0204qa(30, new C0192pa(22, 15), new C0192pa(41, 16))), new C0215ra(36, new C0204qa(30, new C0192pa(6, 121), new C0192pa(14, 122)), new C0204qa(28, new C0192pa(6, 47), new C0192pa(34, 48)), new C0204qa(30, new C0192pa(46, 24), new C0192pa(10, 25)), new C0204qa(30, new C0192pa(2, 15), new C0192pa(64, 16))), new C0215ra(37, new C0204qa(30, new C0192pa(17, 122), new C0192pa(4, 123)), new C0204qa(28, new C0192pa(29, 46), new C0192pa(14, 47)), new C0204qa(30, new C0192pa(49, 24), new C0192pa(10, 25)), new C0204qa(30, new C0192pa(24, 15), new C0192pa(46, 16))), new C0215ra(38, new C0204qa(30, new C0192pa(4, 122), new C0192pa(18, 123)), new C0204qa(28, new C0192pa(13, 46), new C0192pa(32, 47)), new C0204qa(30, new C0192pa(48, 24), new C0192pa(14, 25)), new C0204qa(30, new C0192pa(42, 15), new C0192pa(32, 16))), new C0215ra(39, new C0204qa(30, new C0192pa(20, 117), new C0192pa(4, 118)), new C0204qa(28, new C0192pa(40, 47), new C0192pa(7, 48)), new C0204qa(30, new C0192pa(43, 24), new C0192pa(22, 25)), new C0204qa(30, new C0192pa(10, 15), new C0192pa(67, 16))), new C0215ra(40, new C0204qa(30, new C0192pa(19, 118), new C0192pa(6, 119)), new C0204qa(28, new C0192pa(18, 47), new C0192pa(31, 48)), new C0204qa(30, new C0192pa(34, 24), new C0192pa(34, 25)), new C0204qa(30, new C0192pa(20, 15), new C0192pa(61, 16)))};
    }

    public static C0215ra e(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return d[i - 1];
    }

    public final int b() {
        return (this.a * 4) + 17;
    }

    public final C0204qa c(int i) {
        C0204qa[] c0204qaArr = this.b;
        if (i != 0) {
            return c0204qaArr[i - 1];
        }
        throw null;
    }

    public final int d() {
        return this.c;
    }

    public final int f() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
