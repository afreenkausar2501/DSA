/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.operators.practice.questions9;

/**
 *
 * @author Afreen Kausar
 */
// Question 01: 
public class Solution1 {
    public static void main(String[] args) {
        int x = 2, y = 5;
        
        int exp1 = ( x * y / x);
        int exp2 = ( x * (y / x));
        
        System.out.print(exp1 + ",");
        System.out.print(exp2);
    }
}
