/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.part2.patterns14;

/**
 *
 * @author Afreen Kausar
 */
public class HollowRectanglePattern {
//    outer loop

    public static void hollowRectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
//            inner - columns
            for (int j = 1; j <= totCols; j++) {
//                cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
//                       boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(10, 5);
    }
}
