/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.code;

/**
 *
 * @author Afreen Kausar
 */
public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 4;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
