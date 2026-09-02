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
public class TopLeftTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= n; column++) {
                if (row + column <= n + 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
