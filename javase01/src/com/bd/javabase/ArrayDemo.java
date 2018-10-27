package com.bd.javabase;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10,20,30};
        int[] arr2 = new int[2];
        // arr2 = arr1;
        // System.out.println(arr2[2]);
        System.out.println(arr1);
        System.out.println(arr2);
        /*
        //栈中数据未被初始化
        int x;
        System.out.println(x);
        */
        // 动态初始化
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "]" + ":" + arr[i]);
        }
        // 静态初始化
        String[] strArr = new String[]{"我是", "你", "爸爸"};
        for (int i = 0; i < strArr.length; i++) {
            System.out.printf(strArr[i]);
        }
        System.out.println();
        System.out.println("arr:"+ arr);
        System.out.println("StrArr:"+ strArr);
    }
}
