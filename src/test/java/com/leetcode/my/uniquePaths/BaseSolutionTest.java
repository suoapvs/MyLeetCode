package com.leetcode.my.uniquePaths;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: m = 3, n = 7
     * Output: 28
     */
    @Test
    public void uniquePaths_test1() {
        val m = 3;
        val n = 7;
        val output = 28;
        val res = uniquePaths(m, n);
        assertEquals(output, res);
    }

    /**
     * Input: m = 3, n = 2
     * Output: 3
     * Explanation:
     * From the top-left corner, there are a total of 3 ways
     * to reach the bottom-right corner:
     * 1. Right -> Down -> Down
     * 2. Down -> Down -> Right
     * 3. Down -> Right -> Down
     */
    @Test
    public void uniquePaths_test2() {
        val m = 3;
        val n = 2;
        val output = 3;
        val res = uniquePaths(m, n);
        assertEquals(output, res);
    }

    /**
     * Input: m = 7, n = 3
     * Output: 28
     */
    @Test
    public void uniquePaths_test3() {
        val m = 7;
        val n = 3;
        val output = 28;
        val res = uniquePaths(m, n);
        assertEquals(output, res);
    }

    /**
     * Input: m = 2, n = 1
     * Output: 1
     */
    @Test
    public void uniquePaths_test4() {
        val m = 1;
        val n = 2;
        val output = 1;
        val res = uniquePaths(m, n);
        assertEquals(output, res);
    }

    abstract int uniquePaths(int m, int n);
}
