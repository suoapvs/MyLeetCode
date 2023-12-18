package com.leetcode.my.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int lengthOfLongestSubstring(final String s) {
        final int n = s.length();
        int maxLength = 0;
        final Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int start = 0, end = 0; end < n; end++) {
            final char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // Move the start pointer to the right of the previous occurrence
                // or stay at the current start position if it's already ahead
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            // Update the index of the current character
            charIndexMap.put(currentChar, end);

            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
