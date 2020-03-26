package com.java.dynamicproxy;

public class IDoImpl implements IDo {
    public void doSomething() {
        System.out.println("doSomething.");
    }

    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
