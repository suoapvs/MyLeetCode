package com.leetcode.my.moveZeroes;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */
    @Test
    public void moveZeroes_test1() {
        val nums = new int[]{0, 1, 0, 3, 12};
        val output = new int[]{1, 3, 12, 0, 0};
        moveZeroes(nums);
        assertArrayEquals(output, nums);
    }

    /**
     * Input: nums = [0]
     * Output: [0]
     */
    @Test
    public void moveZeroes_test2() {
        val nums = new int[]{0};
        val output = new int[]{0};
        moveZeroes(nums);
        assertArrayEquals(output, nums);
    }

    /**
     * Input: nums = [1]
     * Output: [1]
     */
    @Test
    public void moveZeroes_test3() {
        val nums = new int[]{1};
        val output = new int[]{1};
        moveZeroes(nums);
        assertArrayEquals(output, nums);
    }

    abstract void moveZeroes(int[] nums);
}
