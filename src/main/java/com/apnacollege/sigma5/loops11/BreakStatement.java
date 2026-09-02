/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.loops11;

/**
 *
 * @author Afreen Kausar
 */
public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i = 3");
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop.");
    }
}
