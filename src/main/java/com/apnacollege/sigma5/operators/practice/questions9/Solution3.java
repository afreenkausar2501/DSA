/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.operators.practice.questions9;

/**
 *
 * @author Afreen Kausar
 */
public class Solution3 {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
