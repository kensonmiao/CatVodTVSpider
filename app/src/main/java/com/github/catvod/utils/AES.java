package com.github.catvod.utils;

import android.util.Base64;

import com.github.catvod.crawler.SpiderDebug;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author Adam Jin
 * @version v1.0
 * @date 2022-04-13 15:09
 */
public class AES {
    // 加密
    public static String encryptOfAesCbcPkcs7(byte[] data, byte[] key, byte[] iv) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        //两个参数，第一个为私钥字节数组， 第二个为加密方式 AES或者DES
        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(data);
        return new String(Base64.encode(encrypted, Base64.DEFAULT));
    }

    // 解密
    public static String decryptOfAesCbcPkcs7(byte[] sSrc, byte[] sKey, byte[] iv) throws Exception {
        try {
            IvParameterSpec zeroIv = new IvParameterSpec(iv);
            //两个参数，第一个为私钥字节数组， 第二个为加密方式 AES或者DES
            SecretKeySpec key = new SecretKeySpec(sKey, "AES");
            //实例化加密类，参数为加密方式，要写全
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding"); //PKCS5Padding比PKCS7Padding效率高，PKCS7Padding可支持IOS加解密
            //初始化，此方法可以采用三种方式，按加密算法要求来添加。（1）无第三个参数（2）第三个参数为SecureRandom random = new SecureRandom();中random对象，随机数。(AES不可采用这种方法)（3）采用此代码中的IVParameterSpec
            cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
            try {
                byte[] original = cipher.doFinal(sSrc);
                return new String(original);
            } catch (Exception e) {
                SpiderDebug.log(e);
                return null;
            }
        } catch (Exception ex) {
            SpiderDebug.log(ex);
            return null;
        }
    }
}
