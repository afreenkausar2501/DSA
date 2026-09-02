/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.flowchart.pseudocode7;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int div = 2;
        boolean isPrime = true;
        while (div < n) {
            if (n % div == 0) {
                System.out.println(n + " is not a prime number.");
                isPrime = false;
                break;
            } else {
                div++;
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime number.");
        }
    }
}
