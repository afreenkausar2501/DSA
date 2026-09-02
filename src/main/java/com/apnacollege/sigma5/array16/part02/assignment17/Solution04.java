package com.apnacollege.sigma5.array16.part02.assignment17;

public class Solution04 {
    public int trap(int[] height) {
        int n = height.length;
       int res = 0, l = 0, r = n - 1;
       int rMax = height[r], lMax = height[l];

       while (l < r) {
           if (lMax < rMax) {
               l++;
               lMax = Math.max(lMax, height[l]);
               res += lMax - height[l];
           } else {
               r--;
               rMax = Math.max(rMax, height[r]);
               res += rMax - height[r];
           }
       }
         return res;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution04 solution = new Solution04();
        int result = solution.trap(height);
        System.out.println("Water trapped: " + result);

    }
}
