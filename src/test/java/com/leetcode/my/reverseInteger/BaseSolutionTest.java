package com.leetcode.my.reverseInteger;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: x = 123
     * Output: 321
     */
    @Test
    public void reverseInteger_test1() {
        val x = 123;
        val reverseX = 321;
        reverseIntegerTest(x, reverseX);
    }

    /**
     * Input: x = -123
     * Output: -321
     */
    @Test
    public void reverseInteger_test2() {
        val x = -123;
        val reverseX = -321;
        reverseIntegerTest(x, reverseX);
    }

    /**
     * Input: x = 120
     * Output: 21
     */
    @Test
    public void reverseInteger_test3() {
        val x = 120;
        val reverseX = 21;
        reverseIntegerTest(x, reverseX);
    }

    /**
     * Input: x = 1534236469
     * Output: 21
     */
    @Test
    public void reverseInteger_test4() {
        val x = 1534236469;
        val reverseX = 0;
        reverseIntegerTest(x, reverseX);
    }

    abstract int reverse(int x);

    private void reverseIntegerTest(
            final int x,
            final int exReverseX
    ) {
        val acReverseX = reverse(x);
        assertEquals(exReverseX, acReverseX);
    }
}
