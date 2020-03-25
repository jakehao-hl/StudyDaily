package com.java.clone;

class Student implements Cloneable {
    private int number;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public Object clone() {
        Student stu = null;
        try {
            stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }
}

public class TestClone {
    public static void main(String args[]) {
        Student stu1 = new Student();
        stu1.setNumber(12345);
        stu1.setName("张三");
        Student stu2 = (Student) stu1.clone();

        System.out.println("老师1:" + stu1.getNumber());
        System.out.println("老师1name:" + stu1.getName());
        System.out.println("老师2:" + stu2.getNumber());
        System.out.println("老师2name:" + stu2.getName());

        System.out.println(stu1 == stu2);

        stu1.setNumber(54321);
        stu1.setName("李四");

        System.out.println("老师1:" + stu1.getNumber());
        System.out.println("老师1name:" + stu1.getName());
        System.out.println("老师2:" + stu2.getNumber());
        System.out.println("老师2name:" + stu2.getName());
    }
}