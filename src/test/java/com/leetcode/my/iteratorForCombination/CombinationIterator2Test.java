package com.leetcode.my.iteratorForCombination;

import java.util.Iterator;

class CombinationIterator2Test
        extends BaseSolutionTest {

    @Override
    Iterator<String> createIterator(
            final String characters,
            final int combinationLength
    ) {
        return new CombinationIterator2(characters, combinationLength);
    }
}
