package com.apnacollege.sigma5.array16.part02;

// Brute force approach
public class MaxSubarraysSum1 {
    // O(n^3)
    public static void maxSubarraysSum(int numbers[]) {
       int currentSum = 0;
       int maxSum = Integer.MIN_VALUE;

       for (int i = 0; i < numbers.length; i++) {
           int start = i;
           for (int j = i; j < numbers.length; j++) {
               int end = j;
               currentSum = 0;
               for (int k = start; k <= end; k++) { //print
                // subarray sum
                     currentSum += numbers[k];
               }
               System.out.println("Current sum: " + currentSum);
               if (maxSum < currentSum) {
                   maxSum = currentSum;
               }

           }
       }
       System.out.println("Maximum subarray sum: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraysSum(numbers);
    }
}
