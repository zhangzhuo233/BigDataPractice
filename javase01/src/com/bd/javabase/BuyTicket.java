package com.bd.javabase;

public class BuyTicket {
    String name;
    int age;


    public void buyTicket() {
        if (age > 18) {
            System.out.println(name+"需要支付"+"100元"+"因为是"+age+"岁");
        } else {
            System.out.println(name+"免费"+"因为是"+age+"岁");
        }
    }
}