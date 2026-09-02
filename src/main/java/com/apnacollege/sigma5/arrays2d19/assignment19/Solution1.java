package com.apnacollege.sigma5.arrays2d19.assignment19;

public class Solution1 {
    public static void main(String args[]){
        int [][] array = {
            {4, 7, 8},
            {8, 8, 7}
        };

        int countOf7 = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == 7){
                    countOf7++;
                }
            }
        }
        System.out.println("Count of 7: " + countOf7);
    }
}
