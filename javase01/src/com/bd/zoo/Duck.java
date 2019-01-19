package com.bd.zoo;

public class Duck extends Animal{
    public Duck() {
    }

    public Duck(String name, int legNum) {
        super(name, legNum);
    }

    @Override
    public String shout() {
        return "嘎嘎嘎";
    }

}
