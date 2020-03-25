package com.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormate {
    public static void main(String[] args) throws ParseException {
        String beginDate = "2020-03-25";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(beginDate);
        System.out.println(date);
    }
}
