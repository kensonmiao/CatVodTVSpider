package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.InterfaceC0166n8;
import java.lang.Comparable;

/* renamed from: com.github.catvod.spider.merge.m8  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0154m8<T extends InterfaceC0166n8 & Comparable<? super T>> {
    private volatile int _size;
    private T[] a;

    private final void d(int i, int i2) {
        T[] tArr = this.a;
        C0305z4.f(tArr);
        T t = tArr[i2];
        C0305z4.f(t);
        T t2 = tArr[i];
        C0305z4.f(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.b();
        t2.b();
    }

    public final T a() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final boolean b() {
        return this._size == 0;
    }

    /* JADX DEBUG: Incorrect args count in method signature: (I)TT; */
    public final InterfaceC0166n8 c() {
        T[] tArr = this.a;
        C0305z4.f(tArr);
        this._size--;
        if (this._size > 0) {
            int i = 0;
            d(0, this._size);
            while (true) {
                int i2 = (i * 2) + 1;
                if (i2 >= this._size) {
                    break;
                }
                T[] tArr2 = this.a;
                C0305z4.f(tArr2);
                int i3 = i2 + 1;
                if (i3 < this._size) {
                    T t = tArr2[i3];
                    C0305z4.f(t);
                    T t2 = tArr2[i2];
                    C0305z4.f(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr2[i];
                C0305z4.f(t3);
                T t4 = tArr2[i2];
                C0305z4.f(t4);
                if (((Comparable) t3).compareTo(t4) <= 0) {
                    break;
                }
                d(i, i2);
                i = i2;
            }
        }
        T t5 = tArr[this._size];
        C0305z4.f(t5);
        t5.a(null);
        t5.b();
        tArr[this._size] = null;
        return t5;
    }
}
