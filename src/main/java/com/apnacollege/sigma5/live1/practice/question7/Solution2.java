/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.live1.practice.question7;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of A");
        int a = sc.nextInt();
        
        System.out.println("Enter the number of B");
        int b = sc.nextInt();
        
        if (a>b) {
            System.out.println("A is greatest");
        } else {
            System.out.println("B is greatest");
        }
    }
}
