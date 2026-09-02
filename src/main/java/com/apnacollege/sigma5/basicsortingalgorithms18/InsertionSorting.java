package com.apnacollege.sigma5.basicsortingalgorithms18;

// Time Complexity: O(n^2)
public class InsertionSorting {
    public void insertionSort(int[] arr) {
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
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        InsertionSorting insertionSort = new InsertionSorting();
        insertionSort.insertionSort(arr);
        insertionSort.printArray(arr);
    }
}
