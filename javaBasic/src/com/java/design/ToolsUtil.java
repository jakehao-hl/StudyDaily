package com.java.design;

public class ToolsUtil {
    //1.必须创建一个对象，对构造器进行私有化
    private static ToolsUtil instance = new ToolsUtil();

    private ToolsUtil() {
    }

    //2.给外界提供一个方法，让外界来方法
    public static ToolsUtil getInstance() {
        return instance;
    }

    void sort() {
    }

    public static void main(String[] args) {
        ToolsUtil.getInstance().sort();
    }
}
