/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege.sigma5.conditional.statements10;

/**
 *
 * @author Afreen Kausar
 */
public class SwitchStatement {
    public static void main(String[] args) {
        int number = 2;
        switch(number){
            case 1: System.out.println("samosa");
                    break;
            case 2: System.out.println("burger");
                    break;
            case 3: System.out.println("mango shake");
                    break;
            default: System.out.println("we realize we are dreaming");
        }
        char ch = 'c';
        switch(ch){
            case 'c': System.out.println("porshe");
                    break;
            case 'a': System.out.println("bmw");
                    break;
            case 'b': System.out.println("ferrari");
                    break;
            default: System.out.println("we realize we are dreaming");
        }
    }
}
