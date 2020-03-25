package com.java.clone;

class Address implements Cloneable {
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    protected Object clone()  {
        Address addr = null;
        try {
            addr = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return addr;
    }
}

class Teacher implements Cloneable {
    private int number;

    private Address addr;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Object clone()  {
        Teacher stu = null;
        try {
            stu = (Teacher) super.clone();//浅拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        stu.addr = (Address) addr.clone();//深拷贝
        return stu;
    }
}

public class Test {

    public static void main(String args[])  {

        Address addr = new Address();
        addr.setAdd("杭州市");
        Teacher stu1 = new Teacher();
        stu1.setNumber(123);
        stu1.setAddr(addr);

        Teacher stu2 = (Teacher) stu1.clone();

        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd());
        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd());

        addr.setAdd("西湖区");

        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd());
        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd());
    }
}