package com.leetcode.my.reverseString;

class Solution1 {

    public void reverseString(final char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            final char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
