/*
 * @file 实现一个完整的java封装例子
 * @author zhangzhuo
 * */
package com.bd.javatest;

public class Person {
    // 定义私有属性
    private String name;
    private int age;

    // 定义无参构造函数&有参构造函数
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 定义公共方法
    // 在公有方法中对属性的合法值进行判断
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null)
            System.out.println("name不合法");
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("age不合法");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
