package com.java.collection;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Person p) {
        if (this.age == p.age) {
            return this.name.compareTo(p.name);
        } else {
            return this.age - p.age;
        }
    }
}

public class TestTreeSet {

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("张三", 20));
        treeSet.add(new Person("李四", 23));
        treeSet.add(new Person("王二", 22));
        treeSet.add(new Person("麻子", 27));
        treeSet.add(new Person("王五", 25));
        treeSet.add(new Person("赵六子", 22));
        System.out.println(treeSet.toString());
    }
}
