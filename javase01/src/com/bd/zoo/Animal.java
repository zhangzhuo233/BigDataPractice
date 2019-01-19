package com.bd.zoo;

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

    public void setLegNum(int legNum) throws AnimalException{
        if (legNum < 0 || legNum > 4)
            throw new AnimalException("legNum is Wrongful");
        this.legNum = legNum;
    }

    public abstract String shout();
}