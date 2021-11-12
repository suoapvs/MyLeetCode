package com.leetcode.my.validPerfectSquare;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: num = 16
     * Output: true
     */
    @Test
    public void validPerfectSquare_test1() {
        val num = 16;
        val output = true;
        val res = isPerfectSquare(num);
        assertEquals(output, res);
    }

    /**
     * Input: num = 14
     * Output: false
     */
    @Test
    public void validPerfectSquare_test2() {
        val num = 14;
        val output = false;
        val res = isPerfectSquare(num);
        assertEquals(output, res);
    }

    abstract boolean isPerfectSquare(int num);
}
