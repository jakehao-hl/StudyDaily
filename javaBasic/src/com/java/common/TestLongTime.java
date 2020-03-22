package com.java.common;

public class TestLongTime {
    public static void main(String[] args) {
        //1970开始到现在的毫秒数
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            i = i + 1;
        }
        long endTime = System.currentTimeMillis();
        long excuteTime = endTime - beginTime;
        System.out.println(excuteTime);

    }
}
