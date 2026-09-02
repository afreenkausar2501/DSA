/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.part1.patterns12;

/**
 *
 * @author Afreen Kausar
 */
public class HalfPyramid {
    public static void main(String[] args) {
       int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }   
}
