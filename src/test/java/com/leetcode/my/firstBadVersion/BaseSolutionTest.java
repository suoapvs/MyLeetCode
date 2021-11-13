package com.leetcode.my.firstBadVersion;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: n = 5, bad = 4
     * Output: 4
     * Explanation:
     * call isBadVersion(3) -> false
     * call isBadVersion(5) -> true
     * call isBadVersion(4) -> true
     * Then 4 is the first bad version.
     */
    @Test
    public void firstBadVersion_test1() {
        val n = 5;
        val bad = 4;
        val output = 4;
        setBadVersion(bad);
        val res = firstBadVersion(n);
        assertEquals(output, res);
    }

    /**
     * Input: n = 1, bad = 1
     * Output: 1
     */
    @Test
    public void firstBadVersion_test2() {
        val n = 1;
        val bad = 1;
        val output = 1;
        setBadVersion(bad);
        val res = firstBadVersion(n);
        assertEquals(output, res);
    }

    abstract int firstBadVersion(int n);

    abstract void setBadVersion(int version);
}
