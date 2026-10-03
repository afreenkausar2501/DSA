package com.apnacollege.sigma5.oops22;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "yellow";
        System.out.println(p1.color);

    }
}


class Pen {
    // property
    String color;
    int tip;
    // functions
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}


class Student{
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }

}
