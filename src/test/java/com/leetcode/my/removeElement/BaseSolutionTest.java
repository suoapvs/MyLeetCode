package com.leetcode.my.removeElement;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     */
    @Test
    public void removeElement_test1() {
        val nums = new int[]{3, 2, 2, 3};
        val val = 3;
        val expectedNums = new int[]{2, 2};
        removeElementTest(nums, val, expectedNums);
    }

    /**
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     */
    @Test
    public void removeElement_test2() {
        val nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val val = 2;
        val expectedNums = new int[]{0, 1, 4, 0, 3};
        removeElementTest(nums, val, expectedNums);
    }

    abstract int removeElement(int[] nums, int val);

    private void removeElementTest(
            final int[] nums,
            final int val,
            final int[] expectedNums
    ) {
        val k = removeElement(nums, val);
        assertEquals(k, expectedNums.length);
        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums);
        for (var i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
