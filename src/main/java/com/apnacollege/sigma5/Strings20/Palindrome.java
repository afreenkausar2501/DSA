package com.apnacollege.sigma5.Strings20;
//  Time Complexity: O(n/2) = O(n)
public class Palindrome {
    // Check if a string is a palindrome or not
    public static boolean isPalindrome(String str) {
       for (int i = 0; i < str.length() / 2; i++) {
        int n = str.length();
           if (str.charAt(i) != str.charAt(n - 1 - i)) {
            // Not a palindrome
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
