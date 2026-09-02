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
public class OverloadingUsingDataTypes {
//    function calculate int sum
    public static int sum(int a, int b){
        return a+b;
    }
    
//    function calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
    }
}
