package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.l */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0133l {
    public int c;
    public C0293y4 f;
    public C0025c a = null;
    public int b = -1;
    public boolean d = false;
    protected final List<AbstractC0060ea> e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.ea>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.ea>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.github.catvod.spider.merge.ea>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.github.catvod.spider.merge.ea>, java.util.ArrayList] */
    public final void a(AbstractC0060ea abstractC0060ea) {
        int size = this.e.size();
        boolean z = false;
        if (this.e.isEmpty()) {
            this.d = abstractC0060ea.b();
        } else if (this.d != abstractC0060ea.b()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.b));
            this.d = false;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            AbstractC0060ea abstractC0060ea2 = (AbstractC0060ea) it.next();
            if (abstractC0060ea2.a.b == abstractC0060ea.a.b && ((abstractC0060ea2.c() != null && abstractC0060ea.c() != null && abstractC0060ea2.c().equals(abstractC0060ea.c())) || (abstractC0060ea2.b() && abstractC0060ea.b()))) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        this.e.add(size, abstractC0060ea);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.ea>, java.util.ArrayList] */
    public final int b() {
        return this.e.size();
    }

    public abstract int c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.ea>, java.util.ArrayList] */
    public final AbstractC0060ea d(int i) {
        return (AbstractC0060ea) this.e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0133l) && this.b == ((AbstractC0133l) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
