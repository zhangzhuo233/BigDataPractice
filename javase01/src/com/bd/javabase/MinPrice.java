package com.bd.javabase;

import java.util.Scanner;

public class MinPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("输入手机价格，用英文逗号间隔:");
        String score = sc.nextLine();
        // debug
        System.out.println(score);
        // use space split score string
        String[] scorestr = score.split(",");
        int[] scorenum = new int[scorestr.length];
        // save score in scorenum
        for (int i = 0; i < scorenum.length; i++) {
            scorenum[i] = Integer.parseInt(scorestr[i]);
        }
        // calculate
        int min = scorenum[0];
        for (int j = 0; j < scorenum.length; j++) {
            if (scorenum[j] < min) {
                min = scorenum[j];
            }
        }
        System.out.println("最低价是：" + min);

    }
}
