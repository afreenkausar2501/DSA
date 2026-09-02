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
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 10899;
        
        while (n > 0) {            
            int lastDigits = n % 10;
            System.out.print(lastDigits);
            n = n / 10; //  n/=10;
        }
        System.out.println();
    }
}
