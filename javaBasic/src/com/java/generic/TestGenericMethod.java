package com.java.generic;

import java.util.List;

public class TestGenericMethod {

    <T> void test(T a) {
        System.out.println(a.getClass());
    }

    static <E> void test2(E name) {
        System.out.println(name.getClass());
    }


    public static void main(String[] args) {
        TestGenericMethod genericMethod = new TestGenericMethod();
        genericMethod.test("a");
        TestGenericMethod.test2("haoren");
    }
}
