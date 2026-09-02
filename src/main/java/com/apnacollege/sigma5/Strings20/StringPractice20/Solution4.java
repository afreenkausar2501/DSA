package com.apnacollege.sigma5.Strings20.StringPractice20;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        //Convert Strings to lowercase. why? so that we don't have to separately for lower & uppercase.

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same. 
        if (str1.length() != str2.length()) {
            // Convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // Sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if the sorted char arrays are same or identical then the strings are anagrams.

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");

        }

    }
    
}
