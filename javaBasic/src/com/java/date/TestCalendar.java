package com.java.date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        Date date=calendar.getTime();
        System.out.println(date);
    }
}
