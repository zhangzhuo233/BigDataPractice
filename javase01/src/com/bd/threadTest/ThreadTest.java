package com.bd.threadTest;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
    }
}