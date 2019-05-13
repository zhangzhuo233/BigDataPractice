package com.bd.threadClass;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-13 14:49
 * @Description: ThreadLocal类练习
 */
class Account {
    // 定义线程局部变量
    private ThreadLocal<String> name = new ThreadLocal<>();
    public Account(String str) {
        this.name.set(str);
        // 访问当前账户的初始化名称
        System.out.println("---当前账户名:" + this.name.get());
    }

    public String getName() {
        return this.name.get();
    }

    public void setName(String str) {
        this.name.set(str);
    }
}
class MyTest extends Thread {
    private Account account;

    public MyTest(String name, Account account) {
        super(name);
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            // i==6时，更改账户名为线程名
            if (i == 6) {
                account.setName(getName());
            }
            // 输出账户名 & i变量
            System.out.println(account.getName() + "账户的i变量为:" + i);
        }
    }
}
public class ThreadLocalTest {
    public static void main(String[] args) {
        // 启动两个线程，共享一个Account
        Account account = new Account("初始名称");
        // 每个线程拥有自己的线程名副本
        new MyTest("A线程", account).start();
        new MyTest("B线程", account).start();
    }
}
