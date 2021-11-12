package com.leetcode.my.sqrtX;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: x = 4
     * Output: 2
     */
    @Test
    public void sqrtX_test1() {
        val x = 4;
        val output = 2;
        val res = mySqrt(x);
        assertEquals(output, res);
    }

    /**
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842...,
     * and since the decimal part is truncated, 2 is returned.
     */
    @Test
    public void sqrtX_test2() {
        val x = 8;
        val output = 2;
        val res = mySqrt(x);
        assertEquals(output, res);
    }

    abstract int mySqrt(int x);
}
