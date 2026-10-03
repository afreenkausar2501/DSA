package com.apnacollege.sigma5.oops22;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Afreen", 27);
        System.out.println(s1.name);
        System.out.println(s1.age);

        Pen p1 = new Pen();
    }

}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    

}

class Pen{
    Pen(){
        System.out.println("Constructor called");
    }
   
}
