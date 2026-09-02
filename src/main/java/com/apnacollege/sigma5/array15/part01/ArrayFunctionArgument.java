package com.apnacollege.sigma5.array15.part01;

public class ArrayFunctionArgument {
    public static void updateMarks(int marks[], int nonChangeable) {
        nonChangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {97, 98, 99};
        int nonChangeable = 5;
        updateMarks(marks, nonChangeable);
        System.out.println(nonChangeable);


        // print our marks array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
