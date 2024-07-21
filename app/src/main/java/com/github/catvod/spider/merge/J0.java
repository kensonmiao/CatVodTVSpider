package com.github.catvod.spider.merge;

import android.util.Base64;
import java.util.HashMap;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class J0 implements H8, InterfaceC0198q4 {
    public static final J0 a = new J0();

    public static String c(String str, JSONObject jSONObject, String str2) {
        if (jSONObject != null) {
            StringBuilder a2 = A.a("proxy://do=PicProxy&pic=");
            a2.append(Base64.encodeToString(str.getBytes(), 10));
            a2.append("&picHeader=");
            a2.append(Base64.encodeToString(jSONObject.toString().getBytes(), 10));
            a2.append("&siteUrl=");
            a2.append(Base64.encodeToString(str2.getBytes(), 10));
            return a2.toString();
        }
        StringBuilder a3 = A.a("proxy://do=PicProxy&pic=");
        a3.append(Base64.encodeToString(str.getBytes(), 10));
        a3.append("&picHeader=&siteUrl=");
        a3.append(Base64.encodeToString(str2.getBytes(), 10));
        return a3.toString();
    }

    public static Object[] d(String str, String str2, String str3) {
        HashMap<String, String> hashMap;
        try {
            String str4 = new String(Base64.decode(str, 10), C0210r5.b);
            String str5 = new String(Base64.decode(str2, 10), C0210r5.b);
            String str6 = new String(Base64.decode(str3, 10), C0210r5.b);
            try {
                hashMap = C0210r5.b(new JSONObject(str5));
            } catch (Exception unused) {
                hashMap = null;
            }
            if (hashMap == null) {
                hashMap = new HashMap<>();
                hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                hashMap.put("referer", str6 + "/");
            }
            C0128k6 c0128k6 = new C0128k6();
            T5.c(T5.b(), str4, hashMap, c0128k6);
            if (c0128k6.getResult().code() == 200) {
                String str7 = c0128k6.getResult().headers().get("Content-Type");
                if (str7 == null) {
                    str7 = "application/octet-stream";
                }
                System.out.println(str4);
                System.out.println(str7);
                return new Object[]{200, str7, c0128k6.getResult().body().byteStream()};
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    @Nullable
    public static E1 e(String str, E1 e1) {
        E1 e12;
        R0.n(str);
        C0 c0 = new C0(e1, F6.h(str));
        A5 a5 = e1;
        int i = 0;
        while (a5 != null) {
            int b = c0.b(a5);
            if (b == 5) {
                break;
            }
            int i2 = 1;
            if (b != 1 || a5.h() <= 0) {
                while (a5.s() == null && i > 0) {
                    b = (b == 1 || b == 2) ? 1 : 1;
                    A5 A = a5.A();
                    i--;
                    if (b == 4) {
                        a5.C();
                    }
                    a5 = A;
                    b = 1;
                }
                if (b != 1 && b != 2) {
                    i2 = b;
                }
                if (a5 == e1) {
                    break;
                }
                A5 s = a5.s();
                if (i2 == 4) {
                    a5.C();
                }
                a5 = s;
            } else {
                a5 = a5.g(0);
                i++;
            }
        }
        e12 = c0.b;
        return e12;
    }

    public static byte[] f(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0198q4
    public InterfaceC0091h5 a(String str) {
        return C0246u5.c;
    }

    public G8 b(W5 w5, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        I0 i0 = new I0(w5, i, i2, i3, i4);
        i0.d = i5;
        i0.e = i6;
        if (str != null) {
            i0.h = str;
        }
        return i0;
    }
}
