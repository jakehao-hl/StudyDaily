package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTransfer {
    public static void main(String[] args) {
        //数组转集合
        int[] arr = {1, 2, 3, 4};
        List<int[]> list=Arrays.asList(arr);
        System.out.println(list);
        Integer[] arr2 ={10,20,30,40};
        List<Integer> list2=Arrays.asList(arr2);
        System.out.println(list2);
        //集合转数组
        List<String> list3=new ArrayList<>();
        list3.add("a");
        list3.add("b");
        Object[] obj=list3.toArray();
        String[] strs=list3.toArray(new String[10]);
        System.out.println(Arrays.asList(strs));
    }
}
