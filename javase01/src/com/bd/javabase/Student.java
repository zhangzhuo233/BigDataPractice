package com.bd.javabase;

public class Student {
    int age;
    int name;
    public Student(){

    }
    public Student(String name, int age){
        System.out.println("name:"+name+","+"age:"+age);
    }
    public Student(int age, String name){
        System.out.println(age+name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
