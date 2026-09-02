package com.apnacollege.sigma5.array15.part01;

import java.util.*;

// Largest numbers in an array

public class LargestArray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in the array is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers [] = {1, 2, 6, 3, 5};
        System.out.println("Largest number in the array is: " + getLargest(numbers));

    }
}
