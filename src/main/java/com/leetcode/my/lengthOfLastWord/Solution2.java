package com.leetcode.my.lengthOfLastWord;

class Solution2 {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
