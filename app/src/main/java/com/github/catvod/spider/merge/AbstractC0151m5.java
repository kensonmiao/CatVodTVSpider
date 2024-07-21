package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.m5 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0151m5 extends Y0 {
    public abstract AbstractC0151m5 f();

    public final String g() {
        AbstractC0151m5 abstractC0151m5;
        int i = C0254v1.a;
        AbstractC0151m5 abstractC0151m52 = C0163n5.a;
        if (this == abstractC0151m52) {
            return "Dispatchers.Main";
        }
        try {
            abstractC0151m5 = abstractC0151m52.f();
        } catch (UnsupportedOperationException unused) {
            abstractC0151m5 = null;
        }
        if (this == abstractC0151m5) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.Y0
    public String toString() {
        String g = g();
        if (g != null) {
            return g;
        }
        return getClass().getSimpleName() + '@' + E.e(this);
    }
}
