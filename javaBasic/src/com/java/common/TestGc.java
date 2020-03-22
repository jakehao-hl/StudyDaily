package com.java.common;

public class TestGc {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("我被垃圾回收了");
    }

    public static void main(String[] args) {
        new TestGc();
        System.gc();
    }
}
