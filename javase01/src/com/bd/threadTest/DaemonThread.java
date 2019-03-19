package com.bd.threadTest;

public class DaemonThread extends Thread{
    // 定义守护进程的线程执行体与普通线程没有什么区别

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
        // 将此线程设置为守护线程
        dt.setDaemon(true);
        dt.start();
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        // ---程序运行到此处，前台线程（main）结束---
        // 守护线程也应随之结束
    }
}
