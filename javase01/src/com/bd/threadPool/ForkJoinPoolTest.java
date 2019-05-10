package com.bd.threadPool;


import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-04 15:49
 * @Description: ForkJoinPool 练习
 */

// 继承RecursiveAction来实现'可分解'的任务
class PrintTask extends RecursiveAction {
    // 每个小任务最多打印59个数字
    private static final int THRESHOLD = 50;
    private int start;
    private int end;

    // 打印从start->end的任务
    public PrintTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        // 当end-start<THRESHOLD时，开始打印
        if (end - start < THRESHOLD) {
            for (int i = start; i < end; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " i的值: " + i);
            }
        } else {
            // 当end-start>THRESHOLD时，将任务分解
            int middle = (start + end) / 2;
            PrintTask left = new PrintTask(start, middle);
            PrintTask right = new PrintTask(middle, end);
            //并行执行两个小任务
            left.fork();
            right.fork();
        }
    }
}

public class ForkJoinPoolTest {
    public static void main(String[] args) {
        // Date dateObj = new Date();
        // long startTime = dateObj.getTime();
        ForkJoinPool pool = new ForkJoinPool();
        // 提交可分解的PrintTask任务
        pool.submit(new PrintTask(0, 300));
        try {
            // 监测ExecutorService(尽快执行线程的线程池)是否已经关闭，若关闭则返回true，否则返回false
            boolean termiationFlag = pool.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("termiationFlag: " + termiationFlag);
        } catch (InterruptedException e) {
            System.out.println("awaitTermination error:" + e);
            e.printStackTrace();
        }
        // 关闭线程池
        pool.shutdown();
        // long endTime = dateObj.getTime();
    }
}
