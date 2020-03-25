package com.java.clone;

import java.io.*;

public class Outer implements Serializable {
    private static final long serialVersionUID = 7428321577815581042L;
    public Inner inner;

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "Outer{" +
                "inner=" + inner +
                '}';
    }

    //Discription:[深度复制方法,需要对象及对象所有的对象属性都实现序列化]　
    public Outer myclone() {
        Outer outer = null;
        try {
            // 将该对象序列化成流,因为写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            // 将流序列化成对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            outer = (Outer) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return outer;
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.setName("内1");
        Outer outer = new Outer();
        outer.setInner(inner);
        Outer outer1 = outer.myclone();//两个对象在内存空间内完全独立存在，互不影响对方的值。
        inner.setName("内2");
        System.out.println(outer);//原对象改变了
        System.out.println(outer1);//克隆后的对象没改变
        System.out.println(outer == outer1);
    }

}
