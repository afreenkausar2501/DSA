package com.apnacollege.sigma5.array15.part01;

public class ReversedArray {
    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            // swap
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 8, 10};
        reverseArray(numbers);
        // Print the reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
