package com.java.generic;

public class TestGeneric<T> {
    T x;
    T y;

    @Override
    public String toString() {
        return "TestGeneric{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        TestGeneric<String> tg = new TestGeneric<String>();
        tg.x = "10";
        tg.y = "20";
        System.out.println(tg);
//        ArrayList<Object> arrayList= new ArrayList<String>();
    }
}
