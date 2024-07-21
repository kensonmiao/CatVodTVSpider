package com.github.catvod.spider.merge;

import java.util.function.Supplier;

/* renamed from: com.github.catvod.spider.merge.na  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final /* synthetic */ class C0168na implements Supplier {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object[] b;

    public /* synthetic */ C0168na(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.a, this.b);
    }
}
