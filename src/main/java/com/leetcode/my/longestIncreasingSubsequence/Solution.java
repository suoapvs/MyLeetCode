package com.leetcode.my.longestIncreasingSubsequence;

class Solution {

    public int lengthOfLIS(final int[] nums) {
        final int[] tails = new int[nums.length];
        int size = 0, i, j, m;
        for (int num : nums) {
            i = 0;
            j = size;
            while (i != j) {
                m = (i + j) / 2;
                if (tails[m] < num) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            tails[i] = num;
            if (i == size) {
                size++;
            }
        }
        return size;
    }
}
