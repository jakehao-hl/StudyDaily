package com.java.abstrac;

public abstract class TestAbstract {
    TestAbstract() {

    }

    void test() {
        System.out.println(111);
    }

    abstract void test2();

    public static void main(String[] args) {
        System.out.println(222);
    }
}
