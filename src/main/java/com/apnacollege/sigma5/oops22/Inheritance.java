package com.apnacollege.sigma5.oops22;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();


        
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



// Child class / derived class / subclass

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Fish is swimming");
    }
}