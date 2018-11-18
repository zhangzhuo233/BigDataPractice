package com.bd.javabase;

public class StaticTest {
    static int num;

    public static void main(String[] args) {
        num++;
        StaticTest st1 = new StaticTest();
        st1.num++;
        StaticTest st2 = new StaticTest();
        st2.num++;
        StaticTest.num++;
        System.out.println(num);
    }
}
