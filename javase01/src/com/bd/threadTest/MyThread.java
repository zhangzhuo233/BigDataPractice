package com.bd.threadTest;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<=9; ++i) {
            System.out.println("MyThread: " + i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
