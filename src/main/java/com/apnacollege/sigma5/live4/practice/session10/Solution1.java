/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.live4.practice.session10;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
//    Practice Session 04 - ( Conditional Statement - 10 )

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive");
        }
        else if(num == 0){
            System.out.println(num + " equals zero");
        }
        else {
            System.out.println(num + " is negative");
        }
        sc.close(); // optional
    }
}
