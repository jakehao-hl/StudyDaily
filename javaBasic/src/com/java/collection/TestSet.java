package com.java.collection;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("");

        ArrayList list = new ArrayList();
        list.add("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        Random random = new Random();
        TreeSet treeSet = new TreeSet();
        while (treeSet.size()<10){
            int num = random.nextInt(20) + 1;
            treeSet.add(num);
        }
        System.out.println(treeSet.toString());

    }
}
