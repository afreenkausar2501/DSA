package com.apnacollege.sigma5.bitmanipulation21;

public class GetIthBit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2)); // Output: 0
        System.out.println(getIthBit(10, 3)); // Output: 1
    }
}
