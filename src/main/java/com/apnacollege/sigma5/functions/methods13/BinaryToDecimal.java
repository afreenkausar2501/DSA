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
public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            
            pow++;
            binNum = binNum/10;
        }
        
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
