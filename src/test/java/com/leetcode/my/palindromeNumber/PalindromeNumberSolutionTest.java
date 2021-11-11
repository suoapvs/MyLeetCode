package com.leetcode.my.palindromeNumber;

import lombok.experimental.Delegate;

class PalindromeNumberSolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
