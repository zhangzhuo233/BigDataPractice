package com.bd.threadCondition;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account("123", 0);
        new DrawThread("甲", acc, 600).start();
        new DepositThread("乙", acc, 600).start();
        new DepositThread("丙", acc, 600).start();
    }
}