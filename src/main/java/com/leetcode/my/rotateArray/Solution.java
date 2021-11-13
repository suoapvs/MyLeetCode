package com.leetcode.my.rotateArray;

class Solution {

    public void rotate(int[] nums, int k) {
        final int n = nums.length;
        k = k % n;
        // rotate the whole array
        reverse(nums, 0, n - 1);
        // reverse first k elements
        reverse(nums, 0, k - 1);
        // reverse rest of elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        int tmp;
        while (i < j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
