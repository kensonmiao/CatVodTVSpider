package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class B implements Iterator<Object> {
    final Object[] a;
    int b = 0;
    boolean c = true;
    final /* synthetic */ C d;

    public B(C c, Object[] objArr) {
        this.d = c;
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.c = false;
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            throw new IllegalStateException();
        }
        this.d.remove(this.a[this.b - 1]);
        this.c = true;
    }
}
