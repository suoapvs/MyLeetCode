package com.leetcode.my.palindromeNumber;

class Solution {

    public boolean isPalindrome(int x) {
        int temp = x;
        int reversed = 0;
        /* while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        } */
        for (; temp > 0; temp /= 10) {
            reversed = reversed * 10 + temp % 10;
        }
        return reversed == x;
    }
}
