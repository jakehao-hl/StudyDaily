package com.java.reflect;

public class Customer {

    private Long id;
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
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

    public static void main(String[] args) throws ClassNotFoundException {
        //对象.getClass()
        Customer customer=new Customer();
        Class clzz=customer.getClass();
        System.out.println("clzz = " + clzz);
        //类名.class
        Class clzz2=Customer.class;
        System.out.println("clzz2 = " + clzz2);
        //Class.forName(全限定类名)
        Class clzz3=Class.forName("com.java.reflect.Customer");
        System.out.println("clzz3 = " + clzz3);
        //jvm中只有一个对象实例
        System.out.println(clzz==clzz2);
    }
}