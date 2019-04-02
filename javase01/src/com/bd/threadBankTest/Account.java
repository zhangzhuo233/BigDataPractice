package com.bd.threadBankTest;

/**
 * @file 封装账户相关
 */

public class Account {
    // 封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;

    public Account(String accountNo, double balance) {
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
                && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.getAccountNo().equals(accountNo);

        }
        return false;
    }

    public synchronized void draw(double drawAmount) {
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
    }
}
