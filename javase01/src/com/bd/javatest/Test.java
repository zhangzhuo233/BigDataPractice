package com.bd.javatest;

public class Test implements Parent {
    public int count(int i) {
        return i % 9;
    }

    public static void main(String[] args) {
//        Test p = new Test();

        Parent p = new Test();
        int i = p.count(20);
        int[] sc = new int[5];
        int[] sa = {1,2,3};
    }
}