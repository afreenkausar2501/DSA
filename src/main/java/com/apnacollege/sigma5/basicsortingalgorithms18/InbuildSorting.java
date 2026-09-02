package com.apnacollege.sigma5.basicsortingalgorithms18;

import java.util.Arrays;
import java.util.Collections;

// Time Complexity: O(n^2)
// Insertion code for Inbuild Sorting Algorithm
public class InbuildSorting {
    public void inbuildSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            // Finding out the correct postion to insert
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev + 1] = current;
        }
    }
    public void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

// Reverse order function internally uses compare function to compare two elements.
    // ArrayList topic
public static int compare(int a, int b) {
        // a < b => -ve
        // a == b => 0
        // a > b => +ve
        return b - a;
    }
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 1, 3, 2};
        InbuildSorting inbuildSort = new InbuildSorting();
        // inbuildSort.inbuildSort(arr);
        // Using Java's built-in sort method
        // Arrays.sort(arr); 
        
        // Sorting only first 3 elements of the array
        // Arrays.sort(arr, 0 , 3); 


        // Sorting in descending order
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); 
        inbuildSort.printArray(arr);
    }
}
