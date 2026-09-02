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
public class DecimalToBinary {
    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        
        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem* (int)Math.pow(10, pow));
            
            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        decToBin(7);
    }
}
