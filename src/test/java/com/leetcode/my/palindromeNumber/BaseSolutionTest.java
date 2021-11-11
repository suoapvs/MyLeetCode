package com.leetcode.my.palindromeNumber;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: x = 121
     * Output: true
     */
    @Test
    public void isPalindrome_test1() {
        val x = 121;
        val output = true;
        val res = isPalindrome(x);
        assertEquals(output, res);
    }

    /**
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121.
     * From right to left, it becomes 121-.
     * Therefore it is not a palindrome.
     */
    @Test
    public void isPalindrome_test2() {
        val x = -121;
        val output = false;
        val res = isPalindrome(x);
        assertEquals(output, res);
    }


    /**
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left.
     * Therefore it is not a palindrome.
     */
    @Test
    public void isPalindrome_test3() {
        val x = 10;
        val output = false;
        val res = isPalindrome(x);
        assertEquals(output, res);
    }

    /**
     * Input: x = -101
     * Output: false
     */
    @Test
    public void isPalindrome_test4() {
        val x = -101;
        val output = false;
        val res = isPalindrome(x);
        assertEquals(output, res);
    }

    abstract boolean isPalindrome(int x);
}
