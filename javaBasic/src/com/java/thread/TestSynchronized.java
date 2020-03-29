package com.java.thread;

public class TestSynchronized implements Runnable {
    private int ticket = 50;

    @Override
    public void run() {
        try {
            super.wait();
            for (int i = 0; i < 200; i++) {
                super.wait();
                super.notify();
                //卖票的过程
                if (sell()) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized boolean sell() throws InterruptedException {
        if (ticket > 0) {
            super.wait();
//            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + "..............票数=" + this.ticket--);
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        TestSynchronized thread0 = new TestSynchronized();
        new Thread(thread0,"票贩子A").start();
        new Thread(thread0,"票贩子B").start();
        new Thread(thread0,"票贩子C").start();
        new Thread(thread0,"票贩子D").start();
    }
}
