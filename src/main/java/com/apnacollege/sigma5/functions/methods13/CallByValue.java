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
public class CallByValue {
    public static void swap(int a, int b) {
//        Swap
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
    }

    public static void main(String[] args) {
//        Swap - values exchange
        int a = 5;
        int b = 10;
       
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
//        System.out.println("temp = " + temp);
    }
}
