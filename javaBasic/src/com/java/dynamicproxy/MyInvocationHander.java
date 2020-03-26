package com.java.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHander implements InvocationHandler {
    private Object target;

    public MyInvocationHander() {
        super();
    }

    public MyInvocationHander(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.err.println("开始");
        method.invoke(target, args); //执行被代理的target对象的方法
        System.out.println("结束");
        return null;
    }

    public static void main(String[] args) {
        Login login = new LoginImpl();
        MyInvocationHander m = new MyInvocationHander(login);
        /**
         * login.getClass().getClassLoader():类加载器
         * login.getClass().getInterfaces()：被代理对象的接口
         * m：代理对象
         */
        Login s = (Login) Proxy.newProxyInstance(login.getClass().getClassLoader(),
                login.getClass().getInterfaces(), m);
        s.loginIn();
        s.logout();
    }

}
