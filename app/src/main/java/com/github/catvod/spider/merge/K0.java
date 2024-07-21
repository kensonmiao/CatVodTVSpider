package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class K0 extends C0026c0 {
    public K0(J8 j8) {
        super(j8);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<com.github.catvod.spider.merge.G8>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.C0026c0, com.github.catvod.spider.merge.K8
    public final G8 d(int i) {
        m();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return p(-i);
        }
        int i2 = this.c;
        for (int i3 = 1; i3 < i; i3++) {
            int i4 = i2 + 1;
            if (o(i4)) {
                i2 = n(i4);
            }
        }
        return (G8) this.b.get(i2);
    }

    @Override // com.github.catvod.spider.merge.C0026c0
    protected final int k(int i) {
        return n(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.github.catvod.spider.merge.G8>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.github.catvod.spider.merge.G8>, java.util.ArrayList] */
    protected final G8 p(int i) {
        if (i != 0) {
            int i2 = this.c;
            if (i2 - i >= 0) {
                for (int i3 = 1; i3 <= i && i2 > 0; i3++) {
                    i2--;
                    o(i2);
                    if (i2 >= size()) {
                        i2 = size() - 1;
                    } else {
                        while (i2 >= 0) {
                            G8 g8 = (G8) this.b.get(i2);
                            if (g8.e() != -1 && g8.g() != 0) {
                                i2--;
                            }
                        }
                    }
                }
                if (i2 < 0) {
                    return null;
                }
                return (G8) this.b.get(i2);
            }
        }
        return null;
    }
}
