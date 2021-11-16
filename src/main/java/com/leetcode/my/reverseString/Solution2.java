package com.leetcode.my.reverseString;

class Solution2 {

    public void reverseString(final char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            final char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
}
