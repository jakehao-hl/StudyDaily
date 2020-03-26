package com.java.dynamicproxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        RealObject real = new RealObject();
        IDoable proxy = (IDoable) Proxy.newProxyInstance(
                IDoable.class.getClassLoader(), new Class[]{IDoable.class},
                new DynamicProxyHandler(real));
        proxy.doSomething();
        proxy.somethingElse("赵柳");
    }
}
