package com.java.collection;

import java.util.TreeMap;

public class TestCountCharacter {
    public static void main(String[] args) {
        TreeMap<Character, Integer> treeMap = new TreeMap();
        String line = "aaaabbbbbdsdsdsss";
        char[] chars = line.toCharArray();
        for (char c : chars
        ) {
            if (!treeMap.containsKey(c)) {
                treeMap.put(c, 1);
            } else {
                treeMap.put(c, treeMap.get(c) + 1);
            }
        }
        System.out.println("treeMap = " + treeMap);
    }
}
