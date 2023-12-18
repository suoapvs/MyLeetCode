package com.leetcode.my.mergeSortedArray;

import lombok.experimental.Delegate;

class MergeSortedArraySolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}