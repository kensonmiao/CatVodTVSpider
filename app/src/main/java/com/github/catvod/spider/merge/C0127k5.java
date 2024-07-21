package com.github.catvod.spider.merge;

import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.k5  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0127k5 extends AbstractC0074g0 {
    private final HashMap<String, String> b = new HashMap<>();
    private final HashSet<Character> c = new HashSet<>();
    private final int d;
    private final int e;

    public C0127k5(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.d = i;
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0074g0
    public final int a(CharSequence charSequence, int i, Writer writer) {
        if (this.c.contains(Character.valueOf(charSequence.charAt(i)))) {
            int i2 = this.e;
            if (i + i2 > charSequence.length()) {
                i2 = charSequence.length() - i;
            }
            while (i2 >= this.d) {
                String str = this.b.get(charSequence.subSequence(i, i + i2).toString());
                if (str != null) {
                    writer.write(str);
                    return i2;
                }
                i2--;
            }
            return 0;
        }
        return 0;
    }
}
