package com.bd.testEnum;

public class TestSubject {
    public static void main(String[] args) {
        Subject su = Subject.U2;
        switch (su) {
            case U1:
                System.out.println("U1");
                break;
            case U2:
                System.out.println("U2");
                break;
            case U3:
                System.out.println("U3");
                break;
            default:
                break;
        }
    }
}
