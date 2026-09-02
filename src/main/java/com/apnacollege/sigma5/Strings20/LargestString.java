package com.apnacollege.sigma5.Strings20;

public class LargestString {
    public static String getLargestString(String[] arr) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Banana"};

        String[] arr = {"Afreen", "Kausar", "Zainab", "Ayesha"};

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
        System.out.println(getLargestString(arr));
    }
}
