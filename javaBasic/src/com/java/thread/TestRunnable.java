package com.java.thread;

public class TestRunnable implements Runnable {
    private String name;

    public TestRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10000; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestRunnable thread1 = new TestRunnable("线程1");
//        TestRunnable thread2 = new TestRunnable("线程2");
//        TestRunnable thread3 = new TestRunnable("线程3");
//        new Thread(thread1).start();
//        new Thread(thread2).start();
//        new Thread(thread3).start();
        new Thread(thread1,"线程1").start();
        new Thread(thread1).start();
        Thread.sleep(1000);
        new Thread(thread1,"线程3").start();
    }
}
