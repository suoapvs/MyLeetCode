package com.leetcode.my.countVowelsPermutation;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: n = 1
     * Output: 5
     */
    @Test
    public void countVowelsPermutation_test1() {
        val n = 1;
        val expectedCount = 5;
        countVowelPermutationTest(n, expectedCount);
    }

    /**
     * Input: n = 2
     * Output: 10
     */
    @Test
    public void countVowelsPermutation_test2() {
        val n = 2;
        val expectedCount = 10;
        countVowelPermutationTest(n, expectedCount);
    }

    /**
     * Input: n = 5
     * Output: 68
     */
    @Test
    public void countVowelsPermutation_test3() {
        val n = 5;
        val expectedCount = 68;
        countVowelPermutationTest(n, expectedCount);
    }

    abstract int countVowelPermutation(int n);

    private void countVowelPermutationTest(
            final int n,
            final int expectedCount
    ) {
        val actualCount = countVowelPermutation(n);
        assertEquals(expectedCount, actualCount);
    }
}
