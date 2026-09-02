package com.apnacollege.sigma5.part2.patterns14;

public class FloydsTrianglePattern {
    public static void floydsTrianglePattern(int n){
        int counter = 1;
        // outer loop - rows
        for(int i=1; i<=n; i++){
            // inner - how many times will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydsTrianglePattern(5);
    }
}
