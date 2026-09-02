package com.apnacollege.sigma5.basicsortingalgorithms18.basicsortingpractice18;



public class SelectionSort {
    public static void selectionSortDecOrder(int[] arr) {
        // outer loop for number of passes
        for (int turn = 0; turn < arr.length; turn++) {
            int minPos = turn;
            // inner loop for comparison
            for (int j = turn + 1; j < arr.length; j++) {
                
                if (arr[minPos] < arr[j]) {
                    
                    minPos = j;
                }
            }
            // swap
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }  
    public static void main(String[] args) {
            int[] arr = {3, 6, 2, 1, 8, 7, 5, 3, 1};
            SelectionSort.selectionSortDecOrder(arr);
            SelectionSort.printArray(arr);
        }
}
