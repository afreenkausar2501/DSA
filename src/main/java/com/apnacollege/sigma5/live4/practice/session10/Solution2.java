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
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("You have fever");
        } else {
            System.out.println("You dont have fever");
        }
        sc.close(); // optional
    }
}
