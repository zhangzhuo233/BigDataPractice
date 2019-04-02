package com.bd.threadNormalTest;

public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 20; i++) {
            // 返回当前线程的名字
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " " + i);
            if (i == 10) {
                // 创建并启动第一个线程
                new FirstThread().start();
                // 创建并启动第二个线程
                new FirstThread().start();
            }
        }
    }
}
