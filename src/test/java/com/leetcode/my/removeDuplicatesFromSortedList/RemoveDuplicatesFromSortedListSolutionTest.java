package com.leetcode.my.removeDuplicatesFromSortedList;

import lombok.experimental.Delegate;

class RemoveDuplicatesFromSortedListSolutionTest
        extends BaseSolutionTest {

    @Delegate
    private final Solution solution = new Solution();
}