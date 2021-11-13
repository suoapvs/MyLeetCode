package com.leetcode.my.moveZeroes;

class Solution {

    public void moveZeroes(int[] nums) {
        for (int zeroPos = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, zeroPos++, i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
