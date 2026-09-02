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
public class Solution2 {
//    Solution 02: Area of Square
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        
        int area = side * side;
        
        System.out.println("area of the square is: " + area);
    }
}
