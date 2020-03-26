package com.java.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashTable {
    public static void main(String[] args) {
        HashMap hp=new HashMap();
        hp.put(null,null);
        System.out.println("hp = " + hp);

        Hashtable ht=new Hashtable();
        ht.put(null,null);
        System.out.println("ht = " + ht);

        ConcurrentHashMap chp = new ConcurrentHashMap();
        chp.put(null,null);
        System.out.println("chp = " + chp);
    }
}
