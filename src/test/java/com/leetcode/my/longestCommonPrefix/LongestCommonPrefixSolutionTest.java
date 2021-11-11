package com.leetcode.my.longestCommonPrefix;

import lombok.experimental.Delegate;

class LongestCommonPrefixSolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
