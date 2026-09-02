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
public class Pattern2 {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--){
             for(int j = 5; j >= i; j--){
                 System.out.print(j + " ");
             }
             System.out.println();
         }
    }
}
