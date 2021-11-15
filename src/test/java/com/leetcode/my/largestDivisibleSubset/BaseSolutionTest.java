package com.leetcode.my.largestDivisibleSubset;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [1,2,3]
     * Output: [1,2]
     * Explanation: [1,3] is also accepted.
     */
    @Test
    public void largestDivisibleSubset_test1() {
        val nums = new int[]{1, 2, 3};
        val output1 = List.of(1, 2);
        val output2 = List.of(1, 3);
        val res = largestDivisibleSubset(nums);
        assertTrue(
                equalsCols(output1, res) ||
                        equalsCols(output2, res)
        );
    }

    /**
     * Input: nums = [1,2,4,8]
     * Output: [1,2,4,8
     */
    @Test
    public void largestDivisibleSubset_test2() {
        val nums = new int[]{1, 2, 4, 8};
        val output = List.of(1, 2, 4, 8);
        val res = largestDivisibleSubset(nums);
        assertTrue(equalsCols(output, res));
    }

    abstract List<Integer> largestDivisibleSubset(int[] nums);

    private static <T> boolean equalsCols(
            final Collection<T> first,
            final Collection<T> second
    ) {
        return first.size() == second.size() &&
                first.containsAll(second) &&
                second.containsAll(first);
    }
}
