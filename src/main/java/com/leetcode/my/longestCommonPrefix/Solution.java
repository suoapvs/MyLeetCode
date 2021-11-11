package com.leetcode.my.longestCommonPrefix;

import java.util.Arrays;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        final String firstStr = strs[0];
        final String lastStr = strs[strs.length - 1];
        int prefixLength = 0;
        while (prefixLength < firstStr.length()) {
            if (firstStr.charAt(prefixLength) == lastStr.charAt(prefixLength)) {
                prefixLength++;
            } else {
                break;
            }
        }
        return (prefixLength > 0) ? firstStr.substring(0, prefixLength) : "";
    }
}
