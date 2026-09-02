package com.apnacollege.sigma5.array15.part01;

public class LinearSearchPracticeQuestion {
    public static int linearSearch(String menu[], String key){
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu [] = {"Dosa", "Idli", "Vada", "Pongal", "Uttapam"};
        String key = "Pongal"; 
        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("Key not found in the array");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
