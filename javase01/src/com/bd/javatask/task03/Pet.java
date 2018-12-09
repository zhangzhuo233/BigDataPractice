package com.bd.javatask.task03;

public class Pet {
    private String name;
    private int healthyValue;

    public Pet() {
    }

    public Pet(String name, int healthyValue) {
        this.name = name;
        this.healthyValue = healthyValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthyValue() {
        return healthyValue;
    }

    public void setHealthyValue(int healthyValue) {
        this.healthyValue = healthyValue;
    }

    public void eat() {
            System.out.println(name + "正在吃东西");
    }
}
