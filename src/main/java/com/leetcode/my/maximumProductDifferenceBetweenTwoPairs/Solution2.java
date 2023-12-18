package com.leetcode.my.maximumProductDifferenceBetweenTwoPairs;

public class Solution2 {

    public int maxProductDifference(final int[] nums) {
        int a = Integer.MIN_VALUE; // first big
        int b = Integer.MIN_VALUE; // second big
        int c = Integer.MAX_VALUE; // first small
        int d = Integer.MAX_VALUE; // second small

        for (int num : nums) {
            if (num < c) {
                d = c;
                c = num;
            } else if (num < d) {
                d = num;
            }
            if (num > a) {
                b = a;
                a = num;
            } else if (num > b) {
                b = num;
            }
        }
        return (a * b) - (c * d);
    }
}
