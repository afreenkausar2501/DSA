/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.live5.practice.session11;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long factorial = 1;
        for (long i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
