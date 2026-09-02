/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.loops11;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class CheckPrimeORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        
//        if (n == 2) {
//            System.out.println("n is prime");
//        }
//        else {
//            boolean isPrime = true;
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//            }
//        }
//        if (isPrime == true) {
//            System.out.println("n is prime");
//        }
//        else {
//            System.out.println("n is not prime");
//        }
//        }

int n = sc.nextInt();
        
        if (n == 2) {
            System.out.println("n is prime");
        }
        else {
            boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {   //  n is a multiple of i (i not equal to 1 or n)
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("n is prime");
        }
        else {
            System.out.println("n is not prime");
        }
        }
    }
}
