package com.apnacollege.sigma5.basicsortingalgorithms18.basicsortingpractice18;



public class BubbleSort {
    public static void bubbleSortDescending(int arr[]){
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 5, 3, 1};
        BubbleSort bubbleSort = new BubbleSort();
        BubbleSort.bubbleSortDescending(arr);
        bubbleSort.printArray(arr);
    }
}
