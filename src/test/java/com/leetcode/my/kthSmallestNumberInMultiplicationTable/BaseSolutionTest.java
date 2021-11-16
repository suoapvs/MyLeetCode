package com.leetcode.my.kthSmallestNumberInMultiplicationTable;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: m = 3, n = 3, k = 5
     * Output: 3
     * Explanation: The 5th smallest number is 3.
     */
    @Test
    public void kthSmallestNumberInMultiplicationTable_test1(){
        val m = 3;
        val n = 3;
        val k = 5;
        val output = 3;
        val res = findKthNumber(m, n, k);
        assertEquals(output, res);
    }

    /**
     * Input: m = 2, n = 3, k = 6
     * Output: 6
     * Explanation: The 6th smallest number is 6.
     */
    @Test
    public void kthSmallestNumberInMultiplicationTable_test2(){
        val m = 2;
        val n = 3;
        val k = 6;
        val output = 6;
        val res = findKthNumber(m, n, k);
        assertEquals(output, res);
    }

    abstract int findKthNumber(int m, int n, int k);
}
