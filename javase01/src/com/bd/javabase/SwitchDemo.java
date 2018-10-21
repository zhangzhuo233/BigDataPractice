package com.bd.javabase;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 11:
                System.out.println("aaa");
                break;
            default:
                System.out.println("bbb");
                break;
        }
    }

}
