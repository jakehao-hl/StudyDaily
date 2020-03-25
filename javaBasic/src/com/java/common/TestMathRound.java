package com.java.common;

public class TestMathRound {
    public static void main(String[] args) {
        System.out.println("小数点后第一位=5");
        System.out.println("正数：Math.round(11.5)=" + Math.round(11.5));//12
        System.out.println("负数：Math.round(-11.5)=" + Math.round(-11.5));//-11
        System.out.println();
        System.out.println("小数点后第一位<5");
        System.out.println("正数：Math.round(11.46)=" + Math.round(11.46));//11
        System.out.println("负数：Math.round(-11.46)=" + Math.round(-11.46));//-11
        System.out.println();
        System.out.println("小数点后第一位>5");
        System.out.println("正数：Math.round(11.68)=" + Math.round(11.68));//12
        System.out.println("负数：Math.round(-11.68)=" + Math.round(-11.68));//-12
        System.out.println();
        System.out.println("Math.floor向下取整");
        System.out.println("正数：Math.floor(11.5)=" + Math.floor(11.5));
        System.out.println("负数：Math.floor(-11.5)=" + Math.floor(-11.5));
        System.out.println("正数：Math.floor(11.68)=" + Math.floor(11.68));
        System.out.println("负数：Math.floor(-11.68)=" + Math.floor(-11.68));
        System.out.println("负数：Math.floor(-10.96)=" + Math.floor(-10.96));
        System.out.println("负数：Math.floor(-10.03)=" + Math.floor(-10.03));
    }
}



