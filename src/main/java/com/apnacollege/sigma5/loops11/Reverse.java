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
public class Reverse {
//    Reverse the given number0
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        
        System.out.println(rev);
    }
}
