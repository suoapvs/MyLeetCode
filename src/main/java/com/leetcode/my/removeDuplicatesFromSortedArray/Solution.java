package com.leetcode.my.removeDuplicatesFromSortedArray;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            // If the two nums are different then increment
            // and store the new value
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        // return k + 1; after placing k unique elements.
        return k + 1;
    }
}
