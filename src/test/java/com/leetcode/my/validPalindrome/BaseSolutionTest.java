package com.leetcode.my.validPalindrome;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     */
    @Test
    public void validPalindrome_test1() {
        val s = "A man, a plan, a canal: Panama";
        val output = true;
        val res = isPalindrome(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     */
    @Test
    public void validPalindrome_test2() {
        val s = "race a car";
        val output = false;
        val res = isPalindrome(s);
        assertEquals(output, res);
    }

    /**
     * Input: s = " "
     * Output: true
     * Explanation: s is an empty string "" after removing
     * non-alphanumeric characters.
     * Since an empty string reads the same forward and backward,
     * it is a palindrome.
     */
    @Test
    public void validPalindrome_test3() {
        val s = " ";
        val output = true;
        val res = isPalindrome(s);
        assertEquals(output, res);
    }

    abstract boolean isPalindrome(String s);
}
