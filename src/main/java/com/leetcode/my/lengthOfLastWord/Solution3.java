package com.leetcode.my.lengthOfLastWord;

class Solution3 {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else { // it's a white space instead
                break;
            }
        }
        return length;
    }
}
