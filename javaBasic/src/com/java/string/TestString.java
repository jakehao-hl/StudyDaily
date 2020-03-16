package com.java.string;


public class TestString {

    public static void main(String[] args) {
        //indexof方法从0开始
        String str = "ab,cd,ef";
        int a =str.indexOf("a");
        System.out.println(a);
        //substring从0开始
        System.out.println("substring从0开始:"+str.substring(4,5));
        //split方法返回数组
        String[] b=str.split(",");
        for (String c:b
             ) {
            System.out.print(c);
        }
    }
}
