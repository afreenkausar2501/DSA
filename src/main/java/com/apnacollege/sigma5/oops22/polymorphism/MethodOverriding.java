package com.apnacollege.sigma5.oops22.polymorphism;

public class MethodOverriding {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Deer d = new Deer();
        d.eat();

        Animal a1 = new Deer();
        a1.eat();
    }
    
}

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating");
    }
}