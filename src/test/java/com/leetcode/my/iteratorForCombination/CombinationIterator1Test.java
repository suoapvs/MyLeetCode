package com.leetcode.my.iteratorForCombination;

import java.util.Iterator;

class CombinationIterator1Test
        extends BaseSolutionTest {

    @Override
    Iterator<String> createIterator(
            final String characters,
            final int combinationLength
    ) {
        return new CombinationIterator1(characters, combinationLength);
    }
}
