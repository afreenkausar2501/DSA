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
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while(count<25){
            System.out.println("Enter score " + (count + 1) + " : ");
            double score = sc.nextDouble();
            sum += score;
            count++;
        }
        double av = sum/25;
        System.out.println("Average: " +av);
        sc.close();
    }
}
