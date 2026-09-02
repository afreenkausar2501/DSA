package com.apnacollege.sigma5.array15.part01;

public class PrintSubarrays {
    public static void printSubarrays(int numbers[]) {
        int totalSubarrays = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i; // 0, 1, 2, 3, 4
            for (int j = i; j < numbers.length; j++) {
                int end = j; // 0, 1, 2, 3,
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                totalSubarrays++;
                sum += totalSubarrays;
                min = Math.min(min, sum);
                max = Math.max(max, sum);
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + totalSubarrays);
        System.out.println("Sum of all subarrays: " + sum);
        System.out.println("Minimum sum: " + min);
        System.out.println("Maximum sum: " + max);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
