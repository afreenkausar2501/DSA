package com.apnacollege.sigma5.Strings20;

public class StringCharAtMethod {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(); // Move to the next line after printing all characters
    }
    public static void main(String[] args) {
        String fullName = "Tony Stark";
        // System.out.println(fullName.charAt(0));
        printLetters(fullName);
    }
}
