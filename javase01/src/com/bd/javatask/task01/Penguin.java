package com.bd.javatask.task01;

public class Penguin {
    // penguin's attribute
    private String name;
    private String type;
    private String gender;
    private int healthValue = 60;
    private int intimacy;

    // getter&settter function
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(int type) {
        if(type == 1) {
            this.type = "狗狗";
        }else {
            this.type = "企鹅";
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(int gender) {
        if(gender == 1) {
            this.gender = "Q仔";
        }else {
            this.gender = "Q妹";
        }
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        if(healthValue < 0 || healthValue > 100) {
            System.out.println("健康值应该在0至100之间，默认值是60");
            return;
        }
        this.healthValue = healthValue;
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    // show方法
    public void show() {
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫"+this.name+",健康值是"+this.healthValue+",和主人的亲密度是"+this.intimacy+",我的性别是"+this.gender);
    }
}
