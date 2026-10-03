package com.apnacollege.sigma5.bitmanipulation21.practice;

public class Solution4 {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase 

        for(char ch = 'A'; ch <= 'z'; ch++){
            System.out.println((char)(ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
