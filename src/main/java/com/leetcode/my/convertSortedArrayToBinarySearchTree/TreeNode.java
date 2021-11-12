package com.leetcode.my.convertSortedArrayToBinarySearchTree;

import java.util.Objects;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return this.val + ", " + this.left + ", " + this.right;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TreeNode)) {
            return false;
        }
        final TreeNode that = (TreeNode) o;
        return (this.val == that.val) &&
                Objects.equals(this.left, that.left) &&
                Objects.equals(this.right, that.right);
    }

    @Override
    public int hashCode() {
        int result = 201;
        result = 31 * result + this.val;
        result = 31 * result + Objects.hashCode(this.left);
        result = 31 * result + Objects.hashCode(this.right);
        return result;
    }
}
