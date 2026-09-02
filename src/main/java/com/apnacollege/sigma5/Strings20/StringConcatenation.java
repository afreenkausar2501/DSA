package com.apnacollege.sigma5.Strings20;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";

        // Concatenation using + operator
        String fullName1 = firstName + " " + lastName;
        System.out.println("Full Name (using +): " + fullName1);

        // Concatenation using concat() method
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name (using concat()): " + fullName2);
    }
}
