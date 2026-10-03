package com.apnacollege.sigma5.oops22;

public class HierarchialInteritance {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.eat();
        parrot.fly();
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
    void walk(){
        System.out.println("Mammal is walking");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Fish is swimming");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Bird is flying");
    }
}

