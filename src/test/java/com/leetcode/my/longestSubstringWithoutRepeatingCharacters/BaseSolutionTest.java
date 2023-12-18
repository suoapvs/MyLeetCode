package com.leetcode.my.longestSubstringWithoutRepeatingCharacters;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: s = "abcabcbb"
     * Output: 3
     */
    @Test
    public void lengthOfLongestSubstring_test1() {
        val s = "abcabcbb";
        val output = 3;
        val res = lengthOfLongestSubstring(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "bbbbb"
     * Output: 1
     */
    @Test
    public void lengthOfLongestSubstring_test2() {
        val s = "bbbbb";
        val output = 1;
        val res = lengthOfLongestSubstring(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "pwwkew"
     * Output: 3
     */
    @Test
    public void lengthOfLongestSubstring_test3() {
        val s = "pwwkew";
        val output = 3;
        val res = lengthOfLongestSubstring(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "dvdf"
     * Output: 3
     */
    @Test
    public void lengthOfLongestSubstring_test4() {
        val s = "dvdf";
        val output = 3;
        val res = lengthOfLongestSubstring(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "abcde"
     * Output: 5
     */
    @Test
    public void lengthOfLongestSubstring_test5() {
        val s = "abcde";
        val output = 5;
        val res = lengthOfLongestSubstring(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "tmmzuxt"
     * Output: 5
     */
    @Test
    public void lengthOfLongestSubstring_test6() {
        val s = "tmmzuxt";
        val output = 5;
        val res = lengthOfLongestSubstring(s);
        assertEquals(output, res);
    }

    abstract int lengthOfLongestSubstring(String s);
}
