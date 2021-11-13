package com.leetcode.my.rotateArray;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */
    @Test
    public void rotateArray_test1() {
        val nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        val k = 3;
        val output = new int[]{5, 6, 7, 1, 2, 3, 4};
        rotate(nums, k);
        assertArrayEquals(output, nums);
    }

    /**
     * Input: nums = [-1,-100,3,99], k = 2
     * Output: [3,99,-1,-100]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */
    @Test
    public void rotateArray_test2() {
        val nums = new int[]{-1, -100, 3, 99};
        val k = 2;
        val output = new int[]{3, 99, -1, -100};
        rotate(nums, k);
        assertArrayEquals(output, nums);
    }

    abstract void rotate(int[] nums, int k);
}
