package com.java.date;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        //自1970年以来的毫秒值
        long millis = System.currentTimeMillis();
        //转成Date
        Date date = new Date(millis);
        System.out.println(date);
        //
        System.out.println(date.toLocaleString());
    }
}
