package com.java.dynamicproxy;


public class LoginImpl implements Login{

    @Override
    public void loginIn() {
        System.out.println("登陆了");
    }

    @Override
    public void logout() {
        System.out.println("退出登陆了");
    }
}