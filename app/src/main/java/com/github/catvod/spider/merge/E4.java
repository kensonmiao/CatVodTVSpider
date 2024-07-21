package com.github.catvod.spider.merge;

import java.io.Writer;
import java.util.Locale;

@Deprecated
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class E4 extends AbstractC0241u0 {
    private final int b = 32;
    private final int c = 127;

    @Override // com.github.catvod.spider.merge.AbstractC0241u0
    public final boolean b(int i, Writer writer) {
        if (i < this.b || i > this.c) {
            if (i <= 65535) {
                writer.write("\\u");
                char[] cArr = AbstractC0074g0.a;
                writer.write(cArr[(i >> 12) & 15]);
                writer.write(cArr[(i >> 8) & 15]);
                writer.write(cArr[(i >> 4) & 15]);
                writer.write(cArr[i & 15]);
                return true;
            }
            char[] chars = Character.toChars(i);
            StringBuilder a = A.a("\\u");
            String hexString = Integer.toHexString(chars[0]);
            Locale locale = Locale.ENGLISH;
            a.append(hexString.toUpperCase(locale));
            a.append("\\u");
            a.append(Integer.toHexString(chars[1]).toUpperCase(locale));
            writer.write(a.toString());
            return true;
        }
        return false;
    }
}
