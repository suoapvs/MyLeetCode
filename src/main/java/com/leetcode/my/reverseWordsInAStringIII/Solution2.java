package com.leetcode.my.reverseWordsInAStringIII;

class Solution2 {

    public String reverseWords(final String s) {
        final char[] chars = s.toCharArray();
        int i = 0;
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == ' ') {
                reverse(chars, i, j - 1);
                i = j + 1;
            }
        }
        reverse(chars, i, chars.length - 1);
        return new String(chars);
    }

    private void reverse(final char[] s, int i, int j) {
        while (i < j) {
            final char tmp = s[i];
            s[i++] = s[j];
            s[j--] = tmp;
        }
    }
}
