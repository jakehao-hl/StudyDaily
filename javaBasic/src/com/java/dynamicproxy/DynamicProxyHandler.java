package com.java.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyHandler implements InvocationHandler {
    private Object proxyed;

    public DynamicProxyHandler(Object proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("代理工作了.");
        return method.invoke(proxyed, args);
    }

    public static void main(String[] args) {
        IDoImpl real = new IDoImpl();
        IDo proxy = (IDo) Proxy.newProxyInstance(
                IDo.class.getClassLoader(), new Class[]{IDo.class},
                new DynamicProxyHandler(real));
        proxy.doSomething();
        proxy.somethingElse("赵柳");
    }
}