package com.leetcode.my.kthSmallestElementInASortedMatrix;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
     * Output: 13
     */
    @Test
    public void kthSmallestElementInASortedMatrix_test1() {
        val matrix = new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12,13,15}
        };
        val k = 8;
        val expectedVal = 13;
        kthSmallestTest(matrix, k, expectedVal);
    }

    /**
     * Input: matrix = [[-5]], k = 1
     * Output: -5
     */
    @Test
    public void kthSmallestElementInASortedMatrix_test2() {
        val matrix = new int[][]{{-5}};
        val k = 1;
        val expectedVal = -5;
        kthSmallestTest(matrix, k, expectedVal);
    }

    abstract int kthSmallest(int[][] matrix, int k);

    private void kthSmallestTest(
            final int[][] matrix,
            final int k,
            final int expectedVal
    ) {
        val actualVal = kthSmallest(matrix, k);
        assertEquals(expectedVal, actualVal);
    }
}
