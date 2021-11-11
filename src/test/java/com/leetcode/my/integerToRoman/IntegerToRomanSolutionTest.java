package com.leetcode.my.integerToRoman;

import lombok.experimental.Delegate;

class IntegerToRomanSolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
