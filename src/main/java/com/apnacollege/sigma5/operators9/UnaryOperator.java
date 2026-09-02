/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.operators9;

/**
 *
 * @author Afreen Kausar
 */
public class UnaryOperator {

    public static void main(String[] args) {
//        Pre Increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

//        Post Increment
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        
//        Pre Decrement
        int a1 = 10;
        int b1 = --a1;
        System.out.println(a1);
        System.out.println(b1);
        
//        Post Decremtn
        int c1 = 10;
        int d1 = c1--;
        System.out.println(c1);
        System.out.println(d1);
    }
}
