package com.java.thread;

import java.io.Serializable;
import java.util.Timer;

public class TestThread extends Thread implements Serializable {
    private transient String name;

    public TestThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 200; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(this.name + "-->" + i);
//                System.out.println(Thread.currentThread().getName() + "   时间：" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        TestThread thread1 = new TestThread("线程1");
        TestThread thread2 = new TestThread("线程2");
        TestThread thread3 = new TestThread("线程3");
        //守护线程
//        Timer timer = new Timer();
        thread2.setDaemon(true);
        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);
        thread3.setPriority(NORM_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
