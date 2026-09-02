package com.apnacollege.sigma5.part2.patterns14;

public class InvertedHalfPyramidWithNumbers {
    public static void invertedHalfPyramidWithNumbers(int n){
        // outer loop - rows
        for(int i=1; i<=n; i++){
            // inner - numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedHalfPyramidWithNumbers(5);
    }
}
