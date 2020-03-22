package com.java.random;

import java.util.Random;
import java.util.UUID;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        //可以指定生成的范围[0,145)
        System.out.println(random.nextInt(145));
        String str = UUID.randomUUID().toString();
    }
}
