package com.leetcode.my.implementStrStr;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     */
    @Test
    public void implementStrStr_test1() {
        val haystack = "hello";
        val needle = "ll";
        val expectedIndex = 2;
        implementStrStrTest(haystack, needle, expectedIndex);
    }

    /**
     * Input: haystack = "aaaaa", needle = "bba"
     * Output: -1
     */
    @Test
    public void implementStrStr_test2() {
        val haystack = "aaaaa";
        val needle = "bba";
        val expectedIndex = -1;
        implementStrStrTest(haystack, needle, expectedIndex);
    }

    /**
     * Input: haystack = "aaaaa", needle = ""
     * Output: 0
     */
    @Test
    public void implementStrStr_test3() {
        val haystack = "aaaaa";
        val needle = "";
        val expectedIndex = 0;
        implementStrStrTest(haystack, needle, expectedIndex);
    }

    /**
     * Input: haystack = "qwdqd", needle = "dcdscsdscsscsc"
     * Output: -1
     */
    @Test
    public void implementStrStr_test4() {
        val haystack = "qwdqd";
        val needle = "dcdscsdscsscsc";
        val expectedIndex = -1;
        implementStrStrTest(haystack, needle, expectedIndex);
    }

    /**
     * Input: haystack = "qwdqd", needle = "qwdqd"
     * Output: 0
     */
    @Test
    public void implementStrStr_test5() {
        val haystack = "qwdqd";
        val needle = "qwdqd";
        val expectedIndex = 0;
        implementStrStrTest(haystack, needle, expectedIndex);
    }


    /**
     * Input: haystack = "aaaaa", needle = "bbbbb"
     * Output: -1
     */
    @Test
    public void implementStrStr_test6() {
        val haystack = "aaaaa";
        val needle = "bbbbb";
        val expectedIndex = -1;
        implementStrStrTest(haystack, needle, expectedIndex);
    }

    abstract int strStr(String haystack, String needle);

    private void implementStrStrTest(
            final String haystack,
            final String needle,
            final int expectedIndex
    ) {
        val actualIndex = strStr(haystack, needle);
        assertEquals(expectedIndex, actualIndex);
    }
}
