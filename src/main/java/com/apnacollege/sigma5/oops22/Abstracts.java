package com.apnacollege.sigma5.oops22;

public class Abstracts {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang

        



        // Animal a = new Animal(); // This will give an error because we cannot instantiate an abstract class
        
        
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // System.out.println("Horse color: " + h.color);

        // Deer d = new Deer();
        // d.eat();
        // d.walk();
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
        // color = "brown";

    }

    // Non-abstract method
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void walk(); // Abstract method
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "black";
    }
    void walk(){
        System.out.println("Horse is walking");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang contructor called");
    }
}

class Deer extends Animal{
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("Deer is walking");
    }
}
