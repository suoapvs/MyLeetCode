package com.leetcode.my.largestDivisibleSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        final int length = nums.length;
        final int[] count = new int[length];
        final int[] pre = new int[length];
        Arrays.sort(nums);
        int max = 0;
        int index = -1;
        for (int i = 0; i < length; i++) {
            count[i] = 1;
            pre[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0) {
                    if (1 + count[j] > count[i]) {
                        count[i] = count[j] + 1;
                        pre[i] = j;
                    }
                }
            }
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }
        final List<Integer> res = new ArrayList<>();
        while (index != -1) {
            res.add(nums[index]);
            index = pre[index];
        }
        return res;
    }
}
