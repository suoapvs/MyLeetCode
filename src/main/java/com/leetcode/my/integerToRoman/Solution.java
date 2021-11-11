package com.leetcode.my.integerToRoman;

class Solution {

    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }
        final int[] integers = new int[]{
                1000, 900, 500, 400, 100,
                90, 50, 40, 10, 9, 5, 4, 1
        };
        final String[] romans = new String[]{
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < integers.length; i++) {
            while (num >= integers[i]) {
                sb.append(romans[i]);
                num -= integers[i];
            }
        }
        return sb.toString();
    }
}
