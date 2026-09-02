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
public class Solution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide input: ");
        int year = sc.nextInt();

//        if (year % 4 != 0) {
//            System.out.println("Not a leap year");
//        } else {
//            if (year % 100 != 0) {
//                System.out.println("Leap year");
//            } else {
//                if (year % 400 != 0) {
//                    System.out.println("Not a leap year");
//                } else {
//                    System.out.println("Leap year");
//                }
//            }
//        }

        if (year % 4 != 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a leap year");
        } else {
            System.out.println("Leap year");
        }
    }
}
