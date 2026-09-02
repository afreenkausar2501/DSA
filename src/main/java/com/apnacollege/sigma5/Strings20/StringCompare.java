package com.apnacollege.sigma5.Strings20;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Afreen";
        String str2 = "Afreen";
        String str3 = new String("Afreen");

        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (str1 == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }


        // Compare using compareTo() method
        if (str1.compareTo(str3) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
