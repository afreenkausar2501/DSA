package com.apnacollege.sigma5.array15.part01;

public class BinarySearch {
   public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found in the array");
        } else {
            System.out.println("Key found at index: " + index);
        }   
    }

    
}
