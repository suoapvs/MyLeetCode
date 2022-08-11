package com.leetcode.my.validateBinarySearchTree;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: root = [2,1,3]
     * Output: true
     */
    @Test
    public void validateBinarySearchTree_test1() {
        val root = new TreeNode(
                2,
                new TreeNode(1),
                new TreeNode(3)
        );
        val valid = true;
        validateBinarySearchTreeTest(root, valid);
    }

    /**
     * Input: root = [5,1,4,null,null,3,6]
     * Output: false
     * Explanation:
     * The root node's value is 5 but its right child's value is 4.
     */
    @Test
    public void validateBinarySearchTree_test2() {
        val root = new TreeNode(
                5,
                new TreeNode(1),
                new TreeNode(
                        4,
                        new TreeNode(3),
                        new TreeNode(6)
                )
        );
        val valid = false;
        validateBinarySearchTreeTest(root, valid);
    }

    abstract boolean isValidBST(TreeNode root);

    private void validateBinarySearchTreeTest(
            final TreeNode root,
            final boolean exRes
    ) {
        val acRes = isValidBST(root);
        assertEquals(exRes, acRes);
    }
}
