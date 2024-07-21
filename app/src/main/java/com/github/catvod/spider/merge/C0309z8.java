package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.z8  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class C0309z8 extends F8 {
    private final StringBuilder b = new StringBuilder();
    private String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0309z8() {
        this.a = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.F8
    public final F8 g() {
        F8.h(this.b);
        this.c = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0309z8 i(char c) {
        String str = this.c;
        if (str != null) {
            this.b.append(str);
            this.c = null;
        }
        this.b.append(c);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0309z8 j(String str) {
        String str2 = this.c;
        if (str2 != null) {
            this.b.append(str2);
            this.c = null;
        }
        if (this.b.length() == 0) {
            this.c = str;
        } else {
            this.b.append(str);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String k() {
        String str = this.c;
        return str != null ? str : this.b.toString();
    }

    public final String toString() {
        StringBuilder a = A.a("<!--");
        String str = this.c;
        if (str == null) {
            str = this.b.toString();
        }
        return C0158n0.a(a, str, "-->");
    }
}
