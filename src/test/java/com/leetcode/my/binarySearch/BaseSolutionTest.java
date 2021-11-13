package com.leetcode.my.binarySearch;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     */
    @Test
    public void binarySearch_test1() {
        val nums = new int[]{-1, 0, 3, 5, 9, 12};
        val target = 9;
        val output = 4;
        val res = search(nums, target);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [-1,0,3,5,9,12], target = 2
     * Output: -1
     * Explanation: 2 does not exist in nums so return -1
     */
    @Test
    public void binarySearch_test2() {
        val nums = new int[]{-1, 0, 3, 5, 9, 12};
        val target = 2;
        val output = -1;
        val res = search(nums, target);
        assertEquals(output, res);
    }

    abstract int search(int[] nums, int target);
}
