package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Collection;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C6 implements InterfaceC0013b {
    private final Collection<? extends InterfaceC0013b> a;

    public C6(Collection<? extends InterfaceC0013b> collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.a = collection;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0013b
    public final void a(M6<?, ?> m6, Object obj, int i, int i2, String str, K6 k6) {
        for (InterfaceC0013b interfaceC0013b : this.a) {
            interfaceC0013b.a(m6, obj, i, i2, str, k6);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0013b
    public final void b(AbstractC0092h6 abstractC0092h6, C0063f1 c0063f1, int i, int i2, int i3, C0085h c0085h) {
        for (InterfaceC0013b interfaceC0013b : this.a) {
            interfaceC0013b.b(abstractC0092h6, c0063f1, i, i2, i3, c0085h);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0013b
    public final void c(AbstractC0092h6 abstractC0092h6, C0063f1 c0063f1, int i, int i2, BitSet bitSet, C0085h c0085h) {
        for (InterfaceC0013b interfaceC0013b : this.a) {
            interfaceC0013b.c(abstractC0092h6, c0063f1, i, i2, bitSet, c0085h);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0013b
    public final void d(AbstractC0092h6 abstractC0092h6, C0063f1 c0063f1, int i, int i2, BitSet bitSet, C0085h c0085h) {
        for (InterfaceC0013b interfaceC0013b : this.a) {
            interfaceC0013b.d(abstractC0092h6, c0063f1, i, i2, bitSet, c0085h);
        }
    }
}
