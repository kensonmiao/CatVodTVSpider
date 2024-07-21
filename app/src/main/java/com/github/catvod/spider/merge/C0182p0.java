package com.github.catvod.spider.merge;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* renamed from: com.github.catvod.spider.merge.p0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0182p0 {
    private final int a;
    private final ByteBuffer b;
    private final CharBuffer c;
    private final IntBuffer d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0182p0(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public static C0170o0 b(int i) {
        return new C0170o0(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int b = C0158n0.b(this.a);
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    return this.d.arrayOffset();
                }
                throw new UnsupportedOperationException("Not reached");
            }
            return this.c.arrayOffset();
        }
        return this.b.arrayOffset();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c() {
        return this.b.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char[] d() {
        return this.c.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] f() {
        return this.d.array();
    }

    public final int g() {
        Buffer buffer;
        int b = C0158n0.b(this.a);
        if (b == 0) {
            buffer = this.b;
        } else if (b == 1) {
            buffer = this.c;
        } else if (b != 2) {
            throw new UnsupportedOperationException("Not reached");
        } else {
            buffer = this.d;
        }
        return buffer.position();
    }

    public final int h() {
        Buffer buffer;
        int b = C0158n0.b(this.a);
        if (b == 0) {
            buffer = this.b;
        } else if (b == 1) {
            buffer = this.c;
        } else if (b != 2) {
            throw new UnsupportedOperationException("Not reached");
        } else {
            buffer = this.d;
        }
        return buffer.remaining();
    }
}
