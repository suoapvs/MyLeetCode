package com.leetcode.my.longestCommonPrefix;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     */
    @Test
    public void longestCommonPrefix_test1() {
        val strs = new String[]{"flower","flow","flight"};
        val output = "fl";
        val res = longestCommonPrefix(strs);
        assertEquals(output, res);
    }

    /**
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */
    @Test
    public void longestCommonPrefix_test2() {
        val strs = new String[]{"dog","racecar","car"};
        val output = "";
        val res = longestCommonPrefix(strs);
        assertEquals(output, res);
    }

    abstract String longestCommonPrefix(String[] strs);
}
