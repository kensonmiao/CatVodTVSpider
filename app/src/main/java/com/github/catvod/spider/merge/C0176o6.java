package com.github.catvod.spider.merge;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.github.catvod.spider.merge.o6  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0176o6 extends AbstractC0181p {
    @Override // com.github.catvod.spider.merge.AbstractC0181p
    public final Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C0305z4.g(current, "ThreadLocalRandom.current()");
        return current;
    }
}
