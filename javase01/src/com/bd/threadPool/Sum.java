package com.bd.threadPool;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-08 21:03
 * @Description: Recursive Task对一个长度为100的数组元素值进行累加求和
 */
class CallTask extends RecursiveTask {
    // 每个小任务最多累加20个数
    private static final int THRESHOLD = 20;
    private int arr[];
    private int start;
    private int end;

    // 累加从start到end的数
    public CallTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        // 当start~end之间的差值 < THRESHOLD,进行累加
        if (end - start < THRESHOLD) {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            // 当start~end之间的差值 > THRESHOLD
            // 将大任务分解成小任务
            int middle = (end + start) / 2;
            CallTask left = new CallTask(arr, start, middle);
            CallTask right = new CallTask(arr, middle, end);
            // 并行执行两个小任务,ForkJoinTask<V>的方法
            // Arranges to asynchronously execute this task in the pool the current task is running in,
            // if applicable, or using the ForkJoinPool.commonPool() if not inForkJoinPool().
            left.fork();
            right.fork();
            // 获取每一个线程的值,ForkJoinTask<V>的方法
            Integer leftRes = (Integer) left.join();
            Integer rightRes = (Integer) right.join();
            return leftRes + rightRes;
        }
    }
}

public class Sum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[100];
        Random rand = new Random();
        int total = 0;
        // 初始化出100个数字元素
        for (int i = 0; i < 100; i++) {
            int tmp = rand.nextInt(20);
            // 对数组赋值，并将数组元素的值添加到total中去
            total += (arr[i] = tmp);
        }
        System.out.println("---正常计算得到的值:" + total);
        // 利用线程池进行计算求和
        ForkJoinPool pool = new ForkJoinPool();
        // 提交可分解的任务
        Future<Integer> future = pool.submit(new CallTask(arr, 0, arr.length));
        System.out.println("线程池计算出的数值:" + future.get());
        pool.shutdown();
    }
}
