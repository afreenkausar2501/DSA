package com.apnacollege.sigma5.oops22;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
// Parent class / base class
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void breathe(){
        System.out.println("Animal is breathing");
    }
}
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Mammal is walking");
    }
}
class Dog extends Mammal{
    String breed;
    void bark(){
        System.out.println("Dog is barking");
    }
}