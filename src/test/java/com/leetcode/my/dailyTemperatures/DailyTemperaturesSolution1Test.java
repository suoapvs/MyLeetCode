package com.leetcode.my.dailyTemperatures;

import lombok.experimental.Delegate;

class DailyTemperaturesSolution1Test
        extends BaseSolutionTest {

    @Delegate
    private final Solution1 solution = new Solution1();
}
