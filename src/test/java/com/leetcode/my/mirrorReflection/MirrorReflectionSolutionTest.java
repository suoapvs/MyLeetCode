package com.leetcode.my.mirrorReflection;

import lombok.experimental.Delegate;

class MirrorReflectionSolutionTest extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
