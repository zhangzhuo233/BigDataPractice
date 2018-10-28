package com.bd.javabase;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        // 动态初始化
        // 一维数组长度确定
        int[][] arr1 = new int[3][2];
        System.out.println(arr1[0]);
        // 一维数组长度不定，可以不同
        // 一维数组未初始化，为null，不能直接赋值
        int[][] arr4 = new int[3][];
        System.out.println(arr4[0]);
        arr4[0] = new int[]{1, 2, 3};
        System.out.println(arr4[0]);

        // 静态初始化
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5}};
        System.out.println(arr2[0][1]);
        // 简化写法
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr3[0][0]);

        // 三维数组初始化和遍历
        int[][][] arr5 = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                for (int m = 0; m < arr5[i][j].length; m++) {
                    System.out.printf(arr5[i][j][m]+ " ");
                }
            }
        }
    }
}
