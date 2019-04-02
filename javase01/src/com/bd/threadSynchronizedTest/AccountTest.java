package com.bd.threadSynchronizedTest;

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account("123", 0);
        // 取钱
        new DrawThread("甲", acct, 800).start();
        // 存钱
        new DepositThread("乙", acct, 800).start();
        new DepositThread("丙", acct, 800).start();

        // DepositThread dt = new DepositThread(acct, 800);
        // new Thread(dt, "乙").start();

    }
}
