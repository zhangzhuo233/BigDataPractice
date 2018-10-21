package com.bd.javabase;

public class DrawStar {
    public static void main(String[] args) {
        // 矩形
        System.out.println("---矩形---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        // 平行四边形
        System.out.println("---平行四边形---");
        for (int i = 0; i < 5; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < 5; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 三角形
        System.out.println("---三角形---");
        for (int i = 0; i < 5; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * i + 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 九九乘法表
        System.out.println("---九九乘法表---");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j+" ");
            }
            System.out.println();
        }
    }
}
