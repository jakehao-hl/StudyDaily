package com.java.collection;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        Collection s = new ArrayList();
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
        }
        Collection t = new ArrayList();
        s.isEmpty();
        s.addAll(t);
        s.removeAll(t);
        s.containsAll(t);
        boolean res = s.retainAll(t);

        new LinkedList<>();

        new HashSet();
        new TreeSet<>();

        List list= new ArrayList();
        ListIterator listIterator=list.listIterator();
        listIterator.hasPrevious();
        listIterator.previous();


        Vector v=new Vector();
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            e.nextElement();
        }
    }
}
