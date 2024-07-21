package com.github.catvod.spider.merge;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.github.catvod.spider.merge.la  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0144la {
    private static C0132ka a;
    private static boolean b;
    private static final Object[] c = new Object[0];
    private static final int[][] d = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] e = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] f = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] g = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static Cipher a(int i) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec("diao.com".getBytes()));
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS7Padding");
            cipher.init(i, generateSecret);
            return cipher;
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(X x, int i, C0215ra c0215ra, int i2, C0038d0 c0038d0) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        c0038d0.a();
        int length = d[0].length;
        h(0, 0, c0038d0);
        h(c0038d0.e() - length, 0, c0038d0);
        h(0, c0038d0.e() - length, c0038d0);
        g(0, 7, c0038d0);
        g(c0038d0.e() - 8, 7, c0038d0);
        g(0, c0038d0.e() - 8, c0038d0);
        i(7, 0, c0038d0);
        int i7 = -1;
        i((c0038d0.d() - 7) - 1, 0, c0038d0);
        i(7, c0038d0.d() - 7, c0038d0);
        if (c0038d0.b(8, c0038d0.d() - 8) != 0) {
            c0038d0.f(8, c0038d0.d() - 8, 1);
            if (c0215ra.f() >= 2) {
                int f2 = c0215ra.f() - 1;
                int[][] iArr = f;
                int[] iArr2 = iArr[f2];
                int length2 = iArr[f2].length;
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = iArr2[i8];
                        int i11 = iArr2[i9];
                        if (i11 != i7 && i10 != i7 && m(c0038d0.b(i11, i10))) {
                            int i12 = i11 - 2;
                            int i13 = i10 - 2;
                            for (int i14 = 0; i14 < 5; i14++) {
                                for (int i15 = 0; i15 < 5; i15++) {
                                    c0038d0.f(i12 + i15, i13 + i14, e[i14][i15]);
                                }
                            }
                        }
                        i9++;
                        i7 = -1;
                    }
                    i8++;
                    i7 = -1;
                }
            }
            int i16 = 8;
            while (i16 < c0038d0.e() - 8) {
                int i17 = i16 + 1;
                int i18 = i17 % 2;
                if (m(c0038d0.b(i16, 6))) {
                    c0038d0.f(i16, 6, i18);
                }
                if (m(c0038d0.b(6, i16))) {
                    c0038d0.f(6, i16, i18);
                }
                i16 = i17;
            }
            X x2 = new X();
            if (!(i2 >= 0 && i2 < 8)) {
                throw new C0299ya("Invalid mask pattern");
            }
            int a2 = (C0300z.a(i) << 3) | i2;
            x2.c(a2, 5);
            x2.c(c(a2, 1335), 10);
            X x3 = new X();
            x3.c(21522, 15);
            x2.h(x3);
            if (x2.f() == 15) {
                for (int i19 = 0; i19 < x2.f(); i19++) {
                    boolean e2 = x2.e((x2.f() - 1) - i19);
                    int[][] iArr3 = g;
                    c0038d0.g(iArr3[i19][0], iArr3[i19][1], e2);
                    if (i19 < 8) {
                        c0038d0.g((c0038d0.e() - i19) - 1, 8, e2);
                    } else {
                        c0038d0.g(8, (i19 - 8) + (c0038d0.d() - 7), e2);
                    }
                }
                if (c0215ra.f() >= 7) {
                    X x4 = new X();
                    x4.c(c0215ra.f(), 6);
                    x4.c(c(c0215ra.f(), 7973), 12);
                    if (x4.f() != 18) {
                        throw new C0299ya("should not happen but we got: " + x4.f());
                    }
                    int i20 = 17;
                    for (int i21 = 0; i21 < 6; i21++) {
                        for (int i22 = 0; i22 < 3; i22++) {
                            boolean e3 = x4.e(i20);
                            i20--;
                            c0038d0.g(i21, (c0038d0.d() - 11) + i22, e3);
                            c0038d0.g((c0038d0.d() - 11) + i22, i21, e3);
                        }
                    }
                }
                int e4 = c0038d0.e() - 1;
                int d2 = c0038d0.d() - 1;
                int i23 = 0;
                int i24 = -1;
                while (e4 > 0) {
                    if (e4 == 6) {
                        e4--;
                    }
                    while (d2 >= 0 && d2 < c0038d0.d()) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            int i26 = e4 - i25;
                            if (m(c0038d0.b(i26, d2))) {
                                if (i23 < x.f()) {
                                    z = x.e(i23);
                                    i23++;
                                } else {
                                    z = false;
                                }
                                if (i2 != -1) {
                                    switch (i2) {
                                        case 0:
                                            i3 = d2 + i26;
                                            i4 = i3 & 1;
                                            break;
                                        case 1:
                                            i3 = d2;
                                            i4 = i3 & 1;
                                            break;
                                        case 2:
                                            i4 = i26 % 3;
                                            break;
                                        case 3:
                                            i4 = (d2 + i26) % 3;
                                            break;
                                        case 4:
                                            i4 = ((i26 / 3) + (d2 / 2)) & 1;
                                            break;
                                        case 5:
                                            int i27 = d2 * i26;
                                            i4 = (i27 % 3) + (i27 & 1);
                                            break;
                                        case 6:
                                            int i28 = d2 * i26;
                                            i5 = i28 & 1;
                                            i6 = i28 % 3;
                                            i3 = i6 + i5;
                                            i4 = i3 & 1;
                                            break;
                                        case 7:
                                            i6 = (d2 * i26) % 3;
                                            i5 = (d2 + i26) & 1;
                                            i3 = i6 + i5;
                                            i4 = i3 & 1;
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Invalid mask pattern: " + i2);
                                    }
                                    if (i4 == 0) {
                                        z = !z;
                                    }
                                }
                                c0038d0.g(i26, d2, z);
                            }
                        }
                        d2 += i24;
                    }
                    i24 = -i24;
                    d2 += i24;
                    e4 -= 2;
                }
                if (i23 == x.f()) {
                    return;
                }
                throw new C0299ya("Not all bits consumed: " + i23 + '/' + x.f());
            }
            throw new C0299ya("should not happen but we got: " + x2.f());
        }
        throw new C0299ya();
    }

    static int c(int i, int i2) {
        if (i2 != 0) {
            int k = k(i2);
            int i3 = i << (k - 1);
            while (k(i3) >= k) {
                i3 ^= i2 << (k(i3) - k);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static F1 d(AbstractC0255v2 abstractC0255v2, E1 e1) {
        F1 f1 = new F1();
        C0305z4.o(new B0(e1, f1, abstractC0255v2), e1);
        return f1;
    }

    public static String e(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            byte[] f2 = J0.f(str);
            Cipher a2 = a(2);
            if (a2 != null) {
                return new String(a2.doFinal(f2), C0210r5.b);
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String f(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS7Padding");
            if (str3 != null) {
                cipher.init(2, secretKeySpec, new IvParameterSpec(str3.getBytes()));
            } else {
                cipher.init(2, secretKeySpec);
            }
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)), C0210r5.b);
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return null;
        }
    }

    private static void g(int i, int i2, C0038d0 c0038d0) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m(c0038d0.b(i4, i2))) {
                throw new C0299ya();
            }
            c0038d0.f(i4, i2, 0);
        }
    }

    private static void h(int i, int i2, C0038d0 c0038d0) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                c0038d0.f(i + i4, i2 + i3, d[i3][i4]);
            }
        }
    }

    private static void i(int i, int i2, C0038d0 c0038d0) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m(c0038d0.b(i, i4))) {
                throw new C0299ya();
            }
            c0038d0.f(i, i4, 0);
        }
    }

    public static String j(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            Cipher a2 = a(1);
            if (a2 == null) {
                return null;
            }
            return J0.g(a2.doFinal(str.getBytes()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    static int k(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    public static Class l() {
        int i;
        C0132ka c0132ka = a;
        if (c0132ka == null) {
            if (b) {
                c0132ka = null;
            } else {
                try {
                    c0132ka = new C0132ka();
                } catch (SecurityException unused) {
                    c0132ka = null;
                }
                a = c0132ka;
                b = true;
            }
        }
        if (c0132ka == null) {
            return null;
        }
        Class<?>[] classContext = c0132ka.getClassContext();
        String name = C0144la.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    private static boolean m(int i) {
        return i == -1;
    }

    public static final void n(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    public static final void o(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final Object[] p(Collection collection) {
        C0305z4.h(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        C0305z4.g(objArr, "Arrays.copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        C0305z4.g(copyOf, "Arrays.copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return c;
    }

    public static final Object[] q(Collection collection, Object[] objArr) {
        Object[] objArr2;
        C0305z4.h(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                C0305z4.g(objArr2, "Arrays.copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                C0305z4.g(copyOf, "Arrays.copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }
}
