package com.bd.javatask.task01;

import com.bd.javatask.task01.Penguin;

import java.util.Scanner;

public class PenguinTest {
    public static void main(String[] args) {
        Penguin pExam = new Penguin();
        System.out.println("欢迎来到宠物店!");
        System.out.printf("请输入要领养宠物的名字：");
        Scanner sc = new Scanner(System.in);
        pExam.setName(sc.next());
        System.out.printf("请选择要领养的宠物类型（1.狗 2.企鹅）：");
        switch (sc.nextInt()) {
            case 1:
                pExam.setType(1);
                break;
            case 2:
                pExam.setType(2);
                System.out.printf("请选择企鹅的性别（1.Q仔 2.Q妹）：");
                pExam.setGender(sc.nextInt());
                System.out.printf("请输入企鹅的健康值（1~100之间）：");
                pExam.setHealthValue(sc.nextInt());
                break;
            default:
                break;
        }
        pExam.show();
    }
}
