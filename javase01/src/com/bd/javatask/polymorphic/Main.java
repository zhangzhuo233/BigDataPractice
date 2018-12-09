package com.bd.javatask.polymorphic;

public class Main {
    public static void main(String[] args) {
        Person p = new Student("小花");
        p.show();
        //p.cure(); // Error:(7, 10) java: 找不到符号
                    // 符号:   方法 cure()
                    // 位置: 类型为com.bd.javatask.polymorphic.Person的变量 p
        ((Student) p).cure();
        System.out.println(p instanceof Student);
    }
}