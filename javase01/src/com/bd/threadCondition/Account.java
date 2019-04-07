package com.bd.threadCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    // 显示定义Lock对象
    private final ReentrantLock lock = new ReentrantLock();
    // 获得指定lock对象对应的Condition
    private final Condition cond = lock.newCondition();
    // 封装成员变量 账户编号,余额
    private String accountNo;
    private double balance;
    // 账户中是否有存款标记,无为false
    private boolean flag = false;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    // 取钱
    public void draw(double drawAmount) {
        // 加锁
        lock.lock();
        try {
            // flag若为false,表示无人存钱，取钱方法阻塞
            if (!flag) {
                cond.await();
            } else {
                // 执行取钱操作
                System.out.println(Thread.currentThread().getName()
                        + "取钱:" + drawAmount);
                balance -= drawAmount;
                System.out.println("账户余额:" + balance);
                // 钱已取走,flag置为false
                flag = false;
                // 唤醒其他线程
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    // 存钱
    public void deposit(double depositAmount) {
        // 加锁
        lock.lock();
        try {
            if (flag) {
                cond.await();
            } else {
                // 执行存钱操作
                System.out.println(Thread.currentThread().getName()
                        + "存钱" + depositAmount);
                balance += depositAmount;
                System.out.println("账户余额:" + balance);
                // 已有存款,flag置为true
                flag = true;
                // 唤醒其他线程
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
