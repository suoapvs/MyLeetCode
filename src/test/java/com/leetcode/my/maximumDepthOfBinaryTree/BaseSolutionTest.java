package com.leetcode.my.maximumDepthOfBinaryTree;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     */
    @Test
    public void maximumDepthOfBinaryTree_test1() {
        val root = new TreeNode(
                3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        val output = 3;
        val res = maxDepth(root);
        assertEquals(output, res);
    }

    /**
     * Input: root = [1,null,2]
     * Output: 2
     */
    @Test
    public void maximumDepthOfBinaryTree_test2() {
        val root = new TreeNode(1, null, new TreeNode(2));
        val output = 2;
        val res = maxDepth(root);
        assertEquals(output, res);
    }

    /**
     * Input: root = []
     * Output: 0
     */
    @Test
    public void maximumDepthOfBinaryTree_test3() {
        final TreeNode root = null;
        val output = 0;
        val res = maxDepth(root);
        assertEquals(output, res);
    }

    /**
     * Input: root = [0]
     * Output: 1
     */
    @Test
    public void maximumDepthOfBinaryTree_test4() {
        val root = new TreeNode(0);
        val output = 1;
        val res = maxDepth(root);
        assertEquals(output, res);
    }

    abstract int maxDepth(TreeNode root);
}
