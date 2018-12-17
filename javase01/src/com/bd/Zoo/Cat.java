package com.bd.Zoo;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int legNum) {
        super(name, legNum);
    }

    @Override
    public String shout() {
        return "喵喵喵";
    }
}