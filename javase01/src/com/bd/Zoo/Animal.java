package com.bd.Zoo;

public abstract class Animal {
    private String name;
    private int legNum;

    public Animal() {
    }

    public Animal(String name, int legNum) {
        this.name = name;
        this.legNum = legNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegNum() {
        return legNum;
    }

    public void setLegNum(int legNum) {
        this.legNum = legNum;
    }

    // TODO 定义"动物叫"方法
    public abstract String shout();
}