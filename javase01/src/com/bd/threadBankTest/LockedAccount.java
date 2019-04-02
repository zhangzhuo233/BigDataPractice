package com.bd.threadBankTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @file 封装账户相关
 */

public class LockedAccount {
    // 定义锁对象
    private final ReentrantLock  lock = new ReentrantLock();
    // 封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;

    public LockedAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    private void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (null != obj
                && obj.getClass() == LockedAccount.class) {
            LockedAccount target = (LockedAccount) obj;
            return target.getAccountNo().equals(accountNo);

        }
        return false;
    }

    public void draw(double drawAmount) {
        // 加锁
        lock.lock();
        try {
            if (getBalance() >= drawAmount) {
                // 吐出钞票
                System.out.println(Thread.currentThread().getName() + "取钱成功!吐出钞票" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 修改余额
                setBalance(getBalance() - drawAmount);
                System.out.println("\t余额为:" + getBalance());
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败!余额不足!");
            }
        } finally {
            // 修改完成，释放锁
            lock.unlock();
        }
    }
}
