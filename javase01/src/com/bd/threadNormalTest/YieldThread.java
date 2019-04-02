package com.bd.threadNormalTest;
/*
* 线程调用yield()方法后
* 1.强制当前线程进入就绪状态
* 2.将执行机会让给：
* 优先级相同 or 更高优先级的线程
* */
public class YieldThread extends Thread{
    public YieldThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + i);
            // 当i==20时，使用yield()使当前线程让步
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldThread yt1 = new YieldThread("高级");
        // 将yt1设置成最高优先级
        yt1.setPriority(Thread.MAX_PRIORITY);
        yt1.start();
        YieldThread yt2 = new YieldThread("低级");
        // 将yt2设置成最低优先级
        yt2.setPriority(Thread.MIN_PRIORITY);
        yt2.start();
    }
}
