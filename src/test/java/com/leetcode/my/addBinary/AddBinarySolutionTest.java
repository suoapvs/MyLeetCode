package com.leetcode.my.addBinary;

import lombok.experimental.Delegate;

class AddBinarySolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
