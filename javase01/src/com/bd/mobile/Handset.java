package com.bd.mobile;

public class Handset {
    String brand;
    String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sendInfo(){
        System.out.println("发送文字信息");
    }
    public void call(){
        System.out.println("开始语音通话");
    }
    public void info(){
        System.out.println("这是一款品牌为"+getBrand()+"的"+getType()+"手机");
    }
}
