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
public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vlaue of n number");
        int n = sc.nextInt();
        
        int val = 1, sum = 0;
        while (val <=n) {            
            sum = sum + val;
            val++; 
        }
        System.out.println(sum + " Sum of natural number");
    }
}
