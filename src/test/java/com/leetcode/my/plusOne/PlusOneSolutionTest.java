package com.leetcode.my.plusOne;

import lombok.experimental.Delegate;

class PlusOneSolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
