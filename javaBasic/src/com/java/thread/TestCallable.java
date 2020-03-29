package com.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable<String> {
    private int ticket = 5;

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0) {
                Thread.sleep(100);
                System.out.println("卖票，票数=" + ticket--);
            }
        }
        return "票卖完了";
    }

    public static void main(String[] args) throws Exception {
        TestCallable testCallable1 = new TestCallable();
        TestCallable testCallable2 = new TestCallable();
        FutureTask<String> futureTask1 = new FutureTask<>(testCallable1);
        FutureTask<String> futureTask2 = new FutureTask<>(testCallable2);
        new Thread(futureTask1).start();
        new Thread(futureTask2).start();
        System.out.println("futureTask1 = " + futureTask1.get());
        System.out.println("futureTask2 = " + futureTask2.get());
    }
}
