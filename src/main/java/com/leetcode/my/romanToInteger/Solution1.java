package com.leetcode.my.romanToInteger;

class Solution1 {

    public int romanToInt(final String roman) {
        if (roman == null || roman.length() == 0) {
            return 0;
        }
        final int[] symbols = new int['X' - 'B']; // {'C', 'D', ..., 'X'}
        symbols['I' - 'C'] = 1;
        symbols['V' - 'C'] = 5;
        symbols['X' - 'C'] = 10;
        symbols['L' - 'C'] = 50;
        symbols[0] = 100; // ['C' - 'C']
        symbols['D' - 'C'] = 500;
        symbols['M' - 'C'] = 1000;
        int result = symbols[roman.charAt(0) - 'C'];
        int prevNum = result;
        for (int i = 1; i < roman.length(); i++) {
            final int currentNum = symbols[roman.charAt(i) - 'C'];
            result += (currentNum > prevNum) ? (currentNum - 2 * prevNum) : currentNum;
            prevNum = currentNum;
        }
        return result;
    }
}
