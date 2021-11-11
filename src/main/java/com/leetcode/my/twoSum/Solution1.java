package com.leetcode.my.twoSum;

class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        final int[] res = new int[2];
        out:
        for (int i = 1; i <= nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] + nums[j + i] == target) {
                    res[0] = j;
                    res[1] = j + i;
                    break out;
                }

            }
        }
        return res;
    }
}
