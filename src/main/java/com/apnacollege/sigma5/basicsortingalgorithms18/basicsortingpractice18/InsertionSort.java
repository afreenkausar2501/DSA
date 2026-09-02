package com.apnacollege.sigma5.basicsortingalgorithms18.basicsortingpractice18;



public class InsertionSort {
    public void insertionSortDec(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            // To find the index where current is to be inserted
            while (prev >= 0 && arr[prev] < current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev + 1] = current;
        }
    }
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSortDec(arr);
        insertionSort.printArray(arr);
    }
}
