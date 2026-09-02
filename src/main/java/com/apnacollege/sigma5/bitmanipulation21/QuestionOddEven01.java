package com.apnacollege.sigma5.bitmanipulation21;

public class QuestionOddEven01 {
    public static void oddEven(int n){
         int bitMask = 1;
         if ((n & bitMask) == 0) {
            // Even number
            System.out.println("even number");
         }
         else{
            System.out.println("odd number");
         }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(11);
        oddEven(14);
    }
}
