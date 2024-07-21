package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.qa  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0204qa {
    private final int a;
    private final C0192pa[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0204qa(int i, C0192pa... c0192paArr) {
        this.a = i;
        this.b = c0192paArr;
    }

    public final C0192pa[] a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        int i = 0;
        for (C0192pa c0192pa : this.b) {
            i += c0192pa.a();
        }
        return i;
    }

    public final int d() {
        int i = this.a;
        int i2 = 0;
        for (C0192pa c0192pa : this.b) {
            i2 += c0192pa.a();
        }
        return i * i2;
    }
}
