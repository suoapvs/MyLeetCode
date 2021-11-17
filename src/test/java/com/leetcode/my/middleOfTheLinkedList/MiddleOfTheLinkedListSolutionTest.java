package com.leetcode.my.middleOfTheLinkedList;

import lombok.experimental.Delegate;

class MiddleOfTheLinkedListSolutionTest
        extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}
