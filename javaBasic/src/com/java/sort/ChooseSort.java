package com.java.sort;

/**
 * 选择排序
 */
public class ChooseSort {

    public static void main(String[] args) {
        int[] a = {100, 23, 45, 67, 12, 1};
        //冒泡排序就是大的泡泡向上浮起
        for (int i = 0; i < a.length-1; i++) {
            //外层循环控制比较趟数
            //内层循环每次取最大的放在最后，比较次数5，4，3，2，1   a.length - i-1
            for (int j = 0; j < a.length - i-1; j++) {
                if (a[j] > a[j + 1]) {
                    //初始化变量b，用来放最大值
                    int max = a[j];
                    a[j] = a[j+1];
                    a[j+1] = max;
                }
            }
            for (int c : a) {
                System.out.print(c + "  ");
            }
            System.out.print('\n');
        }
    }
}
