package com.leetcode.my.twoSumIIInputArrayIsSorted;

class Solution {

    public int[] twoSum(final int[] numbers, final int target) {
        final int[] res = new int[2];
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            final int sum = numbers[first] + numbers[last];
            if (sum == target) {
                res[0] = first + 1;
                res[1] = last + 1;
            }
            if (sum > target) {
                last--;
            } else {
                first++;
            }
        }
        return res;
    }
}
