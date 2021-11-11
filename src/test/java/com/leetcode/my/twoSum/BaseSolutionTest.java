package com.leetcode.my.twoSum;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSolutionTest {

    @Test
    public void twoSum_test1() {
        val nums = new int[]{2, 7, 11, 15};
        val target = 9;
        val output = new int[]{0, 1};
        val res = twoSum(nums, target);
        assertArrayEquals(output, res);
    }

    @Test
    public void twoSum_test2() {
        val nums = new int[]{3, 2, 4};
        val target = 6;
        val output = new int[]{1, 2};
        val res = twoSum(nums, target);
        assertArrayEquals(output, res);
    }

    abstract int[] twoSum(int[] nums, int target);
}
