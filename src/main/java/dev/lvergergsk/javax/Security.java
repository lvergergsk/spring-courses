package dev.lvergergsk.javax;


import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static com.sun.marlin.MarlinConst.BLOCK_SIZE;

public class Security {

    static String HMAC_ALGORITHM="HmacSHA256";
    static String CONTENT_CHARSET="UTF-8";
//DHPublicKeySpec

    public static String sign(String signStr, String secret)
            throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException
    {

        String sig = null;
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(CONTENT_CHARSET), mac.getAlgorithm());

        mac.init(secretKey);
        byte[] hash = mac.doFinal(signStr.getBytes(CONTENT_CHARSET));

        // base64
        //sig = new String(new BASE64Encoder().encode(hash).getBytes());
        sig = new String(Base64.encodeBase64(hash));
//        sig = new String(Base64.encode(hash));

        return sig;
    }

//    private byte[] decipherText(byte[] textToDecipher, SecretKeySpec key) throws GeneralSecurityException, IOException {
//
//        try {
//            Cipher dcipher = Cipher.getInstance(AES_MODE);
//
//             Read random initialization vector.
//            final byte[] iv = Arrays.copyOfRange(textToDecipher, 0, BLOCK_SIZE);
//            final IvParameterSpec ivSpec = new IvParameterSpec(iv);
//
//             Configure the cipher with the key and the iv.
//            dcipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
//            final byte[] textToDecipherWithoutIv = Arrays.copyOfRange(textToDecipher, BLOCK_SIZE,
//                    textToDecipher.length);
//
//            final byte[] outputBytes = dcipher.doFinal(textToDecipherWithoutIv);
//            return outputBytes;
//
//        } catch (final GeneralSecurityException exc) {
//            throw exc;
//        }
//    }
}
