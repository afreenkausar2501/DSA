/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.operators.practice.questions9;

/**
 *
 * @author Afreen Kausar
 */
// Question 02:
public class Solution2 {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if (x > y && y > z) {
            
            System.out.println("Hello");
        }
        
        if (z > y && z < x) {
            System.out.println("Java");
        }
        
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
    }
}
