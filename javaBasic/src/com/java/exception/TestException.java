package com.java.exception;

class MyRunTimeException extends RuntimeException {

}

class Myxception extends Exception {
    public Myxception(String args) {
        super(args);
    }
}

public class TestException {
    public static void main(String[] args) {
        try {
            int a = 3 / 0;
            throw new Exception("");
        } catch (Exception e) {
            System.out.println("e = " + e);
            System.out.println("e = " + e.getMessage());
            System.out.println("e = " + e.getCause());
            System.out.println("e = " + e.getClass());
            e.printStackTrace();
            System.exit(0);
        } finally {
            System.out.println("finally执行了");
        }
    }

}
