package com.leetcode.my.multiplyStrings;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: num1 = "2", num2 = "3"
     * Output: "6"
     */
    @Test
    public void multiplyStrings_test1() {
        val num1 = "2";
        val num2 = "3";
        val output = "6";
        val res = multiply(num1, num2);
        assertEquals(output, res);
    }

    /**
     * Input: num1 = "123", num2 = "456"
     * Output: "56088"
     */
    @Test
    public void multiplyStrings_test2() {
        val num1 = "123";
        val num2 = "456";
        val output = "56088";
        val res = multiply(num1, num2);
        assertEquals(output, res);
    }

    abstract String multiply(String num1, String num2);
}
