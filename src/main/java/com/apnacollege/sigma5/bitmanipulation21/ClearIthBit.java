package com.apnacollege.sigma5.bitmanipulation21;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1)); // Output: 8
        System.out.println(clearIthBit(10, 2)); // Output: 10
    }
}
