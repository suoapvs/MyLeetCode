package com.leetcode.my.implementStrStr;

class Solution {

    public int strStr(final String haystack, final String needle) {
        final int needleLength = needle.length();
        if (needleLength == 0) {
            return 0;
        }
        final int haystackLength = haystack.length();
        if (needleLength > haystackLength) {
            return -1;
        }
        if (needleLength == haystackLength) {
            return haystack.equals(needle) ? 0 : -1;
        }

        int i = 0;
        int j = 0;
        while (i < needleLength && j < haystackLength) {
            if (needle.charAt(i) == haystack.charAt(j)) {
                i++;
                j++;
                if (i == needleLength) {
                    return j - needleLength;
                }
            } else {
                j = j - i + 1; // backtrack to last pos+1 where there was a probable match
                i = 0;
            }
        }
        return -1;
    }
}
