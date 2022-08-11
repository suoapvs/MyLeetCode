package com.leetcode.my.validateBinarySearchTree;

public class Solution3 {

    // recursive RANGE based solution
    public boolean isValidBST(TreeNode root) {
        return traverse(root, null, null);
    }

    private boolean traverse(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        return (traverse(root.left, low, root.val) && traverse(root.right, root.val, high));
    }
}
