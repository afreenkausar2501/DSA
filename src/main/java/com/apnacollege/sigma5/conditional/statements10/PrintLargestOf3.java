/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.conditional.statements10;

/**
 *
 * @author Afreen Kausar
 */
public class PrintLargestOf3 {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 6;
        if ((a >= b) && (a >= c)) {
            System.out.println("largest is A");
        } 
        else if (b >= c) {
            System.out.println("largest is B");
        }
        else {
            System.out.println("largest is C");
        }
    }
}
