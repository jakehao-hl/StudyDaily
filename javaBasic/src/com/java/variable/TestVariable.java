package com.java.variable;

public class TestVariable {
    static int a;

    public static void main(String[] args) {
        //成员变量堆会赋初始值
        System.out.println(a);
        byte b = 2;
        short s = 3;
        int c = b + s;
        System.out.println(c);
    }


}

