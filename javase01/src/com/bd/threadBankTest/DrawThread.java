package com.bd.threadBankTest;

/**
 * 模拟用户取钱操作
 */
public class DrawThread extends Thread {
    // 模拟用户账户
    // private Account account;
    private LockedAccount account;
    // 当前取钱线程所希望取得钱数
    private double drawAmount;

    public DrawThread(String name, LockedAccount account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }
    // 当多个线程修改同一个共享数据时，将涉及数据安全问题

    @Override
    public void run() {
        // 直接调用account对象的draw方法来执行取钱操作
        // 同步方法的同步监视器是this，this代表调用draw方法的对象
        // 也就是，线程进入draw方法前，必须先对account对象加锁
        account.draw(drawAmount);
        // 使用account作为同步监视器，任何线程进入下面同步代码之前
        // 必须先获取对account账户的锁定----其他线程无法获得锁，也就无法修改它
        // 这种方法符合："加锁-->修改-->释放锁"的逻辑
        // synchronized (account) {
        // 账户余额大于取钱数目
        // if (account.getBalance() >= drawAmount) {
        //     // 吐出钞票
        //     System.out.println(getName() + "取钱成功!吐出钞票" + drawAmount);
        //     try {
        //         Thread.sleep(1);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     // 修改余额
        //     account.setBalance(account.getBalance() - drawAmount);
        //     System.out.println("\t余额为:" + account.getBalance());
        // } else {
        //     System.out.println(getName() + "取钱失败!余额不足!");
        // }
        // }
    }
}
