package com.leetcode.my.maximumDepthOfBinaryTree;

class Solution {

    public int maxDepth(final TreeNode root) {
        if (root == null) {
            return 0;
        }
        final int leftMaxDepth = maxDepth(root.left);
        final int rightMaxDepth = maxDepth(root.right);
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
