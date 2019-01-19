package com.bd.practicalClass;

import java.util.Random;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        String str = "11 22 33 44 55 66";
        System.out.println(StrCheck.getSignCount(str, " "));
        String[] strs = str.split(" ");
        for (String pstr : strs) {
            System.out.println(pstr);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("输入java文件");
        String srcFile = sc.next();
        System.out.println("请输入邮箱");
        String email = sc.next();
        if (StrCheck.suffixcheck(srcFile))
            System.out.println("文件后缀名正确");
        if (StrCheck.emailCheck(email))
            System.out.println("邮箱地址正确");
    }
//    public static void main(String[] args) {
//        String srcStr = "1.java";
//        System.out.println(srcStr.substring(srcStr.length()-5));
//        char a = 65;
//        System.out.println(a);
//        String str = "aAaaAdddssaaac";
//        System.out.println(str.indexOf(65));
//        System.out.println(str.indexOf(65, 2));
//        String name = "haha";
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.equalsIgnoreCase("HAHA"));
//        String newName = name.concat("haode");
//        System.out.println(name + " " + newName);
//        boolean isLogin = false;
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("用户名");
//            String username = sc.next();
//            System.out.println("密码");
//            String password = sc.next();
//            System.out.println("再次输入密码");
//            String passEnsure = sc.next();
//            if (username.length() >= 3 && password.length() >= 6 &&
//                    password.equals(passEnsure)) {
//                isLogin = true;
//                System.out.println("注册成功");
//            } else {
//                System.out.println("注册失败");
//            }
//        } while (!isLogin);
//
//    }
//    public static void main(String[] args) {
//        /**
//         * 装箱：基本类型-->包装类
//         * new包装类 or 包装类.valueof
//         */
//        Integer a = new Integer(1);
//        Integer b = new Integer("123");
//        int c = b.intValue();
//        Double du = Double.valueOf("12.1");
//        /**
//         * 拆箱:包装类-->基本类型
//         * XXXValue
//         */
//        Integer Value = new Integer(15);
//        int value = Value.intValue();
//        System.out.println(a + " " + b + " " + c + " " + du + " " + value);
//        /**
//         * 随机数生成
//         * random生成0.0~1.0之间的数
//         * 1. Math.random
//         * 2.Random类
//         */
//        // 生成12~22之间的随机数
//        int random = (int) (Math.random() * 11 + 12);
//
//        Random rand = new Random();
//        int num = rand.nextInt(11) + 12;
//        System.out.println(random + " " + num);
//        /**
//         * 用同一个种子值来初始化两个Random对象，然后每个对象调用相同的方法，得到的随机数也是相同的
//         */
//        Random rand1 = new Random(1);
//        Random rand2 = new Random(1);
//        int num1 = rand1.nextInt(10);
//        int num2 = rand2.nextInt(20);
//        System.out.println(num1 + " " + num2);
//        /**
//         * String
//         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("用户名");
//        String username = sc.next();
//        System.out.println("密码");
//        String password = sc.next();
//        if (password.length() >= 6) {
//            System.out.println("check");
//        } else {
//            System.out.println("not check");
//        }
//        if ("TOM".equals(username) && "111111".equals(password)) {
////        if(username.equals("TOM") && password.equals("111111")) {
////        if("TOM" == username) {
//            System.out.println("pass");
//        } else {
//            System.out.println("not pass");
//        }
//    }
}
