package com.leetcode.my.maximumProductDifferenceBetweenTwoPairs;

import java.util.Arrays;

class Solution {

    // Maximum product difference is the product of the last two elements
    // minus the product of the first two elements.
    public int maxProductDifference(final int[] nums) {
        Arrays.sort(nums);
        final int n = nums.length;
        return (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);
    }
}
