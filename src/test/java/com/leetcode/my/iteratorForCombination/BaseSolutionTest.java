package com.leetcode.my.iteratorForCombination;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input:
     * ["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
     * [["abc", 2], [], [], [], [], [], []]
     * Output:
     * [null, "ab", true, "ac", true, "bc", false]
     * Explanation:
     * CombinationIterator itr = new CombinationIterator("abc", 2);
     * itr.next();    // return "ab"
     * itr.hasNext(); // return True
     * itr.next();    // return "ac"
     * itr.hasNext(); // return True
     * itr.next();    // return "bc"
     * itr.hasNext(); // return False
     */
    @Test
    public void iteratorForCombination_test1() {
        val characters = "abc";
        val combinationLength = 2;
        val iterator = createIterator(characters, combinationLength);
        assertEquals("ab", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("ac", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("bc", iterator.next());
        assertFalse(iterator.hasNext());
    }

    abstract Iterator<String> createIterator(
            String characters, int combinationLength
    );
}
