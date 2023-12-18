package com.leetcode.my.maximumProductDifferenceBetweenTwoPairs;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [5,6,2,7,4]
     * Output: 34
     */
    @Test
    public void maxProductDifference_test1() {
        val nums = new int[]{5, 6, 2, 7, 4};
        val output = 34;
        val res = maxProductDifference(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [4,2,5,9,7,4,8]
     * Output: 64
     */
    @Test
    public void maxProductDifference_test2() {
        val nums = new int[]{4, 2, 5, 9, 7, 4, 8};
        val output = 64;
        val res = maxProductDifference(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1, 2, 3, 4]
     * Output: 10
     */
    @Test
    public void maxProductDifference_test3() {
        val nums = new int[]{1, 2, 3, 4};
        val output = 10;
        val res = maxProductDifference(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [4, 3, 2, 1]
     * Output: 10
     */
    @Test
    public void maxProductDifference_test4() {
        val nums = new int[]{4, 3, 2, 1};
        val output = 10;
        val res = maxProductDifference(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [-1, -2, -3, -4]
     * Output: -10
     */
    @Test
    public void maxProductDifference_test5() {
        val nums = new int[]{-1, -2, -3, -4};
        val output = -10;
        val res = maxProductDifference(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [-5, -1, 0, 2, 7]
     * Output: 9
     */
    @Test
    public void maxProductDifference_test6() {
        val nums = new int[]{-5, -1, 0, 2, 7};
        val output = 9;
        val res = maxProductDifference(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [-10, -7, 3, 1, 8]
     * Output: -46
     */
    @Test
    public void maxProductDifference_test7() {
        val nums = new int[]{-10, -7, 3, 1, 8};
        val output = -46;
        val res = maxProductDifference(nums);
        assertEquals(output, res);
    }

    abstract int maxProductDifference(int[] nums);
}
