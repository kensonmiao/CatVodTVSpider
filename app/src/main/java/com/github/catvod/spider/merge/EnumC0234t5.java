package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.t5  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public enum EnumC0234t5 {
    /* JADX INFO: Fake field, exist only in values array */
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    /* JADX INFO: Fake field, exist only in values array */
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    HANZI(new int[]{8, 10, 12}, 13);
    
    private final int[] c;
    private final int d;

    EnumC0234t5(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final int b(C0215ra c0215ra) {
        int f = c0215ra.f();
        return this.c[f <= 9 ? (char) 0 : f <= 26 ? (char) 1 : (char) 2];
    }
}
