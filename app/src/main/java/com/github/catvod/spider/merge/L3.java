package com.github.catvod.spider.merge;

import java.util.Date;
import java.util.TimeZone;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class L3 extends TimeZone {
    private final int c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L3(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + " hours out of range");
        } else if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + " minutes out of range");
        } else {
            int i3 = ((i * 60) + i2) * 60000;
            this.c = z ? -i3 : i3;
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            sb.append(z ? '-' : '+');
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
            sb.append(':');
            sb.append((char) ((i2 / 10) + 48));
            sb.append((char) ((i2 % 10) + 48));
            this.d = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof L3) && this.d == ((L3) obj).d;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.d;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.c;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.c;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder a = A.a("[GmtTimeZone id=\"");
        a.append(this.d);
        a.append("\",offset=");
        a.append(this.c);
        a.append(']');
        return a.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
