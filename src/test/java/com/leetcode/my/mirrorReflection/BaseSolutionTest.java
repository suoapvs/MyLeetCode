package com.leetcode.my.mirrorReflection;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: p = 2, q = 1
     * Output: 2
     */
    @Test
    public void mirrorReflection_test1() {
        val p = 2;
        val q = 1;
        val res = 2;
        mirrorReflectionTest(p, q, res);
    }

    /**
     * Input: p = 3, q = 1
     * Output: 1
     */
    @Test
    public void mirrorReflection_test2() {
        val p = 3;
        val q = 1;
        val res = 1;
        mirrorReflectionTest(p, q, res);
    }

    abstract int mirrorReflection(int p, int q);

    private void mirrorReflectionTest(
            final int p,
            final int q,
            final int exRes
    ) {
        val acRes = mirrorReflection(p, q);
        assertEquals(exRes, acRes);
    }
}
