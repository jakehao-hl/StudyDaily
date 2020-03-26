package com.java.collection;

import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeSet;

public class TestCompare implements Serializable {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int length = str1.length() - str2.length();
                return length == 0 ? str1.compareTo(str2) : length;
            }
        });
        treeSet.add("aaaa");
        treeSet.add("bbbb");
        treeSet.add("abe");
        treeSet.add("a");
        treeSet.add("abc");
        System.out.println(treeSet.toString());
    }
}
