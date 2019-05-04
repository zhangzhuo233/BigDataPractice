package com.bd.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-04 14:17
 * @Description: 线程池练习
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        // 创建一个具有固定线程数的线程池
        ExecutorService pool = Executors.newFixedThreadPool(6);
        // 使用lambda表达式创建Runnable对象
        Runnable target = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()
                        + "的i值为: " + i);
            }
        };
        // 向线程池中提交两个线程
        pool.submit(target);
        pool.submit(target);
        // 关闭线程池
        pool.shutdown();
    }
}
