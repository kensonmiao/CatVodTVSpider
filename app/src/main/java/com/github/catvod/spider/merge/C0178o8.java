package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.o8  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0178o8 {
    private static volatile AbstractC0273w8 d = AbstractC0273w8.s;
    private final StringBuffer a;
    private final Object b;
    private final AbstractC0273w8 c;

    public C0178o8(Object obj) {
        AbstractC0273w8 abstractC0273w8 = d;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.a = stringBuffer;
        this.c = abstractC0273w8;
        this.b = obj;
        abstractC0273w8.m(stringBuffer, obj);
    }

    public final C0178o8 a(Object obj) {
        this.c.a(this.a, obj);
        return this;
    }

    public final C0178o8 b(String str, boolean z) {
        this.c.b(this.a, str, z);
        return this;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            this.a.append(this.c.s());
        } else {
            this.c.h(this.a, obj);
        }
        return this.a.toString();
    }
}
