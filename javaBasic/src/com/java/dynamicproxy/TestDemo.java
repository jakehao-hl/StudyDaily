package com.java.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDemo implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(method);
    }


    public static void main(String[] args) {
        TestDemo demo= new TestDemo();
        Proxy.newProxyInstance(demo.getClass().getClassLoader(),demo.getClass().getInterfaces(),demo);
    }
}
