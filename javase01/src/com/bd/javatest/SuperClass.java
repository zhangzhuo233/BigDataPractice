package com.bd.javatest;

public class SuperClass {
    private int superId;
    protected int superPid;

    SuperClass() {
        System.out.println("父类的无参构造方法");
    }
    SuperClass(int id){
        System.out.println("父类的有参构造方法");
    }
}
