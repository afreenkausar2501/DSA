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
public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--){
            for (int x = 5; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
