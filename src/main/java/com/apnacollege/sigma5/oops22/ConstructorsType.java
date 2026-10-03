package com.apnacollege.sigma5.oops22;

public class ConstructorsType {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Afreen");
        Student s3 = new Student(27);
    }
}

class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor called");
    }

    Student(String name){
        this.name = name;
      
    }
    Student(int age){
        this.age = age;
    }

}
