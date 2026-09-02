/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.flowchart.pseudocode7;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of a");
        int a = sc.nextInt();
        
        System.out.println("Enter the number of b");
        int b = sc.nextInt();
        
        System.out.println("Enter the number of c");
        int c = sc.nextInt();
        
        if (a>b) {
            if (a>c) {
                System.out.println(a+"A is greater than B and C");
            } else {
                System.out.println(c+"C is greater than A and B");
            }
        } else {
            if (b>c) {
                System.out.println(b+"B is greater than A and C");
            } else {
                System.out.println(c+"C is greater than B and A");
            }
        }
    }
}
