package com.bd.blockingQueueTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread {
    private BlockingQueue<String> bq;

    public Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] strArr = new String[]{
                "java",
                "Struts",
                "Spring"
        };
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " producer will to do");
            try {
                Thread.sleep(200);
                // 尝试放入元素，若队列已满，则线程被阻塞
                bq.put(strArr[i % 3]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " producer done: " + bq);
        }
    }
}

class Consumer extends Thread {
    private BlockingQueue<String> bq;

    public Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        System.out.println(getName() + " Consumer will to consume");
        while (true) {
            try {
                Thread.sleep(200);
                // 尝试取出元素，若队列已空，则线程被阻塞
                bq.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " Consumer done: " + bq);
        }
    }
}

public class BlockingQueueTest {
    public static void main(String[] args) {
        // 创建容量为1的BlockingQueue
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
        // 启动3个生产者线程
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();
        // 启动1个消费者线程
        new Consumer(bq).start();
    }
}
