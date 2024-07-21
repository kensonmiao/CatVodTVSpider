package com.github.catvod.spider.merge;

import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.s2  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0219s2 extends AbstractC0255v2 {
    private final Pattern a;

    public C0219s2(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0255v2
    public final boolean a(E1 e1, E1 e12) {
        return this.a.matcher(e12.p0()).find();
    }

    public final String toString() {
        return String.format(":matches(%s)", this.a);
    }
}
