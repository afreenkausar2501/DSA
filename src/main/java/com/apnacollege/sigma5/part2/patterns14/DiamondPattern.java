package com.apnacollege.sigma5.part2.patterns14;

import java.util.Scanner;

public class DiamondPattern {
    public static void dimondPattern(int n) {
        // 1st half
        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        // Lower Half
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dimondPattern(n);
    }
}
