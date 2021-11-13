package com.leetcode.my.squaresOfASortedArray;

import lombok.experimental.Delegate;

class SquaresOfASortedArraySolutionTest
        extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
