package com.leetcode.my.convertSortedArrayToBinarySearchTree;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [-10,-3,0,5,9]
     * Output: [0,-3,9,-10,null,5]
     * Explanation: [0,-10,5,null,-3,null,9] is also accepted
     */
    @Test
    public void convertSortedArrayToBinarySearchTree_test1() {
        val nums = new int[]{-10, -3, 0, 5, 9};
        val output = new TreeNode(
                0,
                new TreeNode(-10, null, new TreeNode(-3)),
                new TreeNode(5, null, new TreeNode(9))
        );
        val res = sortedArrayToBST(nums);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1,3]
     * Output: [3,1]
     * Explanation: [1,3] and [3,1] are both a height-balanced BSTs.
     */
    @Test
    public void convertSortedArrayToBinarySearchTree_test2() {
        val nums = new int[]{1, 3};
        val output = new TreeNode(1, null, new TreeNode(3));
        val res = sortedArrayToBST(nums);
        assertEquals(output, res);
    }

    abstract TreeNode sortedArrayToBST(int[] nums);
}
