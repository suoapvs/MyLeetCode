package com.leetcode.my.validateBinarySearchTree;

// faster
class Solution2 {

    boolean valid = true;

    public boolean isValidBST(TreeNode root) {
        this.valid = true;
        checkValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        return this.valid;
    }

    private void checkValid(TreeNode root, long low, long high) {
        if (root != null) {
            checkValid(root.left, low, root.val);
            checkValid(root.right, root.val, high);

            if (root.val >= high || root.val <= low) {
                this.valid = false;
            }
        }
    }
}
