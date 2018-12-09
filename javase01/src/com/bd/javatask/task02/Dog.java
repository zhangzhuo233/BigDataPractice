package com.bd.javatask.task02;

public class Dog extends Pet{
    public Dog(String name, String gender, int healthValue, int intimacy) {
        super(name, gender, healthValue, intimacy);
    }
    public void show() {
        System.out.println(super.getName());
    }
}
