package com.bd.javatask.task02;

public class Pet {
    private String name;
    private String type;
    private String gender;
    private int healthValue = 60;
    private int intimacy;


    public Pet(){}
    public Pet(String name, String gender, int healthValue, int intimacy) {
        this.name = name;
        this.gender = gender;
        this.healthValue = healthValue;
        this.intimacy = intimacy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    // show方法
    protected void show() {
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫" + this.name + ",健康值是" + this.healthValue + ",和主人的亲密度是" + this.intimacy + ",我的性别是" + this.gender);
    }
}
