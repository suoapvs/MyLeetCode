package com.leetcode.my.validPalindrome;

public class Solution2 {

    public boolean isPalindrome(final String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            // skip non-alphanumeric characters at left
            while (i < j && isNonAlphaNumeric(s.charAt(i))) {
                i++;
            }
            // skip non-alphanumeric characters at right
            while (i < j && isNonAlphaNumeric(s.charAt(j))) {
                j--;
            }
            // compare chars at the two pointers
            if (!equalsIgnoreCase(s.charAt(i), s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isNonAlphaNumeric(final char c) {
        return ((c < '0') || (c > '9'))
                && ((c < 'A') || (c > 'Z'))
                && ((c < 'a') || (c > 'z'));
    }

    private static boolean equalsIgnoreCase(
            final char a,
            final char b
    ) {
        return toLowerCase(a) == toLowerCase(b);
    }

    private static char toLowerCase(final char c) {
        return (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
    }
}
