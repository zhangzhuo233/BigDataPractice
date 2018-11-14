package com.bd.javabase;

public class StudentMain {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu2 = new Student("dad", 50);
        Student stu3 = new Student(50, "add");
        System.out.println(stu2);
    }
}
