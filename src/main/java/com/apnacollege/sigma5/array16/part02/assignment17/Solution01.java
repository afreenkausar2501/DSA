package com.apnacollege.sigma5.array16.part02.assignment17;

import java.util.HashSet;

public class Solution01 {
    
    // Approach 1: Brute Force O(n^2)
    // public static boolean containsDuplicate(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false; 
    // }

    // Approach 2: Using HashSet O(n)
    public static boolean containsDuplicateUsingHashSet(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
           if (set.contains(nums[i])) {
               return true;
           }
           else {
               set.add(nums[i]);
           }
       }
       return false;   
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        // boolean result = containsDuplicate(nums);
        // System.out.println("Contains duplicate: " + result);

        boolean result = containsDuplicateUsingHashSet(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
