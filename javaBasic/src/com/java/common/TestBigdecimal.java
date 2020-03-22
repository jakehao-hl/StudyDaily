package com.java.common;

import java.math.BigDecimal;

public class TestBigdecimal {
    public static void main(String[] args) {
        //float 和double精度不是很准,String类型的构造器是非常准确的
        BigDecimal a = new BigDecimal("0.01");
        BigDecimal b = new BigDecimal("0.09");
        System.out.println(a.add(b));
    }
}
