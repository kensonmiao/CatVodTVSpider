package com.github.catvod.spider.merge;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
abstract class E8 extends F8 {
    protected String b;
    protected String c;
    private String d;
    private String f;
    K j;
    private StringBuilder e = new StringBuilder();
    private boolean g = false;
    private boolean h = false;
    boolean i = false;

    private void p() {
        this.h = true;
        String str = this.f;
        if (str != null) {
            this.e.append(str);
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(char c) {
        String valueOf = String.valueOf(c);
        String str = this.d;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.d = valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(String str) {
        String str2 = this.d;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(char c) {
        p();
        this.e.append(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(String str) {
        p();
        if (this.e.length() == 0) {
            this.f = str;
        } else {
            this.e.append(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int[] iArr) {
        p();
        for (int i : iArr) {
            this.e.appendCodePoint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(char c) {
        o(String.valueOf(c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(String str) {
        String str2 = this.b;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.b = str;
        this.c = F.j(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        if (this.d != null) {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return this.j != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final E8 s(String str) {
        this.b = str;
        this.c = F.j(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String t() {
        String str = this.b;
        R0.k(str == null || str.length() == 0);
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        if (this.j == null) {
            this.j = new K();
        }
        String str = this.d;
        if (str != null) {
            String trim = str.trim();
            this.d = trim;
            if (trim.length() > 0) {
                this.j.d(this.d, this.h ? this.e.length() > 0 ? this.e.toString() : this.f : this.g ? "" : null);
            }
        }
        this.d = null;
        this.g = false;
        this.h = false;
        F8.h(this.e);
        this.f = null;
    }

    /* JADX DEBUG: Method merged with bridge method */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.F8
    /* renamed from: v */
    public E8 g() {
        this.b = null;
        this.c = null;
        this.d = null;
        F8.h(this.e);
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String x() {
        String str = this.b;
        return str != null ? str : "[unset]";
    }
}
