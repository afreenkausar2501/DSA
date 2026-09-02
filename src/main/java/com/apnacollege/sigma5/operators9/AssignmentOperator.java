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
public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
//        a = a + 10;
        a += 10;
        System.out.println(a);
        
        int b = 5;
//        b = b - 5;
        b -= 5;
        System.out.println(b);
        
        int c = 5;
//        c = c * 5;
        c *= 5;
        System.out.println(c);
        
        int d = 10;
//        d = d / 10;
        d /= 10;
        System.out.println(d);
        
        int e = 4;
//        e = e % 4;
        e %= 4;
        System.out.println(e);
    }
}
