package com.bd.javatask.override;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "leo", 18);
        Student stu2 = new Student(1, "leo", 18);
        System.out.println(stu1.equals(stu2));
    }
}
