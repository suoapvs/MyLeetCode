package com.leetcode.my.binarySearch;

import lombok.experimental.Delegate;

class BinarySearchSolutionTest
        extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
