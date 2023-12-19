package com.leetcode.my.imageSmoother;

import lombok.experimental.Delegate;

class ImageSmootherSolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}