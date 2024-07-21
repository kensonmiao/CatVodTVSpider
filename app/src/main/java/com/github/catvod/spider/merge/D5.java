package com.github.catvod.spider.merge;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class D5 implements InterfaceC0097i, InterfaceC0046d8 {
    public static final D5 c = new D5();

    private static byte[] c(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr2 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = (byte) i;
        }
        if (bytes == null || bytes.length == 0) {
            bArr2 = null;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                i3 = ((bytes[i2] & 255) + (bArr2[i4] & 255) + i3) & 255;
                byte b = bArr2[i4];
                bArr2[i4] = bArr2[i3];
                bArr2[i3] = b;
                i2 = (i2 + 1) % bytes.length;
            }
        }
        byte[] bArr3 = new byte[bArr.length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < bArr.length; i7++) {
            i5 = (i5 + 1) & 255;
            i6 = ((bArr2[i5] & 255) + i6) & 255;
            byte b2 = bArr2[i5];
            bArr2[i5] = bArr2[i6];
            bArr2[i6] = b2;
            bArr3[i7] = (byte) (bArr2[((bArr2[i5] & 255) + (bArr2[i6] & 255)) & 255] ^ bArr[i7]);
        }
        return bArr3;
    }

    private static String e(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            stringBuffer.append((char) b);
        }
        return stringBuffer.toString();
    }

    public static String f(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
    }

    public static String g(byte[] bArr, String str) {
        if (bArr != null) {
            return e(c(bArr, str));
        }
        return null;
    }

    public static String h(byte[] bArr, String str) {
        if (bArr != null) {
            return new String(c(bArr, str));
        }
        return null;
    }

    public static String i(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = str.getBytes();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            byte b = bytes[i2];
            byte b2 = bytes[i2 + 1];
            StringBuilder a = A.a("0x");
            a.append(new String(new byte[]{b}));
            StringBuilder a2 = A.a("0x");
            a2.append(new String(new byte[]{b2}));
            bArr[i] = (byte) (((char) Byte.decode(a2.toString()).byteValue()) ^ ((char) (((char) Byte.decode(a.toString()).byteValue()) << 4)));
        }
        return new String(c(bArr, str2));
    }

    public static String j(String str) {
        if (str != null) {
            String e = e(c(str.getBytes(), "wetEWKhXShYbp2RcDXY8kGtbhpXctQMF"));
            String str2 = "";
            for (int i = 0; i < e.length(); i++) {
                String hexString = Integer.toHexString(e.charAt(i) & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                str2 = C0288y.a(str2, hexString);
            }
            return str2;
        }
        return null;
    }

    public static int k(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static String l(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable th2 = th; th2 != null && !arrayList.contains(th2); th2 = th2.getCause()) {
            arrayList.add(th2);
        }
        Throwable th3 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th3 != null) {
            th = th3;
        }
        int i = C0146m0.e;
        String a = C0146m0.a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(": ");
        int i2 = A7.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    public static String m(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static C0290y1 n(String str) {
        return C0080g6.c(str);
    }

    public static int o(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int p(int i, Object obj) {
        return o(i, obj != null ? obj.hashCode() : 0);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0097i
    public int a(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0046d8
    public int b() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0046d8
    public void d() {
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0097i
    public int size() {
        return 2;
    }
}
