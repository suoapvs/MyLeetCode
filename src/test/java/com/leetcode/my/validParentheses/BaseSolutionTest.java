package com.leetcode.my.validParentheses;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: s = "()"
     * Output: true
     */
    @Test
    public void validParentheses_test1() {
        val s = "()";
        val output = true;
        val res = isValid(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "()[]{}"
     * Output: true
     */
    @Test
    public void validParentheses_test2() {
        val s = "()[]{}";
        val output = true;
        val res = isValid(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "(]"
     * Output: false
     */
    @Test
    public void validParentheses_test3() {
        val s = "(]";
        val output = false;
        val res = isValid(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "([)]"
     * Output: false
     */
    @Test
    public void validParentheses_test4() {
        val s = "([)]";
        val output = false;
        val res = isValid(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "{[]}"
     * Output: true
     */
    @Test
    public void validParentheses_test5() {
        val s = "{[]}";
        val output = true;
        val res = isValid(s);
        assertEquals(output, res);
    }

    abstract boolean isValid(String s);
}
