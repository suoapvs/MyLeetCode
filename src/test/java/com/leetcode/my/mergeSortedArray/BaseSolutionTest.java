package com.leetcode.my.mergeSortedArray;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class BaseSolutionTest {

    /**
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     */
    @Test
    public void merge_test1() {
        val nums1 = new int[]{1, 2, 3, 0, 0, 0};
        val m = 3;
        val nums2 = new int[]{2, 5, 6};
        val n = 3;
        val output = new int[]{1, 2, 2, 3, 5, 6};
        merge(nums1, m, nums2, n);
        assertTrue(Arrays.equals(nums1, output));
    }

    /**
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0
     * Output: [1]
     */
    @Test
    public void merge_test2() {
        val nums1 = new int[]{1};
        val m = 1;
        val nums2 = new int[]{};
        val n = 0;
        val output = new int[]{1};
        merge(nums1, m, nums2, n);
        assertTrue(Arrays.equals(nums1, output));
    }

    /**
     * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
     * Output: [1]
     */
    @Test
    public void merge_test3() {
        val nums1 = new int[]{0};
        val m = 0;
        val nums2 = new int[]{1};
        val n = 1;
        val output = new int[]{1};
        merge(nums1, m, nums2, n);
        assertTrue(Arrays.equals(nums1, output));
    }

    abstract void merge(int[] nums1, int m, int[] nums2, int n);
}
