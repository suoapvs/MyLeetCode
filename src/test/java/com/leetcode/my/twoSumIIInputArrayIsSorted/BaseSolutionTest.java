package com.leetcode.my.twoSumIIInputArrayIsSorted;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSolutionTest {

    /**
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9.
     * Therefore, index1 = 1, index2 = 2. We return [1, 2].
     */
    @Test
    public void twoSumIIInputArrayIsSorted_test1() {
        val numbers = new int[]{2, 7, 11, 15};
        val target = 9;
        val output = new int[]{1, 2};
        val res = twoSum(numbers, target);
        assertArrayEquals(output, res);
    }

    /**
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * Explanation: The sum of 2 and 4 is 6.
     * Therefore index1 = 1, index2 = 3. We return [1, 3].
     */
    @Test
    public void twoSumIIInputArrayIsSorted_test2() {
        val numbers = new int[]{2, 3, 4};
        val target = 6;
        val output = new int[]{1, 3};
        val res = twoSum(numbers, target);
        assertArrayEquals(output, res);
    }

    /**
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     * Explanation: The sum of -1 and 0 is -1.
     * Therefore index1 = 1, index2 = 2. We return [1, 2].
     */
    @Test
    public void twoSumIIInputArrayIsSorted_test3() {
        val numbers = new int[]{-1, 0};
        val target = -1;
        val output = new int[]{1, 2};
        val res = twoSum(numbers, target);
        assertArrayEquals(output, res);
    }

    abstract int[] twoSum(int[] numbers, int target);
}
