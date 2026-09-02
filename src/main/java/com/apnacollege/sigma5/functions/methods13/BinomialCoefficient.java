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
public class BinomialCoefficient {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
       return f; // factorial of n
    }
    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}
