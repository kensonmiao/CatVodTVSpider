package com.github.catvod.spider.merge;

import android.os.Handler;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class M3 extends N3 {
    private volatile M3 _immediate;
    private final M3 e;
    private final Handler f;
    private final String g;
    private final boolean h;

    public M3(Handler handler) {
        this(handler, null, false);
    }

    private M3(Handler handler, String str, boolean z) {
        super(null);
        this.f = handler;
        this.g = str;
        this.h = z;
        this._immediate = z ? this : null;
        M3 m3 = this._immediate;
        if (m3 == null) {
            m3 = new M3(handler, str, true);
            this._immediate = m3;
        }
        this.e = m3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof M3) && ((M3) obj).f == this.f;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0151m5
    public final AbstractC0151m5 f() {
        return this.e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0151m5, com.github.catvod.spider.merge.Y0
    public final String toString() {
        String g = g();
        if (g != null) {
            return g;
        }
        String str = this.g;
        if (str == null) {
            str = this.f.toString();
        }
        return this.h ? C0288y.a(str, ".immediate") : str;
    }
}
