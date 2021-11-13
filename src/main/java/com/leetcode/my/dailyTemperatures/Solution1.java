package com.leetcode.my.dailyTemperatures;

class Solution1 {

    public int[] dailyTemperatures(final int[] temperatures) {
        final int[] answer = new int[temperatures.length];
        for (int day = temperatures.length - 1; day >= 0; day--) {
            for (int i = day - 1; i >= 0; i--) {
                if (temperatures[i] >= temperatures[day]) {
                    break;
                }
                answer[i] = day - i;
            }
        }
        return answer;
    }
}
