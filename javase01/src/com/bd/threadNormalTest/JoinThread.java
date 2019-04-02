package com.bd.threadNormalTest;

public class JoinThread extends Thread{
    // 提供一个有参的构造器，用于设置该线程的名字
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        // 启动子线程
        new JoinThread("新线程").start();
        for (int i = 0; i < 50; i++) {
            if (i == 20) {
                JoinThread jt = new JoinThread("被join的线程");
                jt.start();
                // main线程调用了jt线程的join方法，main线程
                // 必须等待jt执行结束后才会向下执行
                try {
                    jt.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
