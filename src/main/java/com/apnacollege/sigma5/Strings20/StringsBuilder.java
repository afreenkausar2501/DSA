package com.apnacollege.sigma5.Strings20;

public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } // Time Complexity: O(n) => 0(26) => O(1)
        // O(n^2)
        // StringBuilder is mutable, so it can be modified without creating a new object

        System.out.println(sb);
        // abcd...xyz

        System.out.println(sb.length()); // 26
    }
}
