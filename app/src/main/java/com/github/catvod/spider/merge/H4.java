package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Set;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class H4 {
    public final C0025c a;

    public H4(C0025c c0025c) {
        this.a = c0025c;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, IGET, INVOKE] complete} */
    /* JADX DEBUG: Incorrect args count in method signature: (Lcom/github/catvod/spider/merge/l;Lcom/github/catvod/spider/merge/l;Lcom/github/catvod/spider/merge/x6;Lcom/github/catvod/spider/merge/y4;Ljava/util/Set<Lcom/github/catvod/spider/merge/d;>;Ljava/util/BitSet;ZZ)V */
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List<com.github.catvod.spider.merge.l>, java.util.ArrayList] */
    public final void a(AbstractC0133l abstractC0133l, AbstractC0283x6 abstractC0283x6, C0293y4 c0293y4, Set set, BitSet bitSet) {
        if (set.add(new C0037d(abstractC0133l, 0, abstractC0283x6, AbstractC0105i7.c))) {
            if (abstractC0133l == null) {
                if (abstractC0283x6 == null) {
                    c0293y4.a(-2);
                    return;
                } else if (abstractC0283x6.f()) {
                    c0293y4.a(-1);
                    return;
                }
            }
            if (abstractC0133l instanceof V6) {
                if (abstractC0283x6 == null) {
                    c0293y4.a(-2);
                    return;
                } else if (abstractC0283x6.f()) {
                    c0293y4.a(-1);
                    return;
                } else if (abstractC0283x6 != AbstractC0283x6.b) {
                    boolean z = bitSet.get(abstractC0133l.c);
                    try {
                        bitSet.clear(abstractC0133l.c);
                        for (int i = 0; i < abstractC0283x6.h(); i++) {
                            a((AbstractC0133l) this.a.a.get(abstractC0283x6.d(i)), abstractC0283x6.c(i), c0293y4, set, bitSet);
                        }
                        if (z) {
                            return;
                        }
                        return;
                    } finally {
                        if (z) {
                            bitSet.set(abstractC0133l.c);
                        }
                    }
                }
            }
            int b = abstractC0133l.b();
            for (int i2 = 0; i2 < b; i2++) {
                AbstractC0060ea d = abstractC0133l.d(i2);
                if (d.getClass() == W6.class) {
                    W6 w6 = (W6) d;
                    if (bitSet.get(w6.a.c)) {
                        continue;
                    } else {
                        C0189p7 i3 = C0189p7.i(abstractC0283x6, w6.c.b);
                        try {
                            bitSet.set(((W6) d).a.c);
                            a(d.a, i3, c0293y4, set, bitSet);
                        } finally {
                            bitSet.clear(w6.a.c);
                        }
                    }
                } else if ((d instanceof AbstractC0193q) || d.b()) {
                    a(d.a, abstractC0283x6, c0293y4, set, bitSet);
                } else if (d.getClass() == C0251ua.class) {
                    c0293y4.c(C0293y4.g(1, this.a.f));
                } else {
                    C0293y4 c = d.c();
                    if (c != null) {
                        if (d instanceof F5) {
                            C0293y4 g = C0293y4.g(1, this.a.f);
                            if (g.f()) {
                                c = null;
                            } else if (c.f()) {
                                c = new C0293y4(new int[0]);
                                c.c(g);
                            } else {
                                c = C0293y4.k(g, c);
                            }
                        }
                        c0293y4.c(c);
                    }
                }
            }
        }
    }
}
