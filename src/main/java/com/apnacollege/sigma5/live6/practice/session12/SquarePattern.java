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
public class SquarePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
