package com.java.keyword;

public class TestStatic {
    static int num=10;
    static {
        System.out.println("静态代码块"+num);
    }
    static void add() {
        num++;
    }
    public static void main(String[] args) {
        TestStatic.add();
        System.out.println("方法内"+num);
    }
}
