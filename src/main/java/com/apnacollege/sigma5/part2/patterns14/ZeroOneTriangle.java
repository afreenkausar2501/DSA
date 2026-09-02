package com.apnacollege.sigma5.part2.patterns14;

public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n){
        // Outer loop for number of rows
        for(int i=1; i<=n; i++){
            // Inner loop for number of columns
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 "); // Even
                } else {
                    System.out.print("0 "); // Odd
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zeroOneTriangle(5);
    }
}
