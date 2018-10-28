package com.bd.javabase;


import java.util.Scanner;

//打印杨辉三角(行数可以键盘录入)
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        1 5 10 10 5 1
public class TwoDimensionalArrayDemo2 {
    public static void main(String[] args) {
        // 杨辉三角的特点：
        // 1.每个数等于它上方两数之和。
        // 2.每行数字左右对称，由1开始逐渐变大。
        // 3.第n行的数字有n项。
        // 4.任何一行的第一列和最后一列都是1
        // 5.每个数字等于上一行的左右两个数字之和。可用此性质写出整个杨辉三角。
        // 即第n+1行的第i个数等于第n行的第i-1个数和第i个数之和，这也是组合数的性质之一。
        // 即 C(n+1,i)=C(n,i)+C(n,i-1)

        Scanner sc = new Scanner(System.in);
        System.out.print("输入杨辉三角的行数:");
        int n = sc.nextInt();
        // 创建二维数组
        int[][] arr = new int[n][];
        // 赋值成为一个杨辉三角
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        // 遍历输出
        for (int i = 0; i < arr.length; ++i) {
            for (int m = 0; m < n - i - 1; ++m) {
                System.out.printf(" ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
