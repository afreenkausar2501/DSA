/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.variables.datatypes8;

/**
 *
 * @author Afreen Kausar
 */
public class TypePromotion {
    public static void main(String[] args) {
        
        char a = 'a';
        char b = 'b';
//        char c = a-b; // error
        System.out.println((int) (b));
        System.out.println((int) (a));
        System.out.println(a);
        System.out.println(b-a);
        
        short a1 = 5;
        byte b1 = 25;
        char c1 = 'c';
//        byte bt = a1 + b1 + c1; // error
        byte bt1 = (byte) (a1 + b1 + c1);
        System.out.println(bt1);
        
        int a2 = 10;
        float b2 = 20.25f;
        long c2 = 25;
        double d2 = 30;
        double ans = a2 + b2 + c2 + d2;
//        int ans = a2 + b2 + c2 + d2;  // error
        System.out.println(ans);
        
        
        
//        wrong
//        byte b3 = 5;
//        b3 = b3 * 2;
        
//        right
        byte b3 = 5;
        b3 =(byte) (b3*2);
        System.out.println(b3);
        
    }
}
