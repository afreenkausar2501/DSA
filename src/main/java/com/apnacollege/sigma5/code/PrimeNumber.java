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
public class PrimeNumber {

    public static void main(String[] args) {
        int n = 5;
        int div = 2;
        boolean isPrime = true;
        while (div < n) {
            if (n % div == 0) {
                System.out.println("Not Prime");
                isPrime = false;
                break;
            } else {
                div++;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        }
    }
}
