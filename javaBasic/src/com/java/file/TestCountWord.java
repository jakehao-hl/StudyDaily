package com.java.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class TestCountWord {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("D:/a.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        String line = null;
        while ((line = bf.readLine()) != null) {
            String[] strs = line.split(" ");
            for (String word :
                    strs) {
                if (word.length() > 0 && map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println("list = " + list);
    }
}
