package com.leetcode.my.addBinary;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: a = "11", b = "1"
     * Output: "100"
     */
    @Test
    public void addBinary_test1() {
        val a = "11";
        val b = "1";
        val res = "100";
        addBinaryTest(a, b, res);
    }

    /**
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     */
    @Test
    public void addBinary_test2() {
        val a = "1010";
        val b = "1011";
        val res = "10101";
        addBinaryTest(a, b, res);
    }

    abstract String addBinary(String a, String b);

    private void addBinaryTest(
            final String a,
            final String b,
            final String exRes
    ) {
        val acRes = addBinary(a, b);
        assertEquals(exRes, acRes);
    }
}
