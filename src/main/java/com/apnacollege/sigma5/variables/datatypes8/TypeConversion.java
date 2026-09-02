/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.variables.datatypes8;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class TypeConversion {

    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b); // output 25

//        long c = 25;
//        int d = c;    // error
//        System.out.println(d);
        Scanner sc = new Scanner(System.in);

        float number = sc.nextInt();
        System.out.println(number);
        
//        int num = sc.nextFloat();
//        System.out.println(num);  // error
        

    }
}
