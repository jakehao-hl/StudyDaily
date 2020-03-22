package com.java.random;

import java.util.Random;
import java.util.UUID;

public class TestRandomFive {
    public static void main(String[] args) {
        String str = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        str += str.toLowerCase();
        str += "1234567890";
        System.out.println(str);
        //取字符串,StringBuilder接收
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char c = str.charAt(new Random().nextInt(str.length()));
            sb.append(c);
        }
        System.out.println(sb);
    }
}
