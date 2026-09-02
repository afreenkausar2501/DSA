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
public class CheckPrimeOrNot {   
    // only for n>=2
    public static boolean isPrime(int n){
        // corner cases
        // 2
        if (n == 2){
            return true;
        }
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0) { // completely dividing
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
    }
}
