package com.github.catvod.spider.merge;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class Aa implements Comparable<Aa> {
    private Object c;
    private boolean d = false;
    private boolean e = false;

    public Aa(Object obj) {
        this.c = obj;
    }

    public final Boolean a() {
        Object obj = this.c;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || A7.b(g())) ? false : true);
    }

    public final Date b() {
        Object obj = this.c;
        if (obj instanceof String) {
            try {
                return C0147m1.a.c((String) obj);
            } catch (ParseException unused) {
                StringBuilder a = A.a("cast to date fail. vale = ");
                a.append(this.c);
                throw new fb(a.toString());
            }
        } else if (obj instanceof Date) {
            return (Date) obj;
        } else {
            StringBuilder a2 = A.a("cast to date fail. vale = ");
            a2.append(this.c);
            throw new fb(a2.toString());
        }
    }

    public final Double c() {
        double doubleValue;
        Object obj = this.c;
        if (obj instanceof String) {
            doubleValue = new BigDecimal((String) this.c).doubleValue();
        } else if (!(obj instanceof Number)) {
            StringBuilder a = A.a("cast to number fail. vale = ");
            a.append(this.c);
            throw new fb(a.toString());
        } else {
            doubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(doubleValue);
    }

    public final F1 d() {
        return (F1) this.c;
    }

    public final List<String> e() {
        return (List) this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Aa.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.c;
        Object obj3 = ((Aa) obj).c;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public final Long f() {
        long longValue;
        Object obj = this.c;
        if (obj instanceof String) {
            longValue = new BigDecimal((String) this.c).setScale(0, 4).longValue();
        } else if (!(obj instanceof Number)) {
            StringBuilder a = A.a("cast to number fail. vale = ");
            a.append(this.c);
            throw new fb(a.toString());
        } else {
            longValue = ((Number) obj).longValue();
        }
        return Long.valueOf(longValue);
    }

    public final String g() {
        Object obj = this.c;
        if (obj instanceof F1) {
            StringBuilder sb = new StringBuilder();
            Iterator<E1> it = ((F1) this.c).iterator();
            while (it.hasNext()) {
                sb.append(it.next().f0());
            }
            return sb.toString();
        }
        if (obj instanceof E1) {
            String n0 = ((E1) obj).n0();
            if (n0 == "JX_TEXT" || (n0 != null && n0.equals("JX_TEXT"))) {
                return ((E1) this.c).f0();
            }
        }
        Object obj2 = this.c;
        return obj2 instanceof List ? A7.e((List) obj2, ",") : String.valueOf(obj2).trim();
    }

    public final Aa h() {
        this.d = true;
        return this;
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // java.lang.Comparable
    /* renamed from: i */
    public final int compareTo(Aa aa) {
        if (equals(aa)) {
            return 0;
        }
        if (aa == null || aa.c == null) {
            return 1;
        }
        Object obj = this.c;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return g().compareTo(aa.g());
        }
        if (obj instanceof Number) {
            return c().compareTo(aa.c());
        }
        StringBuilder a = A.a("Unsupported comparable XValue = ");
        a.append(toString());
        throw new fb(a.toString());
    }

    public final Aa j() {
        this.e = true;
        this.c = A7.f(A7.f(A7.g(A7.g(String.valueOf(this.c), "'"), "\""), "'"), "\"");
        return this;
    }

    public final boolean k() {
        return this.d;
    }

    public final boolean l() {
        return this.c instanceof Boolean;
    }

    public final boolean m() {
        return this.c instanceof Date;
    }

    public final boolean n() {
        return this.c instanceof F1;
    }

    public final boolean o() {
        return this.e;
    }

    public final boolean p() {
        return this.c instanceof List;
    }

    public final boolean q() {
        return this.c instanceof Number;
    }

    public final boolean r() {
        return this.c instanceof String;
    }

    public final Class s() {
        Object obj = this.c;
        return obj == null ? Object.class : obj.getClass();
    }

    public final String toString() {
        C0178o8 c0178o8 = new C0178o8(this);
        c0178o8.a(this.c);
        c0178o8.b("isAttr", this.d);
        c0178o8.b("isExprStr", this.e);
        return c0178o8.toString();
    }
}
