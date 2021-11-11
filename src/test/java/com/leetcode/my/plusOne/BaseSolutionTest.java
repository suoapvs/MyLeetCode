package com.leetcode.my.plusOne;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSolutionTest {

    /**
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     */
    @Test
    public void plusOne_test1() {
        val digits = new int[]{1, 2, 3};
        val output = new int[]{1, 2, 4};
        val res = plusOne(digits);
        assertArrayEquals(output, res);
    }

    /**
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Incrementing by one gives 4321 + 1 = 4322.
     * Thus, the result should be [4,3,2,2].
     */
    @Test
    public void plusOne_test2() {
        val digits = new int[]{4, 3, 2, 1};
        val output = new int[]{4, 3, 2, 2};
        val res = plusOne(digits);
        assertArrayEquals(output, res);
    }

    /**
     * Input: digits = [0]
     * Output: [1]
     * Explanation: The array represents the integer 0.
     * Incrementing by one gives 0 + 1 = 1.
     * Thus, the result should be [1].
     */
    @Test
    public void plusOne_test3() {
        val digits = new int[]{0};
        val output = new int[]{1};
        val res = plusOne(digits);
        assertArrayEquals(output, res);
    }

    /**
     * Input: digits = [9]
     * Output: [1,0]
     * Explanation: The array represents the integer 9.
     * Incrementing by one gives 9 + 1 = 10.
     * Thus, the result should be [1,0].
     */
    @Test
    public void plusOne_test4() {
        val digits = new int[]{9};
        val output = new int[]{1, 0};
        val res = plusOne(digits);
        assertArrayEquals(output, res);
    }

    abstract int[] plusOne(int[] digits);
}
