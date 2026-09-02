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
public class NaturalNumbers {
    public static void main(String[] args) {
        int n = 4;
        int val = 1, sum = 0;
        while (val <= n) {            
            sum = sum + val;
            val++;
        }
        System.out.println(sum);
    }
}
