package com.github.catvod.spider.merge;

import java.io.Writer;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.u0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0241u0 extends AbstractC0074g0 {
    @Override // com.github.catvod.spider.merge.AbstractC0074g0
    public final int a(CharSequence charSequence, int i, Writer writer) {
        return b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean b(int i, Writer writer);
}
