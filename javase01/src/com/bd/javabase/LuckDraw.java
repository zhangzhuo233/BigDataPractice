package com.bd.javabase;

import java.util.Scanner;

public class LuckDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入会员号：");
        int num = sc.nextInt();
        int hundreds = (num/ 10) % 10;
        switch (hundreds) {
            case 2:
                System.out.println("恭喜中奖");
                break;
            default:
                System.out.println("很遗憾");
        }
    }
}
