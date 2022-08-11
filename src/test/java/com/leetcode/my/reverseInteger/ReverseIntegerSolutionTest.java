package com.leetcode.my.reverseInteger;

import lombok.experimental.Delegate;

class ReverseIntegerSolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
