/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.live6.practice.session12;

/**
 *
 * @author Afreen Kausar
 */
public class BottomLeftTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                if (row - column >= 0) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
