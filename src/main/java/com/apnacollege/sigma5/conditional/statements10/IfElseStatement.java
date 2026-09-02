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
public class IfElseStatement {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Adult: drive, vote");
        }
        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not adult");
        }
    }
}
