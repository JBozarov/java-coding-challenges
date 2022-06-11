package com.javacodingchallenges.test;

public class Dog extends Animal {
    public void run(){
        System.out.println("Dog is running");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.run("HEllO");
    }
}
