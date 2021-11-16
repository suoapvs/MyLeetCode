package com.leetcode.my.reverseWordsInAStringIII;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: s = "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     */
    @Test
    public void reverseWordsInAStringIII_test1() {
        val s = "Let's take LeetCode contest";
        val output = "s'teL ekat edoCteeL tsetnoc";
        val res = reverseWords(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "God Ding"
     * Output: "doG gniD"
     */
    @Test
    public void reverseWordsInAStringIII_test2() {
        val s = "God Ding";
        val output = "doG gniD";
        val res = reverseWords(s);
        assertEquals(output, res);
    }

    abstract String reverseWords(String s);
}
