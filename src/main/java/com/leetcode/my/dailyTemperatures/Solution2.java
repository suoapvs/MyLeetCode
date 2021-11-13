package com.leetcode.my.dailyTemperatures;

class Solution2 {

    public int[] dailyTemperatures(final int[] temperatures) {
        final int[] answer = new int[temperatures.length];
        int maxTemp = 0;
        for (int day = temperatures.length - 1; day >= 0; day--) {
            final int dayTemp = temperatures[day];
            if (dayTemp >= maxTemp) {
                maxTemp = dayTemp;
                continue;
            }
            int nextDays = 1; // next warmer day
            while (temperatures[day + nextDays] <= dayTemp) {
                // Use information from answer to search
                // for the next warmer day
                nextDays += answer[day + nextDays];
            }
            answer[day] = nextDays;
        }
        return answer;
    }
}
