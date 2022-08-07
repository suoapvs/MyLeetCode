package com.leetcode.my.removeElement;

/**
 * Summary
 * This is a pretty easy problem, but one may get confused by the term
 * "in-place" and think it is impossible to remove an element from the
 * array without making a copy of the array.
 * <p>
 * Solution: Two Pointers
 * <p>
 * Intuition
 * Since this question is asking us to remove all elements of the given
 * value in-place, we have to handle it with O(1) extra space.
 * How to solve it? We can keep two pointers i and j, where i is
 * the slow-runner while j is the fast-runner.
 * <p>
 * Algorithm
 * When nums[j] equals to the given value, skip this element
 * by incrementing j. As long as nums[j] != val, we copy
 * nums[j] to nums[i] and increment both indexes at the same time.
 * Repeat the process until j reaches the end of the array and
 * the new length is i.
 */
class Solution {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            // If the two nums are different then increment
            // and store the new value
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
