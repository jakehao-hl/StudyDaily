package com.java.reflect;

import java.lang.reflect.Method;

public class Student {

    private Long id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        //获取字节码文件
        Class classs = Class.forName("com.java.reflect.Student");
        //获取其实例对象
        Student stu = (Student) classs.newInstance();
        //获取带参数的方法，为方法名
        Method methodSet = classs.getDeclaredMethod("setName", String.class);
        Method methodGet = classs.getDeclaredMethod("getName");
        //设置可见性
        methodSet.setAccessible(true);
        //调用方法
        methodSet.invoke(stu, "李四");
        System.out.println(methodGet.invoke(stu));
    }

    public void login() {
        System.out.println("登陆了");
    }

    public void logout() {
        System.out.println("退出登陆了");
    }
}