/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.functions.methods13;

/**
 *
 * @author Afreen Kausar
 */
public class Factorial {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
       return f; // factorial of n
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
