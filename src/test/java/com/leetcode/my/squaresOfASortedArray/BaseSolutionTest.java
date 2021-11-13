package com.leetcode.my.squaresOfASortedArray;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     */
    @Test
    public void squaresOfASortedArray_test1() {
        val nums = new int[]{-4, -1, 0, 3, 10};
        val output = new int[]{0, 1, 9, 16, 100};
        val res = sortedSquares(nums);
        assertArrayEquals(output, res);
    }

    /**
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     */
    @Test
    public void squaresOfASortedArray_test2() {
        val nums = new int[]{-7, -3, 2, 3, 11};
        val output = new int[]{4, 9, 9, 49, 121};
        val res = sortedSquares(nums);
        assertArrayEquals(output, res);
    }

    abstract int[] sortedSquares(int[] nums);
}
