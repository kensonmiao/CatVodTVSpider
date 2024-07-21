package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.github.catvod.spider.merge.v3 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0256v3 implements Serializable {
    private static final InterfaceC0089h3[] h = new InterfaceC0089h3[0];
    private static final ConcurrentMap<C0125k3, String> i = new ConcurrentHashMap(7);
    private final String c;
    private final TimeZone d;
    private final Locale e;
    private transient InterfaceC0089h3[] f;
    private transient int g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0206 A[LOOP:2: B:276:0x0202->B:278:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0210 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0256v3(java.lang.String r17, java.util.TimeZone r18, java.util.Locale r19) {
        /*
            r16 = this;
            r0 = r16
            r16.<init>()
            r1 = r17
            r0.c = r1
            r2 = r18
            r0.d = r2
            java.util.Locale r2 = com.github.catvod.spider.merge.C0043d5.a(r19)
            r0.e = r2
            java.text.DateFormatSymbols r3 = new java.text.DateFormatSymbols
            r3.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String[] r4 = r3.getEras()
            java.lang.String[] r5 = r3.getMonths()
            java.lang.String[] r6 = r3.getShortMonths()
            java.lang.String[] r7 = r3.getWeekdays()
            java.lang.String[] r8 = r3.getShortWeekdays()
            java.lang.String[] r3 = r3.getAmPmStrings()
            int r1 = r17.length()
            r9 = 1
            int[] r9 = new int[r9]
            r10 = 0
            r11 = 0
        L3e:
            if (r11 >= r1) goto L1f6
            r9[r10] = r11
            java.lang.String r11 = r0.c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r10 = r9[r10]
            int r13 = r11.length()
            char r14 = r11.charAt(r10)
            r15 = 65
            r17 = r1
            r1 = 122(0x7a, float:1.71E-43)
            if (r14 < r15) goto L5f
            r15 = 90
            if (r14 <= r15) goto L65
        L5f:
            r15 = 97
            if (r14 < r15) goto L77
            if (r14 > r1) goto L77
        L65:
            r12.append(r14)
        L68:
            int r1 = r10 + 1
            if (r1 >= r13) goto Lbf
            char r15 = r11.charAt(r1)
            if (r15 != r14) goto Lbf
            r12.append(r14)
            r10 = r1
            goto L68
        L77:
            r1 = 39
            r12.append(r1)
            r14 = 0
        L7d:
            if (r10 >= r13) goto Lbf
            char r15 = r11.charAt(r10)
            if (r15 != r1) goto L9e
            int r1 = r10 + 1
            r18 = r7
            if (r1 >= r13) goto L9b
            char r7 = r11.charAt(r1)
            r19 = r1
            r1 = 39
            if (r7 != r1) goto L9b
            r12.append(r15)
            r10 = r19
            goto Lb8
        L9b:
            r14 = r14 ^ 1
            goto Lb8
        L9e:
            r18 = r7
            r1 = 65
            if (r14 != 0) goto Lb5
            if (r15 < r1) goto Laa
            r1 = 90
            if (r15 <= r1) goto Lb2
        Laa:
            r1 = 97
            if (r15 < r1) goto Lb5
            r1 = 122(0x7a, float:1.71E-43)
            if (r15 > r1) goto Lb5
        Lb2:
            int r10 = r10 + (-1)
            goto Lc1
        Lb5:
            r12.append(r15)
        Lb8:
            r1 = 1
            int r10 = r10 + r1
            r1 = 39
            r7 = r18
            goto L7d
        Lbf:
            r18 = r7
        Lc1:
            r1 = 0
            r9[r1] = r10
            java.lang.String r7 = r12.toString()
            r10 = r9[r1]
            int r11 = r7.length()
            if (r11 != 0) goto Ld2
            goto L1f6
        Ld2:
            char r1 = r7.charAt(r1)
            r12 = 121(0x79, float:1.7E-43)
            if (r1 == r12) goto L1cf
            r12 = 122(0x7a, float:1.71E-43)
            if (r1 == r12) goto L1bd
            r12 = 11
            r13 = 7
            r14 = 10
            r15 = 3
            switch(r1) {
                case 39: goto L153;
                case 75: goto L18a;
                case 77: goto L134;
                case 83: goto L131;
                case 97: goto L128;
                case 100: goto L126;
                case 104: goto L11b;
                case 107: goto L110;
                case 109: goto L10c;
                case 115: goto L108;
                case 117: goto Lfd;
                case 119: goto Lfa;
                default: goto Le7;
            }
        Le7:
            r14 = 0
            switch(r1) {
                case 68: goto L189;
                case 69: goto L17b;
                case 70: goto L178;
                case 71: goto L171;
                case 72: goto L1b8;
                default: goto Leb;
            }
        Leb:
            switch(r1) {
                case 87: goto L1b7;
                case 88: goto L19e;
                case 89: goto L1cf;
                case 90: goto L18f;
                default: goto Lee;
            }
        Lee:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal pattern component: "
            java.lang.String r2 = com.github.catvod.spider.merge.C0288y.a(r2, r7)
            r1.<init>(r2)
            throw r1
        Lfa:
            r14 = 3
            goto L18a
        Lfd:
            com.github.catvod.spider.merge.d3 r1 = new com.github.catvod.spider.merge.d3
            com.github.catvod.spider.merge.f3 r7 = r0.i(r13, r11)
            r1.<init>(r7)
            goto L1ea
        L108:
            r14 = 13
            goto L18a
        L10c:
            r14 = 12
            goto L18a
        L110:
            com.github.catvod.spider.merge.o3 r1 = new com.github.catvod.spider.merge.o3
            com.github.catvod.spider.merge.f3 r7 = r0.i(r12, r11)
            r1.<init>(r7)
            goto L1ea
        L11b:
            com.github.catvod.spider.merge.n3 r1 = new com.github.catvod.spider.merge.n3
            com.github.catvod.spider.merge.f3 r7 = r0.i(r14, r11)
            r1.<init>(r7)
            goto L1ea
        L126:
            r14 = 5
            goto L18a
        L128:
            com.github.catvod.spider.merge.j3 r1 = new com.github.catvod.spider.merge.j3
            r7 = 9
            r1.<init>(r7, r3)
            goto L1ea
        L131:
            r14 = 14
            goto L18a
        L134:
            r1 = 4
            if (r11 < r1) goto L13f
            com.github.catvod.spider.merge.j3 r1 = new com.github.catvod.spider.merge.j3
            r7 = 2
            r1.<init>(r7, r5)
            goto L1ea
        L13f:
            r1 = 2
            if (r11 != r15) goto L149
            com.github.catvod.spider.merge.j3 r7 = new com.github.catvod.spider.merge.j3
            r7.<init>(r1, r6)
            goto L1e9
        L149:
            if (r11 != r1) goto L14f
            com.github.catvod.spider.merge.p3 r1 = com.github.catvod.spider.merge.C0185p3.a
            goto L1ea
        L14f:
            com.github.catvod.spider.merge.s3 r1 = com.github.catvod.spider.merge.C0220s3.a
            goto L1ea
        L153:
            r1 = 1
            java.lang.String r7 = r7.substring(r1)
            int r11 = r7.length()
            if (r11 != r1) goto L16a
            com.github.catvod.spider.merge.c3 r1 = new com.github.catvod.spider.merge.c3
            r11 = 0
            char r7 = r7.charAt(r11)
            r1.<init>(r7)
            goto L1ea
        L16a:
            com.github.catvod.spider.merge.i3 r1 = new com.github.catvod.spider.merge.i3
            r1.<init>(r7)
            goto L1ea
        L171:
            com.github.catvod.spider.merge.j3 r1 = new com.github.catvod.spider.merge.j3
            r1.<init>(r14, r4)
            goto L1ea
        L178:
            r14 = 8
            goto L18a
        L17b:
            com.github.catvod.spider.merge.j3 r1 = new com.github.catvod.spider.merge.j3
            r7 = 4
            if (r11 >= r7) goto L182
            r7 = r8
            goto L184
        L182:
            r7 = r18
        L184:
            r1.<init>(r13, r7)
            goto L1ea
        L189:
            r14 = 6
        L18a:
            com.github.catvod.spider.merge.f3 r1 = r0.i(r14, r11)
            goto L1ea
        L18f:
            r1 = 1
            if (r11 != r1) goto L195
            com.github.catvod.spider.merge.m3 r1 = com.github.catvod.spider.merge.C0149m3.c
            goto L1ea
        L195:
            r1 = 2
            if (r11 != r1) goto L19b
            com.github.catvod.spider.merge.e3 r1 = com.github.catvod.spider.merge.C0053e3.d
            goto L1ea
        L19b:
            com.github.catvod.spider.merge.m3 r1 = com.github.catvod.spider.merge.C0149m3.b
            goto L1ea
        L19e:
            r1 = 1
            r7 = 2
            if (r11 == r1) goto L1b4
            if (r11 == r7) goto L1b1
            if (r11 != r15) goto L1a9
            com.github.catvod.spider.merge.e3 r1 = com.github.catvod.spider.merge.C0053e3.d
            goto L1ea
        L1a9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid number of X"
            r1.<init>(r2)
            throw r1
        L1b1:
            com.github.catvod.spider.merge.e3 r1 = com.github.catvod.spider.merge.C0053e3.c
            goto L1ea
        L1b4:
            com.github.catvod.spider.merge.e3 r1 = com.github.catvod.spider.merge.C0053e3.b
            goto L1ea
        L1b7:
            r12 = 4
        L1b8:
            com.github.catvod.spider.merge.f3 r1 = r0.i(r12, r11)
            goto L1ea
        L1bd:
            com.github.catvod.spider.merge.l3 r1 = new com.github.catvod.spider.merge.l3
            java.util.TimeZone r7 = r0.d
            r12 = 4
            if (r11 < r12) goto L1c8
            java.util.Locale r11 = r0.e
            r12 = 1
            goto L1cb
        L1c8:
            java.util.Locale r11 = r0.e
            r12 = 0
        L1cb:
            r1.<init>(r7, r11, r12)
            goto L1ea
        L1cf:
            r7 = 2
            if (r11 != r7) goto L1d5
            com.github.catvod.spider.merge.r3 r7 = com.github.catvod.spider.merge.C0208r3.a
            goto L1df
        L1d5:
            r7 = 4
            int r7 = java.lang.Math.max(r11, r7)
            r11 = 1
            com.github.catvod.spider.merge.f3 r7 = r0.i(r11, r7)
        L1df:
            r11 = 89
            if (r1 != r11) goto L1e9
            com.github.catvod.spider.merge.u3 r1 = new com.github.catvod.spider.merge.u3
            r1.<init>(r7)
            goto L1ea
        L1e9:
            r1 = r7
        L1ea:
            r2.add(r1)
            int r11 = r10 + 1
            r10 = 0
            r1 = r17
            r7 = r18
            goto L3e
        L1f6:
            com.github.catvod.spider.merge.h3[] r1 = com.github.catvod.spider.merge.C0256v3.h
            java.lang.Object[] r1 = r2.toArray(r1)
            com.github.catvod.spider.merge.h3[] r1 = (com.github.catvod.spider.merge.InterfaceC0089h3[]) r1
            r0.f = r1
            int r1 = r1.length
            r2 = 0
        L202:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L210
            com.github.catvod.spider.merge.h3[] r3 = r0.f
            r3 = r3[r1]
            int r3 = r3.b()
            int r2 = r2 + r3
            goto L202
        L210:
            r0.g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0256v3.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    public static void a(Appendable appendable, int i2) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    public static void b(Appendable appendable, int i2, int i3) {
        if (i2 < 10000) {
            int i4 = i2 < 1000 ? i2 < 100 ? i2 < 10 ? 1 : 2 : 3 : 4;
            for (int i5 = i3 - i4; i5 > 0; i5--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        ((StringBuilder) appendable).append((char) ((i2 / 1000) + 48));
                        i2 %= 1000;
                    }
                    if (i2 >= 100) {
                        ((StringBuilder) appendable).append((char) ((i2 / 100) + 48));
                        i2 %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i2 >= 10) {
                    ((StringBuilder) appendable).append((char) ((i2 / 10) + 48));
                    i2 %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i2 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i6 = 0;
        while (i2 != 0) {
            cArr[i6] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i6++;
        }
        while (i6 < i3) {
            ((StringBuilder) appendable).append('0');
            i3--;
        }
        while (true) {
            i6--;
            if (i6 < 0) {
                return;
            }
            ((StringBuilder) appendable).append(cArr[i6]);
        }
    }

    private String c(Calendar calendar) {
        StringBuilder sb = new StringBuilder(this.g);
        try {
            for (InterfaceC0089h3 interfaceC0089h3 : this.f) {
                interfaceC0089h3.c(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.k3, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public static String h(TimeZone timeZone, boolean z, int i2, Locale locale) {
        C0125k3 c0125k3 = new C0125k3(timeZone, z, i2, locale);
        ?? r1 = i;
        String str = (String) r1.get(c0125k3);
        if (str == null) {
            String displayName = timeZone.getDisplayName(z, i2, locale);
            String str2 = (String) r1.putIfAbsent(c0125k3, displayName);
            return str2 != null ? str2 : displayName;
        }
        return str;
    }

    public final String d(Object obj) {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.d, this.e);
            calendar.setTime((Date) obj);
            return c(calendar);
        } else if (obj instanceof Calendar) {
            Calendar calendar2 = (Calendar) obj;
            StringBuilder sb = new StringBuilder(this.g);
            if (!calendar2.getTimeZone().equals(this.d)) {
                calendar2 = (Calendar) calendar2.clone();
                calendar2.setTimeZone(this.d);
            }
            try {
                for (InterfaceC0089h3 interfaceC0089h3 : this.f) {
                    interfaceC0089h3.c(sb, calendar2);
                }
                return sb.toString();
            } catch (IOException e) {
                throw e;
            }
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            Calendar calendar3 = Calendar.getInstance(this.d, this.e);
            calendar3.setTimeInMillis(longValue);
            return c(calendar3);
        } else {
            StringBuilder a = A.a("Unknown class: ");
            a.append(obj == null ? "<null>" : obj.getClass().getName());
            throw new IllegalArgumentException(a.toString());
        }
    }

    public final Locale e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0256v3) {
            C0256v3 c0256v3 = (C0256v3) obj;
            return this.c.equals(c0256v3.c) && this.d.equals(c0256v3.d) && this.e.equals(c0256v3.e);
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public final TimeZone g() {
        return this.d;
    }

    public final int hashCode() {
        return (((this.e.hashCode() * 13) + this.d.hashCode()) * 13) + this.c.hashCode();
    }

    protected final InterfaceC0065f3 i(int i2, int i3) {
        return i3 != 1 ? i3 != 2 ? new C0077g3(i2, i3) : new C0197q3(i2) : new C0232t3(i2);
    }

    public final String toString() {
        StringBuilder a = A.a("FastDatePrinter[");
        a.append(this.c);
        a.append(",");
        a.append(this.e);
        a.append(",");
        a.append(this.d.getID());
        a.append("]");
        return a.toString();
    }
}
