package com.leetcode.my.validPalindrome;

class Solution1 {

    public boolean isPalindrome(final String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (isAlphaNumeric(s.charAt(i))) {
                if (isAlphaNumeric(s.charAt(j))){
                    if (!equalsIgnoreCase(s.charAt(i), s.charAt(j))){
                        return false;
                    }
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }
        return true;
    }

    private static boolean isAlphaNumeric(final char c) {
        return ((c >= '0') && (c <= '9'))
                || ((c >= 'A') && (c <= 'Z'))
                || ((c >= 'a') && (c <= 'z'));
    }

    private static boolean equalsIgnoreCase(
            final char a,
            final char b
    ) {
        return toLowerCase(a) == toLowerCase(b);
    }

    private static char toLowerCase(final char c) {
        return (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
    }
}
