package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.k0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public enum EnumC0122k0 {
    /* JADX INFO: Fake field, exist only in values array */
    Cp437(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_2(4, "ISO-8859-2"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_3(5, "ISO-8859-3"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_4(6, "ISO-8859-4"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_5(7, "ISO-8859-5"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_6(8, "ISO-8859-6"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_7(9, "ISO-8859-7"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_8(10, "ISO-8859-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_9(11, "ISO-8859-9"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_10(12, "ISO-8859-10"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_11(13, "ISO-8859-11"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_13(15, "ISO-8859-13"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_14(16, "ISO-8859-14"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_15(17, "ISO-8859-15"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_16(18, "ISO-8859-16"),
    /* JADX INFO: Fake field, exist only in values array */
    SJIS(20, "Shift_JIS"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1250(21, "windows-1250"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1251(22, "windows-1251"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1252(23, "windows-1252"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1256(24, "windows-1256"),
    /* JADX INFO: Fake field, exist only in values array */
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    /* JADX INFO: Fake field, exist only in values array */
    UTF8(26, "UTF-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ASCII(new int[]{27, 170}, "US-ASCII"),
    /* JADX INFO: Fake field, exist only in values array */
    Big5(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EUC_KR(30, "EUC-KR");
    
    private static final Map<Integer, EnumC0122k0> e = new HashMap();
    private static final Map<String, EnumC0122k0> f = new HashMap();
    private final int[] c;
    private final String[] d;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.k0>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.k0>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map<java.lang.Integer, com.github.catvod.spider.merge.k0>, java.util.HashMap] */
    static {
        EnumC0122k0[] values;
        for (EnumC0122k0 enumC0122k0 : values()) {
            for (int i : enumC0122k0.c) {
                e.put(Integer.valueOf(i), enumC0122k0);
            }
            f.put(enumC0122k0.name(), enumC0122k0);
            for (String str : enumC0122k0.d) {
                f.put(str, enumC0122k0);
            }
        }
    }

    EnumC0122k0(int i, String... strArr) {
        this.c = new int[]{i};
        this.d = strArr;
    }

    EnumC0122k0(int[] iArr, String... strArr) {
        this.c = iArr;
        this.d = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.k0>, java.util.HashMap] */
    public static EnumC0122k0 a(String str) {
        return (EnumC0122k0) f.get(str);
    }

    public final int b() {
        return this.c[0];
    }
}
