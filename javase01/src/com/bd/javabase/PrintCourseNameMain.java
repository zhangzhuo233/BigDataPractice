package com.bd.javabase;

import java.util.Scanner;

public class PrintCourseNameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入编号:");
        int id = sc.nextInt();
        if(id<0 || id>3){
            System.out.println("该编号不存在，编号区间（0,3）");
            return;
        }
        PrintCourseName getName = new PrintCourseName();
        System.out.println("编号"+id+"的课程是"+getName.print(id));
    }
}
