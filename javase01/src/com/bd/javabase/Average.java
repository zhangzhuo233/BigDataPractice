package com.bd.javabase;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("按顺序输入成绩，用空格间隔:");
        String score = sc.nextLine();
        // debug
        System.out.println(score);
        // use space split score string
        String[] scorestr = score.split(" ");
        int[] scorenum = new int[scorestr.length];
        // save score in scorenum
        for (int i = 0; i < scorenum.length; i++) {
            scorenum[i] = Integer.parseInt(scorestr[i]);
        }
        // calculate
        int sum = 0;
        for (int j = 0; j < scorenum.length; j++) {
            sum += scorenum[j];
        }
        // debug
        System.out.println("总分" + sum);
        System.out.println("平均分:" + sum / scorenum.length);
    }
}
