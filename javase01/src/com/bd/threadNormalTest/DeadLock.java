package com.bd.threadNormalTest;

class A {
    public synchronized void foo(B b) {
        System.out.println(Thread.currentThread().getName()
                + "进入了 A.foo()");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("试图调用B.last()");
        b.last();
    }
    public synchronized void last() {
        System.out.println("进入了A.last()");
    }
}

class B {
    public synchronized void bar(A a) {
        System.out.println(Thread.currentThread().getName()
                + "进入了 B.bar()");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("试图调用A.last()");
        a.last();
    }
    public synchronized void last() {
        System.out.println("进入了 B.last()");
    }
}

public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();
    @Override
    public void run() {
        System.out.println("调用b.bar(a)");
        b.bar(a);
    }
    public void init() {
        System.out.println("调用a.foo(b)");
        a.foo(b);
    }
    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        new Thread(dl).start();
        dl.init();
    }
}
