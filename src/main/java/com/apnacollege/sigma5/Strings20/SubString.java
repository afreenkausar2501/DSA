package com.apnacollege.sigma5.Strings20;

public class SubString {
    public static String getSubstring(String str, int start, int end) {
        String substr = "";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }

        return substr;
    }
    public static void main(String[] args) {
        String str = "Afreen Kausar";
        System.out.println(getSubstring(str, 0, 6));


        // Substring from index 0 to 6
        System.out.println(str.substring(0, 6));
        // Substring from index 7 to end
        System.out.println(str.substring(7));
    }
}
