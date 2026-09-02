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
public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of 2 numbers a and b is " + sum);
        sc.close();
    }
}
