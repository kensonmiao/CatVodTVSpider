package com.github.catvod.spider.merge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class K implements Iterable<H>, Cloneable {
    private int c = 0;
    String[] d = new String[3];
    String[] e = new String[3];

    private void g(int i) {
        R0.m(i >= this.c);
        String[] strArr = this.d;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.c * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.d = (String[]) Arrays.copyOf(strArr, i);
        this.e = (String[]) Arrays.copyOf(this.e, i);
    }

    private int p(String str) {
        R0.p(str);
        for (int i = 0; i < this.c; i++) {
            if (str.equalsIgnoreCase(this.d[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean q(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public void v(int i) {
        R0.k(i >= this.c);
        int i2 = (this.c - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.d;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.e;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.c - 1;
        this.c = i4;
        this.d[i4] = null;
        this.e[i4] = null;
    }

    public final K d(String str, @Nullable String str2) {
        g(this.c + 1);
        String[] strArr = this.d;
        int i = this.c;
        strArr[i] = str;
        this.e[i] = str2;
        this.c = i + 1;
        return this;
    }

    public final void e(K k) {
        if (k.size() == 0) {
            return;
        }
        g(this.c + k.c);
        int i = 0;
        while (true) {
            if (i >= k.c || !k.q(k.d[i])) {
                if (!(i < k.c)) {
                    return;
                }
                i++;
                s(new H(k.d[i], k.e[i], k));
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k = (K) obj;
        if (this.c == k.c && Arrays.equals(this.d, k.d)) {
            return Arrays.equals(this.e, k.e);
        }
        return false;
    }

    public final List<H> f() {
        ArrayList arrayList = new ArrayList(this.c);
        for (int i = 0; i < this.c; i++) {
            if (!q(this.d[i])) {
                arrayList.add(new H(this.d[i], this.e[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public final K clone() {
        try {
            K k = (K) super.clone();
            k.c = this.c;
            this.d = (String[]) Arrays.copyOf(this.d, this.c);
            this.e = (String[]) Arrays.copyOf(this.e, this.c);
            return k;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return (((this.c * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    public final int i(C0020b6 c0020b6) {
        int i = 0;
        if (this.c == 0) {
            return 0;
        }
        boolean d = c0020b6.d();
        int i2 = 0;
        while (i < this.d.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.d;
                if (i4 < strArr.length && strArr[i4] != null) {
                    if (!d || !strArr[i].equals(strArr[i4])) {
                        if (!d) {
                            String[] strArr2 = this.d;
                            if (!strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    v(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<H> iterator() {
        return new J(this);
    }

    public final String j(String str) {
        String str2;
        int o = o(str);
        return (o == -1 || (str2 = this.e[o]) == null) ? "" : str2;
    }

    public final String k(String str) {
        String str2;
        int p = p(str);
        return (p == -1 || (str2 = this.e[p]) == null) ? "" : str2;
    }

    public final boolean l(String str) {
        return o(str) != -1;
    }

    public final boolean m(String str) {
        return p(str) != -1;
    }

    public final void n(Appendable appendable, C0278x1 c0278x1) {
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (!q(this.d[i2])) {
                String str = this.d[i2];
                String str2 = this.e[i2];
                appendable.append(' ').append(str);
                if (!H.c(str, str2, c0278x1)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    L1.d(appendable, str2, c0278x1, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    public final int o(String str) {
        R0.p(str);
        for (int i = 0; i < this.c; i++) {
            if (str.equals(this.d[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void r() {
        for (int i = 0; i < this.c; i++) {
            String[] strArr = this.d;
            strArr[i] = F.j(strArr[i]);
        }
    }

    public final K s(H h) {
        t(h.a(), h.b());
        h.e = this;
        return this;
    }

    public final int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (!q(this.d[i2])) {
                i++;
            }
        }
        return i;
    }

    public final K t(String str, String str2) {
        R0.p(str);
        int o = o(str);
        if (o != -1) {
            this.e[o] = str2;
        } else {
            d(str, str2);
        }
        return this;
    }

    public final String toString() {
        StringBuilder a = C0308z7.a();
        try {
            n(a, new C0290y1().s0());
            return C0308z7.g(a);
        } catch (IOException e) {
            throw new C0165n7(e);
        }
    }

    public final void u(String str, @Nullable String str2) {
        int p = p(str);
        if (p == -1) {
            d(str, str2);
            return;
        }
        this.e[p] = str2;
        if (this.d[p].equals(str)) {
            return;
        }
        this.d[p] = str;
    }
}
