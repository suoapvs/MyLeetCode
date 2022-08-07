package com.leetcode.my.removeDuplicatesFromSortedArray;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     */
    @Test
    public void removeDuplicatesFromSortedArray_test1() {
        val nums = new int[]{1, 1, 2};
        val expectedNums = new int[]{1, 2};
        removeDuplicatesTest(nums, expectedNums);
    }

    /**
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     */
    @Test
    public void removeDuplicatesFromSortedArray_test2() {
        val nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        val expectedNums = new int[]{0, 1, 2, 3, 4};
        removeDuplicatesTest(nums, expectedNums);
    }

    abstract int removeDuplicates(int[] nums);

    private void removeDuplicatesTest(
            final int[] nums,
            final int[] expectedNums
    ) {
        val k = removeDuplicates(nums);
        assertEquals(k, expectedNums.length);
        for (var i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
