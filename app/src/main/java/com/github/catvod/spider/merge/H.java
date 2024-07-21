package com.github.catvod.spider.merge;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class H implements Map.Entry<String, String>, Cloneable {
    private static final String[] f = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String c;
    @Nullable
    private String d;
    @Nullable
    K e;

    public H(String str, @Nullable String str2, @Nullable K k) {
        R0.p(str);
        String trim = str.trim();
        R0.n(trim);
        this.c = trim;
        this.d = str2;
        this.e = k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean c(String str, @Nullable String str2, C0278x1 c0278x1) {
        if (c0278x1.g() == 1) {
            if (str2 != null) {
                if (!str2.isEmpty() && !str2.equalsIgnoreCase(str)) {
                    return false;
                }
                if (!(Arrays.binarySearch(f, str) >= 0)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        String str = this.d;
        return str == null ? "" : str;
    }

    public final Object clone() {
        try {
            return (H) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h = (H) obj;
        String str = this.c;
        if (str == null ? h.c == null : str.equals(h.c)) {
            String str2 = this.d;
            String str3 = h.d;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.c;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.d;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.c;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2 = str;
        String str3 = this.d;
        K k = this.e;
        if (k != null) {
            str3 = k.j(this.c);
            int o = this.e.o(this.c);
            if (o != -1) {
                this.e.e[o] = str2;
            }
        }
        this.d = str2;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder a = C0308z7.a();
        try {
            C0278x1 s0 = new C0290y1().s0();
            String str = this.c;
            String str2 = this.d;
            a.append((CharSequence) str);
            if (!c(str, str2, s0)) {
                a.append((CharSequence) "=\"");
                if (str2 == null) {
                    str2 = "";
                }
                L1.d(a, str2, s0, true, false, false);
                a.append('\"');
            }
            return C0308z7.g(a);
        } catch (IOException e) {
            throw new C0165n7(e);
        }
    }
}
