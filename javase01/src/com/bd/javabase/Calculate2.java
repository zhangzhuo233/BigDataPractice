package com.bd.javabase;

import java.util.Scanner;

public class Calculate2 {
    public static void main(String[] args) {
        System.out.printf("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int cardNum = sc.nextInt();
        int sum = 0;
        while (cardNum > 0) {
            sum += cardNum % 10;
            cardNum /= 10;
        }
        System.out.println("sum = " + sum);
    }
}
