package com.bd.Zoo;

public class Dolphin extends Animal {
    public Dolphin() {
    }

    public Dolphin(String name, int legNum) {
        super(name, legNum);
    }

    @Override
    public String shout() {
        return "海豚音";
    }

}
