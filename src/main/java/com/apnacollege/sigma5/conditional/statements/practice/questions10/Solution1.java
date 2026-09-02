/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.conditional.statements.practice.questions10;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0) {
            System.out.println("Positive " + x);
        } else {
            System.out.println("Negative " + x);
        }
    }
}
