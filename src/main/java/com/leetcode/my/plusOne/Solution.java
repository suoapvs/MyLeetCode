package com.leetcode.my.plusOne;

class Solution {

    public int[] plusOne(int[] digits) {
        final int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // for {9} -> {1, 0}, {99} -> {100}...
        final int[] newNumber = new int[length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
