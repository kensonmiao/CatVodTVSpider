package com.github.catvod.spider.merge;

import java.util.Random;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class H2 extends ThreadLocal<Random> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.lang.ThreadLocal
    public final Random initialValue() {
        return new Random();
    }
}
