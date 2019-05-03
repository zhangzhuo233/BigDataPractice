package com.bd.threadNormalTest;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-02 17:14
 * @Description: 线程组练习
 */
class Mythread extends Thread {
    // 提供指定线程组名称的构造器
    public Mythread(String name) {
        super(name);
    }

    // 提供指定线程名、线程组名的构造器
    public Mythread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + " 线程的i变量" + i);
        }
    }
}

public class ThreadGroupTest {
    public static void main(String[] args) {
        // 获取主线程所在的线程组，这是所有线程默认的线程组
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        System.out.println("主线程组的名字: "
                + mainGroup.getName());
        System.out.println("主线程组是否是后台线程: "
                + mainGroup.isDaemon());
        new Mythread("主线程组的线程").start();
        ThreadGroup tg = new ThreadGroup("新线程组");
        tg.setDaemon(true);
        System.out.println("tg线程组是否是后台线程组: "
                + tg.isDaemon());
        Mythread tt = new Mythread(tg, "tg组的线程甲");
        tt.start();
        try {
            new Mythread(tg, "tg组的线程乙").start();

            System.out.println("tg活跃线程数: " + tg.activeCount());
        } catch (Exception e) {
            System.out.println("线程组异常，此处不处理");
        }
    }
}
