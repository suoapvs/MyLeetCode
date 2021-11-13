package com.leetcode.my.dailyTemperatures;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSolutionTest {

    /**
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     */
    @Test
    public void dailyTemperatures_test1() {
        val temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        val output = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        val res = dailyTemperatures(temperatures);
        assertArrayEquals(output, res);
    }

    /**
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     */
    @Test
    public void dailyTemperatures_test2() {
        val temperatures = new int[]{30, 40, 50, 60};
        val output = new int[]{1, 1, 1, 0};
        val res = dailyTemperatures(temperatures);
        assertArrayEquals(output, res);
    }

    /**
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    @Test
    public void dailyTemperatures_test3() {
        val temperatures = new int[]{30, 60, 90};
        val output = new int[]{1, 1, 0};
        val res = dailyTemperatures(temperatures);
        assertArrayEquals(output, res);
    }

    abstract int[] dailyTemperatures(int[] temperatures);
}
