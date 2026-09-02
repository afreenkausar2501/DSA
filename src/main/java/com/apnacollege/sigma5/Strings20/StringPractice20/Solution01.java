package com.apnacollege.sigma5.Strings20.StringPractice20;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: " + count);
    }
}
