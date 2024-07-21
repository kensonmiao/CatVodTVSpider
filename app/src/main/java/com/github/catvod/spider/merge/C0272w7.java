package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.StringWriter;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.w7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0272w7 {
    public static final C0216s a;
    public static final C0216s b;

    static {
        C0127k5 c0127k5 = new C0127k5(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        AbstractC0074g0[] abstractC0074g0Arr = {new C0127k5(M1.i())};
        AbstractC0074g0[] abstractC0074g0Arr2 = new AbstractC0074g0[2];
        abstractC0074g0Arr2[0] = c0127k5;
        System.arraycopy(abstractC0074g0Arr, 0, abstractC0074g0Arr2, 1, 1);
        C0216s c0216s = new C0216s(abstractC0074g0Arr2);
        AbstractC0074g0[] abstractC0074g0Arr3 = {new E4()};
        AbstractC0074g0[] abstractC0074g0Arr4 = new AbstractC0074g0[2];
        abstractC0074g0Arr4[0] = c0216s;
        System.arraycopy(abstractC0074g0Arr3, 0, abstractC0074g0Arr4, 1, 1);
        new C0216s(abstractC0074g0Arr4);
        new C0216s(new C0127k5(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C0127k5(M1.i()), new E4());
        a = new C0216s(new C0127k5(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C0127k5(M1.i()), new E4());
        new C0216s(new C0127k5(M1.c()), new C0127k5(M1.a()));
        new C0216s(new C0127k5(M1.c()), new C0127k5(M1.a()), new C0127k5(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), H5.c(127, 132), H5.c(134, 159), new C0108ia());
        new C0216s(new C0127k5(M1.c()), new C0127k5(M1.a()), new C0127k5(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), H5.c(1, 8), H5.c(14, 31), H5.c(127, 132), H5.c(134, 159), new C0108ia());
        new C0216s(new C0127k5(M1.c()), new C0127k5(M1.g()));
        new C0216s(new C0127k5(M1.c()), new C0127k5(M1.g()), new C0127k5(M1.e()));
        b = new C0216s(new R5(), new C0096ha(), new C0127k5(M1.j()), new C0127k5(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
        new C0216s(new C0127k5(M1.d()), new C0127k5(M1.h()), new J5(new I5[0]));
        new C0216s(new C0127k5(M1.d()), new C0127k5(M1.h()), new C0127k5(M1.f()), new J5(new I5[0]));
        new C0216s(new C0127k5(M1.d()), new C0127k5(M1.b()), new J5(new I5[0]));
    }

    public static final String a(String str) {
        C0216s c0216s = a;
        c0216s.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int i = 0;
            while (i < length) {
                int a2 = c0216s.a(str, i, stringWriter);
                if (a2 == 0) {
                    char charAt = str.charAt(i);
                    stringWriter.write(charAt);
                    i++;
                    if (Character.isHighSurrogate(charAt) && i < length) {
                        char charAt2 = str.charAt(i);
                        if (Character.isLowSurrogate(charAt2)) {
                            stringWriter.write(charAt2);
                            i++;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < a2; i2++) {
                        i += Character.charCount(Character.codePointAt(str, i));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
