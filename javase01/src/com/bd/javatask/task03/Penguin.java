package com.bd.javatask.task03;

public class Penguin extends Pet {
    private String name;
    private int healthyValue;

    public Penguin() {
    }

    public Penguin(String name, int healthyValue) {
        super(name, healthyValue);
    }

    public void eat() {
        if (healthyValue >= 100) {
            System.out.println("健康值达到100，不需要继续喂食");
        } else {
            System.out.println(getName() + "正在吃鱼");
            healthyValue += 5;
        }
    }
}
