package com.bd.threadSynchronizedTest;

public class Account {
    // 封装账户编号&账户余额 成员变量
    private String accountNo;
    private double balance;
    // 标识是否已存款
    private boolean flag = false;

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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null != obj
                && obj.getClass() == Account.class) {
            return accountNo.equals(((Account)obj).getAccountNo());
        }
        return false;
    }

    /**
     * @file 取钱
     * */
    public synchronized void draw(double drawAmount) {
        try {
            // flag=false, 则账户未存钱，取钱方法阻塞，等待存钱
            if (!flag) {
                wait();
            } else {
                // 执行取钱操作
                System.out.println(Thread.currentThread().getName()
                        + "取钱:" + drawAmount);
                balance -= drawAmount;
                System.out.println("账户余额为" + balance);
                flag = false;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * @file 存钱
     * */
    public synchronized void deposit(double depositAmount) {
        try {
            if(flag) {
                wait();
            }
            else {
                System.out.println(Thread.currentThread().getName()
                        + "存钱:" + depositAmount);
                balance += depositAmount;
                System.out.println("账户余额:" + balance);
                flag = true;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
