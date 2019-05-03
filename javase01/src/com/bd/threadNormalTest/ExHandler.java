package com.bd.threadNormalTest;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-03 18:14
 * @Description: 定义自己的异常处理器
 */
class MyExHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t + " 线程出现了异常: " + e);
    }
}
public class ExHandler {
    public static void main(String[] args) {
        // 设置主线程的异常处理器
        Thread.currentThread().setUncaughtExceptionHandler
                (new MyExHandler());
        int a = 5 / 0;
        System.out.println("程序正常结束!");
    }
}
