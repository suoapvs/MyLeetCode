package com.leetcode.my.reverseInteger;

class Solution {

    public int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) res;
    }
}
