package com.Cryptography;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

public class Cryptography {
    static Key keyy;
    public static void main(String[] args) throws Exception {
        byte[] plainText ;
        String ss = "Hello world, haris is here!";
        plainText = ss.getBytes();
        //
        // get a DES private key
        System.out.println("\nStart generating DES key");
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        keyGen.init(56);
        Key key = keyGen.generateKey();
        System.out.println("Finish generating DES key");
        //
        // get a DES cipher object and print the provider
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        System.out.println("\n" + cipher.getProvider().getInfo());
        //
        // encrypt using the key and the plaintext
        System.out.println("\nStart encryption");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = cipher.doFinal(plainText);
        System.out.println("Finish encryption: ");
        System.out.println(new String(cipherText, "UTF8"));

        //
        // decrypt the ciphertext using the same key
        System.out.println("\nStart decryption");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] newPlainText = cipher.doFinal(cipherText);
        System.out.println("Finish decryption: ");

        System.out.println(new String(newPlainText, "UTF8"));

    }
}
