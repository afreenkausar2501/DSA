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
public class OverloadingUsingParameters {
//    function to calculate sum of 2 numbers
    public static int sum(int a, int b){
        return a + b;
    }
//    function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 1));
        System.out.println(sum(3 , 2, 1));
    }
}
