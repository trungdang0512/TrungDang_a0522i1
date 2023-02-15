package com.example.btbookstore.until;

import java.security.SecureRandom;

public class GenerateCodeRandom {
    public static final String source = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom random = new SecureRandom();

    public static String generateCode5Char(){
        StringBuilder stringBuilder = new StringBuilder(5);
        for (int i=0;i<5;i++){
            stringBuilder.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuilder.toString();
    }
}
