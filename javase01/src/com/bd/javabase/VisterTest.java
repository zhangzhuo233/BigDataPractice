package com.bd.javabase;

import java.util.Scanner;

public class VisterTest {
    public static void main(String[] args) {
        Util tool = new Util();
        Vistor vs = new Vistor();
        Scanner sc = new Scanner(System.in);
        System.out.printf("依次输入name,age:");
        String value = sc.nextLine();
        String[] valueSplited = tool.splitInputValueBySign(value, ",");
        vs.name = valueSplited[0];
        vs.age = Integer.parseInt(valueSplited[1]);
        vs.buyTicket();
    }
}
