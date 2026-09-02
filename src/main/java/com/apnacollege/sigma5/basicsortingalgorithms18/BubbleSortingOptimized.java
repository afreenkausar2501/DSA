package com.apnacollege.sigma5.basicsortingalgorithms18;
// [1, 2, 3, 4, 5] => [1, 2, 3, 4, 5] (Optimized Bubble Sort) O(n) => Best Case
public class BubbleSortingOptimized {
    public void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swapped = 0; // boolean swapped = false;
            
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0) {
                break;
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
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSortingOptimized bubbleSort = new BubbleSortingOptimized();
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);
    }
}
