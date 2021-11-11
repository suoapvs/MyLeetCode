package com.leetcode.my.romanToInteger;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: s = "III"
     * Output: 3
     */
    @Test
    public void romanToInteger_test1() {
        val s = "III";
        val output = 3;
        val res= romanToInt(s);
        assertEquals(res, output);
    }

    /**
     * Input: s = "IV"
     * Output: 4
     */
    @Test
    public void romanToInteger_test2() {
        val s = "IV";
        val output = 4;
        val res= romanToInt(s);
        assertEquals(res, output);
    }

    /**
     * Input: s = "IX"
     * Output: 9
     */
    @Test
    public void romanToInteger_test3() {
        val s = "IX";
        val output = 9;
        val res= romanToInt(s);
        assertEquals(res, output);
    }

    /**
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V = 5, III = 3.
     */
    @Test
    public void romanToInteger_test4() {
        val s = "LVIII";
        val output = 58;
        val res= romanToInt(s);
        assertEquals(res, output);
    }

    /**
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    @Test
    public void romanToInteger_test5() {
        val s = "MCMXCIV";
        val output = 1994;
        val res= romanToInt(s);
        assertEquals(res, output);
    }

    abstract int romanToInt(String roman);
}
