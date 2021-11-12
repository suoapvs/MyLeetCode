package com.leetcode.my.sumOfTwoIntegers;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: a = 1, b = 2
     * Output: 3
     */
    @Test
    public void sumOfTwoIntegers_test1() {
        val a = 1;
        val b = 2;
        val output = 3;
        val res = getSum(a, b);
        assertEquals(output, res);
    }

    /**
     * Input: a = 2, b = 3
     * Output: 5
     */
    @Test
    public void sumOfTwoIntegers_test2() {
        val a = 2;
        val b = 3;
        val output = 5;
        val res = getSum(a, b);
        assertEquals(output, res);
    }

    abstract int getSum(int a, int b);
}
