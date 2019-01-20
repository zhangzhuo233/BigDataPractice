package com.bd.mathTest;

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入4位会员号");
        String str = sc.next();
        int hundredNum = Integer.parseInt(str.charAt(str.length() - 3) + "");
        System.out.println("hundred number is:" + hundredNum);
        int res = (int)(Math.random() * 10);
        System.out.println("获奖数字是:" + res);
        if (res == hundredNum) {
            System.out.println(str + "是幸运用户");
        } else {
            System.out.println(str + "未中奖");
        }
    }
}
