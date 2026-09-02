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
public class CalculateSimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of principal (P)");
        int p = sc.nextInt();

        System.out.println("Enter the value of Rate (R)");
        int r = sc.nextInt();

        System.out.println("Enter the value of Time (T)");
        int t = sc.nextInt();

        int si = p * r * t / 100;
        System.out.println("Simple Interest is " + si);

        sc.close();
    }
}
