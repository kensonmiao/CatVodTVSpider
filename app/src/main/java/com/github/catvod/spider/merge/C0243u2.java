package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.u2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0243u2 extends AbstractC0255v2 {
    private final String a;

    public C0243u2(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        return e12.e0().equals(this.a);
    }

    public final String toString() {
        return String.format("%s", this.a);
    }
}
