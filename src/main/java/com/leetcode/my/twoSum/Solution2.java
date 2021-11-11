package com.leetcode.my.twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; map.put(nums[i], i++)) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        return new int[]{0, 0};
    }
}
