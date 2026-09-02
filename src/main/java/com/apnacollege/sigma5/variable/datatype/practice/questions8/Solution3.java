/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.variable.datatype.practice.questions8;

import java.util.Scanner;

/**
 *
 * @author Afreen Kausar
 */
public class Solution3 {
//    Solution 03: Add GST

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        
        
        float total = pencil + pen + eraser;
        System.out.println("Bill is " + total);
        
//        Add on - with 18% tax
        
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " +newTotal);
        

    }
}
