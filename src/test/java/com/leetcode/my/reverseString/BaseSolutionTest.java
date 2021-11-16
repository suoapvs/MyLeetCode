package com.leetcode.my.reverseString;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSolutionTest {

    /**
     * Input: s = ['h','e','l','l','o']
     * Output: ['o','l','l','e','h']
     */
    @Test
    public void reverseString_test1() {
        val s = new char[]{'h', 'e', 'l', 'l', 'o'};
        val output = new char[]{'o', 'l', 'l', 'e', 'h'};
        reverseString(s);
        assertArrayEquals(output, s);
    }

    /**
     * Input: s = ['H','a','n','n','a','h']
     * Output: ['h','a','n','n','a','H']
     */
    @Test
    public void reverseString_test2() {
        val s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        val output = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        reverseString(s);
        assertArrayEquals(output, s);
    }

    abstract void reverseString(char[] s);
}
