package com.apnacollege.sigma5.part2.patterns14;

public class HollowRhombusPattern {
    public static void hollowRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            // hollow rectangle logic - stars only at borders
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    public static void main(String[] args) {
        hollowRhombusPattern(7);
    }
}
