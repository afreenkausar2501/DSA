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
public class Solution5 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
