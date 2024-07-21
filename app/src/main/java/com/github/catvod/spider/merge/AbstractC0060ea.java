package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.github.catvod.spider.merge.ea */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0060ea {
    public AbstractC0133l a;

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new C0048da());
    }

    public AbstractC0060ea(AbstractC0133l abstractC0133l) {
        if (abstractC0133l == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.a = abstractC0133l;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof r;
    }

    public C0293y4 c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}
