package com.leetcode.my.lengthOfLastWord;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     */
    @Test
    public void lengthOfLastWord_test1() {
        val s = "Hello World";
        val length = 5;
        lengthOfLastWordTest(s, length);
    }

    /**
     * Input: s = "   fly me   to   the moon  "
     * Output: 4
     * Explanation: The last word is "moon" with length 4.
     */
    @Test
    public void lengthOfLastWord_test2() {
        val s = "   fly me   to   the moon  ";
        val length = 4;
        lengthOfLastWordTest(s, length);
    }

    /**
     * Input: s = "luffy is still joyboy"
     * Output: 6
     * Explanation: The last word is "joyboy" with length 6.
     */
    @Test
    public void lengthOfLastWord_test3() {
        val s = "luffy is still joyboy";
        val length = 6;
        lengthOfLastWordTest(s, length);
    }

    abstract int lengthOfLastWord(String s);

    private void lengthOfLastWordTest(
            final String s,
            final int expectedLength
    ) {
        val actualLength = lengthOfLastWord(s);
        assertEquals(expectedLength, actualLength);
    }
}
