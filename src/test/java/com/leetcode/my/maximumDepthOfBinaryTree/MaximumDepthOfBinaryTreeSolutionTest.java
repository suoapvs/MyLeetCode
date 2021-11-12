package com.leetcode.my.maximumDepthOfBinaryTree;

import lombok.experimental.Delegate;

class MaximumDepthOfBinaryTreeSolutionTest
        extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
