package com.leetcode.my.uniquePaths;

public class Solution2 {

    public int uniquePaths(int m, int n) {
        final int[] dp = new int[n]; // row
        // init
        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
        }
        // dp
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
