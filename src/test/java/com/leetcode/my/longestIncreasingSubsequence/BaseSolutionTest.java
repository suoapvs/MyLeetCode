package com.leetcode.my.longestIncreasingSubsequence;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [10,9,2,5,3,7,101,18]
     * Output: 4
     * Explanation: The longest increasing subsequence
     * is [2,3,7,101], therefore the length is 4.
     */
    @Test
    public void longestIncreasingSubsequence_test1() {
        val nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        val output = 4;
        val res = lengthOfLIS(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [0,1,0,3,2,3]
     * Output: 1
     */
    @Test
    public void longestIncreasingSubsequence_test2() {
        val nums = new int[]{0, 1, 0, 3, 2, 3};
        val output = 4;
        val res = lengthOfLIS(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [7,7,7,7,7,7,7]
     * Output: 1
     */
    @Test
    public void longestIncreasingSubsequence_test3() {
        val nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        val output = 1;
        val res = lengthOfLIS(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [10, 22, 9, 33, 21, 50, 41, 60]
     * Output: 5
     */
    @Test
    public void longestIncreasingSubsequence_test4() {
        val nums = new int[]{10, 22, 9, 33, 21, 50, 41, 60};
        val output = 5;
        val res = lengthOfLIS(nums);
        assertEquals(output, res);
    }

    abstract int lengthOfLIS(int[] nums);
}
