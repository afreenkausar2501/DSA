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
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of radious (r)");
        int r = sc.nextInt();
        
        double area = 3.14 * r * r;
        System.out.println(area+ " is a area of circle");
        
    }
}
