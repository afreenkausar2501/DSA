package com.apnacollege.sigma5.part2.patterns14;

public class SolidRhombusPattern {
     public static void solidRhombusPattern(int n) {
          for (int i = 1; i <= n; i++) {
               // Print spaces
               for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
               }
               // Print stars
               for (int j = 1; j <= n; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }
     }
        public static void main(String[] args) {
            solidRhombusPattern(7);
        }
}
