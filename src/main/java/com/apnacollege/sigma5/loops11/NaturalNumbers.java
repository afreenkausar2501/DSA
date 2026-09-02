/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.loops11;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class NaturalNumbers {
//    Print sum of first n natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        int i = 1;
        while (i <= n) {            
            sum += i; //    sum = sum + 1;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
