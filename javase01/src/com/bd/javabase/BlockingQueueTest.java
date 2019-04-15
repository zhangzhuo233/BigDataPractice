package com.bd.javabase;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        // 定义一个程度为2的阻塞队列
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(2);
        bq.put("java");
        bq.put("java");
        // bq.put("java"); //阻塞
    }
}
