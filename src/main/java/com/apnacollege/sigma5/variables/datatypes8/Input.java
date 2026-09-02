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
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        String input = sc.next();
//        System.out.println(input);
        
        String name = sc.nextLine();
        System.out.println(name);
        
        int number = sc.nextInt();
        System.out.println(number);
        
        float price = sc.nextFloat();
        System.out.println(price);
        
        double cgpa = sc.nextDouble();
        System.out.println(cgpa);
        
        boolean var = sc.nextBoolean();
        System.out.println(var);
        
        short n = sc.nextShort();
        System.out.println(n);
        
        long num = sc.nextLong();
        System.out.println(num);
    }
}
