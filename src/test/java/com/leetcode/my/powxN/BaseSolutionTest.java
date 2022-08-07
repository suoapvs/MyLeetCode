package com.leetcode.my.powxN;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: x = 2.00000, n = 10
     * Output: 1024.00000
     */
    @Test
    public void powxN_test1() {
        val x = 2.00000;
        val n = 10;
        val res = 1024.00000;
        myPowTest(x, n, res);
    }

    /**
     * Input: x = 2.10000, n = 3
     * Output: 9.26100
     */
    @Test
    public void powxN_test2() {
        val x = 2.10000;
        val n = 3;
        val res = 9.26100;
        myPowTest(x, n, res);
    }

    /**
     * Input: x = 2.00000, n = -2
     * Output: 0.25000
     */
    @Test
    public void powxN_test3() {
        val x = 2.00000;
        val n = -2;
        val res = 0.25000;
        myPowTest(x, n, res);
    }

    /**
     * Input: x = 0, n = 2
     * Output: 0
     */
    @Test
    public void powxN_test4() {
        val x = 0;
        val n = 2;
        val res = 0;
        myPowTest(x, n, res);
    }

    /**
     * Input: x = 2.00000, n = 0
     * Output: 1
     */
    @Test
    public void powxN_test5() {
        val x = 2.00000;
        val n = 0;
        val res = 1;
        myPowTest(x, n, res);
    }

    /**
     * Input: x = 2.00000, n = 1
     * Output: 2.00000
     */
    @Test
    public void powxN_test6() {
        val x = 2.00000;
        val n = 1;
        val res = 2.00000;
        myPowTest(x, n, res);
    }

    /**
     * Input: x = 1.00000, n = 2147483648
     * Output: 1.00000
     */
    @Test
    public void powxN_test7() {
        val x = 1.00000;
        val n = 2147483647;
        val res = 1.00000;
        myPowTest(x, n, res);
    }

    /**
     * Input: x = 2.00000, n = -2147483648
     * Output: 0.00000
     */
    @Test
    public void powxN_test8() {
        val x = 2.00000;
        val n = -2147483648;
        val res = 0.00000;
        myPowTest(x, n, res);
    }

    abstract double myPow(double x, int n);

    private void myPowTest(
            final double x,
            final int n,
            final double expectedRes
    ) {
        val actualRes = myPow(x, n);
        assertEquals(expectedRes, actualRes, 0.000001);
    }
}
