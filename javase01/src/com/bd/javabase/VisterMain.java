package com.bd.javabase;

import java.util.Scanner;

public class VisterMain {
    public static void main(String[] args) {
        Util tool = new Util();
        BuyTicket vs = new BuyTicket();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("依次输入name,age:");
            String value = sc.nextLine();
            String[] valueSplited = tool.splitInputValueBySign(value, ",");
            vs.name = valueSplited[0];
            vs.age = Integer.parseInt(valueSplited[1]);
            if("n".equals(vs.name))
                break;
            vs.buyTicket();
        } while (true);
        System.out.println("程序退出");
    }
}
