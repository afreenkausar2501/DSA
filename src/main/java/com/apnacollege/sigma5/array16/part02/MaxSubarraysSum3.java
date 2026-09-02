package com.apnacollege.sigma5.array16.part02;
// Kadane's algorithm
public class MaxSubarraysSum3 {
public static void kadanes(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for(int i=0; i<numbers.length; i++) {
        currentSum = currentSum + numbers[i];
        if(currentSum < 0) {
            currentSum = 0;
        }
        maxSum = Math.max(currentSum, maxSum);

    }
    System.out.println("Maximum subarray sum is: " + maxSum);

}
public static void kadanesAlgo(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for(int i=0; i<numbers.length; i++) {
        currentSum = currentSum + numbers[i];
        if(currentSum > maxSum) {
            maxSum = currentSum;
        }
        if(currentSum < 0) {
            currentSum = 0;
        }
    }
    System.out.println("Maximum subarray sum is: " + maxSum);
}

    public static void main(String[] args) {
        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // kadanes(numbers);

        int numbers[] = {-1, -2, -3};
        kadanesAlgo(numbers);
    }
}
