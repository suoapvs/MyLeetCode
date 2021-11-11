package com.leetcode.my.integerToRoman;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: num = 3
     * Output: "III"
     */
    @Test
    public void integerToRoman_test1() {
        val num = 3;
        val output = "III";
        val res = intToRoman(num);
        assertEquals(output, res);
    }

    /**
     * Input: num = 4
     * Output: "IV"
     */
    @Test
    public void integerToRoman_test2() {
        val num = 4;
        val output = "IV";
        val res = intToRoman(num);
        assertEquals(output, res);
    }

    /**
     * Input: num = 9
     * Output: "IX"
     */
    @Test
    public void integerToRoman_test3() {
        val num = 9;
        val output = "IX";
        val res = intToRoman(num);
        assertEquals(output, res);
    }

    /**
     * Input: num = 58
     * Output: "LVIII"
     */
    @Test
    public void integerToRoman_test4() {
        val num = 58;
        val output = "LVIII";
        val res = intToRoman(num);
        assertEquals(output, res);
    }

    /**
     * Input: num = 1994
     * Output: "MCMXCIV"
     */
    @Test
    public void integerToRoman_test5() {
        val num = 1994;
        val output = "MCMXCIV";
        val res = intToRoman(num);
        assertEquals(output, res);
    }

    abstract String intToRoman(int num);
}
