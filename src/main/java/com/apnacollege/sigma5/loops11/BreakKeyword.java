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
public class BreakKeyword {

    public static void main(String[] args) {
//        Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number");
            int userNumber = sc.nextInt();
            if (userNumber % 10 == 0){
                System.out.println("Loop break!");
                break;
            }
        } while (true);
    }
}
