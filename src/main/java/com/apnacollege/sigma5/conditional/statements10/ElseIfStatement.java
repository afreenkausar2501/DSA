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
public class ElseIfStatement {
    public static void main(String[] args) {
        int age = 13;
        
        if (age >= 18) {
            System.out.println("adult");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("child");
        }
    }
}
