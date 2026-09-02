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
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
