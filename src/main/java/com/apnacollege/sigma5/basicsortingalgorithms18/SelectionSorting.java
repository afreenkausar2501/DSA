package com.apnacollege.sigma5.basicsortingalgorithms18;

// Time Complexity: O(n^2) 
public class SelectionSorting {
    public static void selectionSort(int[] arr) {
        // outer loop for number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            // inner loop for comparison
            for (int j = i + 1; j < arr.length; j++) {
                // increasing order condition > and decreasing order condition <
                if (arr[minPos] > arr[j]) {
                    
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }  
    public static void main(String[] args) {
            int[] arr = {5, 4, 1, 3, 2};
            SelectionSorting.selectionSort(arr);
            SelectionSorting.printArray(arr);
    }
}
