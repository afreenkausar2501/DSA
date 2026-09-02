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
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.99f;
        int b = (int) a;
        System.out.println(b);
        
        float marks = 99.99f;
        int marks2 = (int) marks;
        System.out.println(marks2);
        
        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
