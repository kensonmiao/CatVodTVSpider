package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.x1  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0278x1 implements Cloneable {
    @Nullable
    int f;
    private K1 c = K1.base;
    private Charset d = C0135l1.a;
    private final ThreadLocal<CharsetEncoder> e = new ThreadLocal<>();
    private boolean g = true;
    private int h = 1;
    private int i = 1;

    /* JADX DEBUG: Method merged with bridge method */
    /* renamed from: a */
    public final C0278x1 clone() {
        try {
            C0278x1 c0278x1 = (C0278x1) super.clone();
            String name = this.d.name();
            c0278x1.getClass();
            c0278x1.d = Charset.forName(name);
            c0278x1.c = K1.valueOf(this.c.name());
            return c0278x1;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharsetEncoder b() {
        CharsetEncoder charsetEncoder = this.e.get();
        return charsetEncoder != null ? charsetEncoder : e();
    }

    public final K1 c() {
        return this.c;
    }

    public final int d() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharsetEncoder e() {
        CharsetEncoder newEncoder = this.d.newEncoder();
        this.e.set(newEncoder);
        String name = newEncoder.charset().name();
        this.f = name.equals("US-ASCII") ? 1 : name.startsWith("UTF-") ? 2 : 3;
        return newEncoder;
    }

    public final boolean f() {
        return this.g;
    }

    public final int g() {
        return this.i;
    }
}
