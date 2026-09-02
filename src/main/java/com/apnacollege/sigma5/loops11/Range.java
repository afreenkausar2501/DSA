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
public class Range {
//    Print number from 1 to n

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
