package com.leetcode.my.iteratorForCombination;

import java.util.Iterator;

class CombinationIterator3Test
        extends BaseSolutionTest {

    @Override
    Iterator<String> createIterator(
            final String characters,
            final int combinationLength
    ) {
        return new CombinationIterator3(characters, combinationLength);
    }
}
