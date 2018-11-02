package com.bd.javabase;

import java.util.Scanner;

public class Vistor {
    String name;
    int age;


    public void buyTicket() {
        if (age > 18) {
            System.out.println("100元");
        } else {
            System.out.println("10元");
        }
    }
}