package com.java.keyword;

public class TestStatic {
    static int num;

    static void add() {
        num++;
    }
    public static void main(String[] args) {
        TestStatic.add();
        System.out.println(num);
    }
}
