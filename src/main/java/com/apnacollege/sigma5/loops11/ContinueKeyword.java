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
public class ContinueKeyword {
//    Display all numbers entered by user except multiples of 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {            
            int userNumber = sc.nextInt();
            if (userNumber % 10 == 0) {
                continue;
            }
            System.out.println("Number was: " + userNumber);
        } while (true);
    }
}
