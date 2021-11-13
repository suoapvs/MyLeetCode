package com.leetcode.my.dailyTemperatures;

import lombok.experimental.Delegate;

class DailyTemperaturesSolution2Test
        extends BaseSolutionTest {

    @Delegate
    private final Solution2 solution = new Solution2();
}
