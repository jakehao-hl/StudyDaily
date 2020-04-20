package com.java.clone;

public class TestClonem implements Cloneable {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "TestClonem{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() {
        TestClonem clonem =null;
        try {
            clonem= (TestClonem) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clonem;
    }

    public static void main(String[] args) {
        TestClonem clonem=new TestClonem();
        clonem.setAge(11);
        clonem.setName("xxx");
        TestClonem clonem2= (TestClonem) clonem.clone();
        System.out.println("clonem = " + clonem);
        clonem2.setAge(22);
        clonem2.setName("yyy");
        System.out.println("clonem2 = " + clonem2);
    }
}
