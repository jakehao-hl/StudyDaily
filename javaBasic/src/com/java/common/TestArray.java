package com.java.common;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = Arrays.copyOf(a, 10);
        int[] c = new int[10];
        System.out.println(Arrays.toString(b));
        System.arraycopy(a, 2, c, 0, 4);
        System.out.println(Arrays.toString(c));
    }
}
