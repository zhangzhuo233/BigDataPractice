package com.bd.javabase;

public class StaticTest2 {
    static int num = 100;
    static {
        num+=100;
        System.out.println(num);
    }
    static {
        num+=100;
        System.out.println(num);
    }

    public static void main(String[] args) {
        StaticTest2 st = new StaticTest2();
        StaticTest2 st1 = new StaticTest2();
        System.out.println(num);
    }
}
