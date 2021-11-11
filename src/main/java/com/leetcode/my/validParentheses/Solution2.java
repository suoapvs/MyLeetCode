package com.leetcode.my.validParentheses;

class Solution2 {

    public boolean isValid(String s) {
        final char[] stack = new char[s.length()];
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    idx++;
                    stack[idx] = (s.charAt(i));
                    break;
                case ')':
                    if (idx < 0) {
                        return false;
                    }
                    if (stack[idx] != '(') {
                        return false;
                    } else {
                        stack[idx] = 0;
                        idx--;
                    }
                    break;
                case '}':
                    if (idx < 0) {
                        return false;
                    }
                    if (stack[idx] != '{') {
                        return false;
                    } else {
                        stack[idx] = 0;
                        idx--;
                    }
                    break;
                case ']':
                    if (idx < 0) {
                        return false;
                    }
                    if (stack[idx] != '[') {
                        return false;
                    } else {
                        stack[idx] = 0;
                        idx--;
                    }
                    break;
            }
        }
        return idx < 0;
    }
}
