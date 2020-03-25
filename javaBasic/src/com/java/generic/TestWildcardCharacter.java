package com.java.generic;

import java.util.ArrayList;
import java.util.List;

public class TestWildcardCharacter {
    static void test1(List<?> list) {

    }

    static void test2(List<? extends Number> list) {

    }

    static void test3(List<? super Number> list) {

    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        test1(arrayList);
    }

}
