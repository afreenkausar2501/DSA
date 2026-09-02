/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.variable.datatype.practice.questions8;

/**
 *
 * @author Afreen Kausar
 */
public class Solution4 {
//    Solution 04: Type Conversion
    public static void main(String[] args) {
        byte b = 4;
        char c = 'c';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
