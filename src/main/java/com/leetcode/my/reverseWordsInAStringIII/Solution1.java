package com.leetcode.my.reverseWordsInAStringIII;

public class Solution1 {

    public String reverseWords(final String s) {
        int firstIndex, lastIndex;
        char[] chars = s.toCharArray(); // converting the string into it's corresponding character array
        for (int index = 0; index < chars.length; index++) {
            firstIndex = index; // store the first index of word
            // iterate until space is found i.e. to get the last index of the word
            do {
                ++index;
            } while (index < chars.length && chars[index] != ' ');
            lastIndex = index - 1; // store the last index of the word
            reverse(chars, firstIndex, lastIndex);
        }
        return new String(chars); // convert the character into string and return it
    }

    private void reverse(final char[] s, int i, int j) {
        while (i < j) {
            final char tmp = s[i];
            s[i++] = s[j];
            s[j--] = tmp;
        }
    }
}
