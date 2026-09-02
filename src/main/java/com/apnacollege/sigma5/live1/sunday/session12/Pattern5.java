/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.live1.sunday.session12;

/**
 *
 * @author Afreen Kausar
 */
public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int x = 1; x < i; x++){
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
