package com.github.catvod.spider.merge;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class G6 {
    public static final Charset a = Charset.forName("UTF-8");

    public static String a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 0);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, e(str2));
            int length = decode.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return new String(byteArray, a);
                }
                byte[] doFinal = i3 > 128 ? cipher.doFinal(decode, i, 128) : cipher.doFinal(decode, i, i3);
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i2++;
                i = i2 * 128;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str, String str2) {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, f(str2));
        return new String(cipher.doFinal(Base64.decode(str, 0)));
    }

    public static String c(String str, String str2) {
        PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 0)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, generatePrivate);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 2);
    }

    public static String d(String str, String str2) {
        try {
            byte[] bytes = str.getBytes(a);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, f(str2));
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return new String(Base64.encode(byteArray, 0));
                }
                byte[] doFinal = i3 > 117 ? cipher.doFinal(bytes, i, 117) : cipher.doFinal(bytes, i, i3);
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i2++;
                i = i2 * 117;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PrivateKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PublicKey f(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
