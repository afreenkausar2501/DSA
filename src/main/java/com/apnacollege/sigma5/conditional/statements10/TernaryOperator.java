/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.conditional.statements10;

/**
 *
 * @author Afreen Kausar
 */
public class TernaryOperator {

    public static void main(String[] args) {
        int number = 4;
        
//        ternary operator
        String type = ((number % 2 == 0)) ? "Even" : "Odd";
        System.out.println(type);
    }
}
