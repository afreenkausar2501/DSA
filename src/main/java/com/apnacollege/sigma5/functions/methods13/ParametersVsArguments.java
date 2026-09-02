/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.functions.methods13;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class ParametersVsArguments {
   public static void printHelloWorldFunction() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2) { //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("Sum is : " + sum);

    }
}
