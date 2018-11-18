package com.bd.javatest;

public class SubClass extends SuperClass {
    private int subId;
    protected int suId;
    public SubClass() {
        System.out.println("子类的无参构造方法");
    }
    protected SubClass(int id) {
        super(id);
        System.out.println("子类的有参构造方法");
    }
    protected void show(){
        System.out.println("父类的show实例方法");
    }

    public void pshow(){
        System.out.println("父类的pshow实例方法");
    }
    public static void main(String[] args) {
//        SubPaClass sub = new SubPaClass();
        SubClass sub = new SubClass(10);
        System.out.println(sub.superPid);
    }
}
