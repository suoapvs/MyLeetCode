package com.leetcode.my.binarySearch;

public class Solution {

    public int search(final int[] nums, final int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            final int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
