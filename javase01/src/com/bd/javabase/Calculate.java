package com.bd.javabase;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        /*
         * 求三个数的最小值
         */
        int a = 10;
        int b = 20;
        int c = 30;
        int min = (((a < b) ? a : b) < c) ? ((a < b) ? a : b) : c;

        System.out.println(min);
        /*
         * 交换两个数
         */
        int n1 = 11;
        int n2 = 22;
        int tmp = 0;
        tmp = n1;
        n1 = n2;
        n2 = tmp;
        System.out.println("n1:" + n1 + "," + "n2:" + n2);
        /*
         * 输入一个数，判断奇偶数
         */
        System.out.print("输入一个数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + "是偶数");
        } else {
            System.out.println(n + "是奇数");
        }
    }
}