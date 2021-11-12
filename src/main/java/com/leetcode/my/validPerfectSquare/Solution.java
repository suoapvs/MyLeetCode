package com.leetcode.my.validPerfectSquare;

class Solution {

    // Newton's method
    public boolean isPerfectSquare(final int num) {
        long root = num;
        while (root * root > num) {
            root = (root + num / root) / 2;
        }
        return root * root == num;
    }
}
