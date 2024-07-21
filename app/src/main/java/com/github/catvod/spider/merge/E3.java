package com.github.catvod.spider.merge;

import java.util.Arrays;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class E3 {
    private final Object[] a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(Object... objArr) {
        this.a = objArr;
        this.b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E3.class == obj.getClass()) {
            return Arrays.deepEquals(this.a, ((E3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
