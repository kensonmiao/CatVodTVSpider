package com.github.catvod.spider.merge;

import java.io.Writer;

@Deprecated
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class H5 extends AbstractC0241u0 {
    private final int b;
    private final int c;

    private H5(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static H5 c(int i, int i2) {
        return new H5(i, i2);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0241u0
    public final boolean b(int i, Writer writer) {
        if (i < this.b || i > this.c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
