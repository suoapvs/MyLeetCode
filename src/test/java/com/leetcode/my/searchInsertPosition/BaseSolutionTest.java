package com.leetcode.my.searchInsertPosition;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     */
    @Test
    public void searchInsertPosition_test1() {
        val nums = new int[]{1, 3, 5, 6};
        val target = 5;
        val output = 2;
        val res = searchInsert(nums, target);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     */
    @Test
    public void searchInsertPosition_test2() {
        val nums = new int[]{1, 3, 5, 6};
        val target = 2;
        val output = 1;
        val res = searchInsert(nums, target);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     */
    @Test
    public void searchInsertPosition_test3() {
        val nums = new int[]{1, 3, 5, 6};
        val target = 7;
        val output = 4;
        val res = searchInsert(nums, target);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1,3,5,6], target = 0
     * Output: 0
     */
    @Test
    public void searchInsertPosition_test4() {
        val nums = new int[]{1, 3, 5, 6};
        val target = 0;
        val output = 0;
        val res = searchInsert(nums, target);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1], target = 0
     * Output: 0
     */
    @Test
    public void searchInsertPosition_test5() {
        val nums = new int[]{1};
        val target = 0;
        val output = 0;
        val res = searchInsert(nums, target);
        assertEquals(output, res);
    }

    abstract int searchInsert(int[] nums, int target);
}
