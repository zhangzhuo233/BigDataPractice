package com.bd.javaTest;

public class PersonExecute {
    public static void main(String[] args) {
        Person person = new Person("王思聪", 32);
        System.out.println("姓名:"+person.getName()+" 年龄:"+person.getAge());
        person.setName("王建轮");
        person.setAge(50);
        System.out.println("姓名:"+person.getName()+" 年龄:"+person.getAge());
    }
}
