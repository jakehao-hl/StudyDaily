package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Teacher {

    private Long id;
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws Exception {
        //不用反射: 创建对象，需要手动new对象不能动态创建
        //new的时候根据new的类名寻找字节码文件，加载进入内存，创建Class对象，并接着创建对应的 Teacher 对象
        Object obj1= new Teacher("张三", 22);
        System.out.println("不用反射： " + obj1);
        System.out.println("*********************************************************************");
        //Class.forName(全限定类名)
        //通过反射:只需要一个名字，就可以创建对象。寻找该名称的类文件，加载进内存，并创建Class对象
        Class clzz3 = Class.forName("com.java.reflect.Teacher");
        //调用有参构造方法初始化变量
        Constructor constructor = clzz3.getConstructor(String.class, int.class);
        ////通过Class对象的newInstance()创建类对象。
        Object obj2 = constructor.newInstance("张三", 22);
        System.out.println("通过反射： " + obj2);
    }
}