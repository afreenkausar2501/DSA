/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.conditional.statements10;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter your second value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter your operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default : 
                System.out.println("Wrong Operator");
        }
    }
}
