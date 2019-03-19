package com.bd.threadTest;

import java.util.Date;

public class SleepThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间:" + new Date());
            // sleep方法使main线程休息1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
