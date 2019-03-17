package com.bd.threadTest;

import java.util.concurrent.*;

public class ThirdThread {
    public static void main(String[] args) {
        ThirdThread rt = new ThirdThread();
        // 使用lambda表达式创建callable对象
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()
                        + "的i值为" + i);
            }
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()
            + "的i值为" + i);
            if (i == 20) {
                new Thread(task, "有返回值的线程").start();
            }
        }
        try {
            // 获取线程返回值
            System.out.println("子线程的返回值:" + task.get());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
