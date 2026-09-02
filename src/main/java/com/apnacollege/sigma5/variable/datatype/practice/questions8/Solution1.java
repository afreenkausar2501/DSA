/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.variable.datatype.practice.questions8;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class Solution1 {
//   Solution 01: Average of 3 numbers
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int average = (A + B + C) / 3;
        
        System.out.println("average is: " + average);
    }
}
