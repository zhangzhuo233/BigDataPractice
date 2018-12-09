package com.bd.javatask.polymorphic;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Student extends Person {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "在洗澡");
    }
    public void cure() {
        System.out.println(name + "在照顾猫");
    }
}
