package com.github.catvod.spider.merge;

import java.io.Writer;

/* renamed from: com.github.catvod.spider.merge.u7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class C0248u7 extends AbstractC0074g0 {
    private static final String b = String.valueOf('\"');
    private static final char[] c = {',', '\"', '\r', '\n'};

    @Override // com.github.catvod.spider.merge.AbstractC0074g0
    public final int a(CharSequence charSequence, int i, Writer writer) {
        boolean z;
        if (i == 0) {
            String charSequence2 = charSequence.toString();
            char[] cArr = c;
            int i2 = A7.a;
            if (charSequence2 != null && cArr != null) {
                int length = charSequence2.length();
                int i3 = length - 1;
                int length2 = cArr.length;
                int i4 = length2 - 1;
                loop0: for (int i5 = 0; i5 < length; i5++) {
                    char charAt = charSequence2.charAt(i5);
                    for (int i6 = 0; i6 < length2; i6++) {
                        if (cArr[i6] == charAt && (!Character.isHighSurrogate(charAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == charSequence2.charAt(i5 + 1)))) {
                            z = false;
                            break loop0;
                        }
                    }
                }
            }
            z = true;
            if (z) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String charSequence3 = charSequence.toString();
                String str = b;
                writer.write(A7.h(charSequence3, str, str + str));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
        throw new IllegalStateException("CsvEscaper should never reach the [1] index");
    }
}
