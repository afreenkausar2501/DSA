/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.functions.methods13;

/**
 *
 * @author Afreen Kausar
 */
public class ProductAB {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = multiply(3,5);
        System.out.println(prod);
        prod = multiply(10,20);
        System.out.println(prod);
    }
}
