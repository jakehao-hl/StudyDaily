package com.java.loop;

public class TestLoop {
    //外层循环控制行数，内层控制打印 “*“ 数
    public static void main(String[] args) {
//        printSquare();
//        printTriangle();
//        printReTriangle2();
//        printEqualTriangle();
        print9MultiTable();
    }


    /**
     * 打印五行四列的矩行
     */
    static void printSquare() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * 打印直角三角形
     */
    static void printTriangle() {
        int len = 6;
        for (int i = 1; i < len; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * 打印倒立直角三角形1
     */
    static void printReTriangle1() {
        int len = 6;
        for (int i = len; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * 打印倒立直角三角形2
     */
    static void printReTriangle2() {
        int len = 6;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * 打印等腰三角形
     */
    static void printEqualTriangle() {
        int len = 7;
        for (int i = 1; i <= len; i++) {
            for (int k = 1; k <= len - i; k++) {
                System.out.print("\u00A0");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }


    /**
     * 打印9*9乘法表
     */
    static void print9MultiTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j +"  ");
            }
            System.out.print("\n");

        }
    }
}

