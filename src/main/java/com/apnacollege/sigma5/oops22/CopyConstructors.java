package com.apnacollege.sigma5.oops22;

public class CopyConstructors {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Afreen";
        s1.rollNo = 27;
        s1.password = "abcd@123";
        
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy

        s2.password = "xyz@123";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

       


        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.password);
    }
}

class Student{
    String name;
    int rollNo;
    String password;
    int marks[];


    // Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
        // this.password = s1.password;
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor called");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;  
    }

   Student(int rollNo){
    marks = new int[3];
        this.rollNo = rollNo;
    }
}