package com.bd.threadSynchronizedTest;

public class DrawThread extends Thread{
    private Account account;
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("draw: " + i);
            account.draw(drawAmount);
        }
    }
}
