package com.apnacollege.sigma5.array15.part01;

import java.util.Scanner;


public class ArrayInputOutputUpdate {
    public static void main(String[] args) {
        int marks[] = new int[5]; // Size of array is 5

        System.out.println("length of marks array : " + marks.length);

        Scanner sc = new Scanner(System.in);

        // int phy;
        // phy = sc.nextInt();

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        marks[2] = 99; // updating math marks
        System.out.println("math updated : " + marks[2]);

        marks[0] = marks[0] + 1; // phy updated
        System.out.println("phy updated : " + marks[0]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage : " + percentage + "%");
    }
}
