package com.bd.javabase;

class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.furColor = "white";
        dog.name = "Tom";
        dog.run();
    }
}

class Dog {
    String furColor;
    String name;

    void run() {
        System.out.println(furColor + " " + name + " " + "running...");
    }
}
