package com.bd.javatask.task03;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("大黄", 6);
        dog.eat();
        Pet penguin = new Penguin("王思聪", 10);
        int i = 0;
        while (i <= 20) {
            penguin.eat();
            ++i;
        }
    }
}
