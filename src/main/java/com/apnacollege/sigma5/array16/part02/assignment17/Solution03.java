package com.apnacollege.sigma5.array16.part02.assignment17;
// import java.util.*;
public class Solution03 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if ( buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution03 solution = new Solution03();
        int result = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + result);   
    } 
}
