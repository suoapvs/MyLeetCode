package com.leetcode.my.convertSortedArrayToBinarySearchTree;

class Solution {

    public TreeNode sortedArrayToBST(final int[] nums) {
        return buildSubBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildSubBST(
            final int[] nums,
            final int start,
            final int end
    ) {
        if (start > end) {
            return null;
        }
        final int mid = (start + end) / 2;
        return new TreeNode(
                nums[mid],
                buildSubBST(nums, start, mid - 1),
                buildSubBST(nums, mid + 1, end)
        );
    }
}
