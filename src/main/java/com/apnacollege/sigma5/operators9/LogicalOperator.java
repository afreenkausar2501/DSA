/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.operators9;

/**
 *
 * @author Afreen Kausar
 */
public class LogicalOperator {

    public static void main(String[] args) {

//        Logical AND Operator &&
        System.out.println("Logical AND Operator &&");
        System.out.println((3 < 2) && (5 < 0));
        System.out.println((3 < 2) && (5 > 0));
        System.out.println((3 > 2) && (5 < 0));
        System.out.println((3 > 2) && (5 > 0));

//        Logical OR operator ||
        System.out.println("Logical OR operator ||");
        System.out.println((3 < 2) || (5 < 0));
        System.out.println((3 < 2) || (5 > 0));
        System.out.println((3 > 2) || (5 < 0));
        System.out.println((3 > 2) || (5 > 0));

//        Logical NOT Operator !
        System.out.println("Logical NOT Operator !");
        System.out.println(!(3 > 2));
        System.out.println(!(5 < 0));
    }
}
