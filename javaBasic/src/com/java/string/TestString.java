package com.java.string;


public class TestString implements  Comparable{

    public static void main(String[] args) {
        String aa=null;
        String bb="";
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
        str.toCharArray();
        str.charAt(0);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
